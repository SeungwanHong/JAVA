import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class main01 {
	
	final static int WRITE = 1;
	final static int CHECK = 2;
	final static int JOIN = 3;
	final static int EXIT = 4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		final String DB_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		final String DB_user = "hsw";
		final String DB_password = "hsw";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("라이브러리 로드 완료");

			conn = DriverManager.getConnection(DB_url,DB_user,DB_password);
			System.out.println("접속 성공");
			
			
			while(menu != EXIT){
				System.out.println("1. 게시글 작성 /2. 게시글 확인/ 3.회원가입 /4. 종료");
				menu = sc.nextInt();
				sc.nextLine();
				switch(menu){
				case WRITE:
					System.out.println("게시글 작성 ");
					String title;
					String contents;
					System.out.print("제목 : ");
					title = sc.nextLine();
					System.out.print("내용: ");
					contents = sc.nextLine();
					//쿼리 처리 insert
					sql ="INSERT INTO TB_BOARD_DEMO(BINDX,TITLE,CONTENTS,USERID,WRITEDATE,MODDATE) "
							+ "VALUES(BOARD_SEQ.NEXTVAL,?,?,'test2',SYSDATE,SYSDATE)";
						
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, title);
					pstmt.setString(2, contents);
					//예외 처리
					if(pstmt.executeUpdate()==1){
						System.out.println("작성완료");
					}else{
						System.out.println("작성안됨");
					}
					break;
				case CHECK:
					System.out.println("게시글 확인 ");
					//쿼리 처리 select
					sql ="SELECT * "
						+ "FROM TB_BOARD_DEMO "
						+ "where userid ='test2'";
					
					pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery();
					while(rs.next()){
						String bindx = rs.getString("BINDX");
						String chktitle = rs.getString("TITLE");
						String chkcontents = rs.getString("CONTENTS");
						String wdate = rs.getString("WRITEDATE");
						String mdate = rs.getString("MODDATE");
						int cnt = rs.getInt("HITCNT");
						System.out.println(bindx+"/"+chktitle+"/"+chkcontents+"/"+wdate+"/"+mdate+"/"+cnt);
					}
					//cnt ++
					
					break;
				case JOIN:
					System.out.println("회원가입");
					String userid;
					String userpw;
					String username;
					String email;
					System.out.print("id : ");
					userid = sc.nextLine();
					System.out.print("password: ");
					userpw = sc.nextLine();
					System.out.print("username : ");
					username = sc.nextLine();
					System.out.print("email: ");
					email = sc.nextLine();
					//쿼리 처리 insert
					sql ="INSERT INTO TB_USER(USERID,USERPW,USERNAME,EMAIL,JOINDATE) "
							+ "VALUES(?,?,?,?,SYSDATE)";
						
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, userid);
					pstmt.setString(2, userpw);
					pstmt.setString(3, username);
					pstmt.setString(4, email);
					//예외 처리
					if(pstmt.executeUpdate()==1){
						System.out.println("가입 성공");
					}else{
						System.out.println("가입 실패");
					}
					break;
				case EXIT:
					System.out.println("종료 ");
					rs.close();
					pstmt.close();
					conn.close();
					break;
				}
			}
			
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("라이브러리 로드 실패");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("접속 실패");
		}
		
		
	}

}
