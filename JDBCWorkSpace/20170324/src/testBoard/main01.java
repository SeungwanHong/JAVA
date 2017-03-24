package testBoard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import testBoard.interDB.DBConnect;
import testBoard.interDB.SQLSend;
import testBoard.interDB.impl.DBConnector;
import testBoard.interDB.impl.SQLSender;

public class main01 {

	final static int WRITE = 1;
	final static int CHECK = 2;
	final static int LOGIN = 1;
	final static int JOIN = 2;
	final static int EXIT = 3;
	static String ID;

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DBConnect db = new DBConnector();
		Scanner sc = new Scanner(System.in);
		
		db.dbConnect();
		SQLSend query = new SQLSender(db.getConn(), db.getPstmt());
		
		ResultSet rs = null;
		int lgmenu = 0;
		int bdmenu = 0;
		boolean boardin = false;
		String id;
		String pw;
		String userid;
		String userpw;
		String chuserpw;
		String username;
		String email;
		
		while (lgmenu != EXIT) {
			System.out.println("1) 로그인 2) 회원가입 3) 종료");
			lgmenu = sc.nextInt();
			sc.nextLine();
			switch (lgmenu) {
			case LOGIN:
				// login 성공
				System.out.println("아이디 : ");
				id = sc.nextLine();
				System.out.println("패스워드 : ");
				pw = sc.nextLine();
				if(query.signInCheck(id, pw)){
					boardin = true;
				}else{
					System.out.println("로그인 실패");
					boardin = false;
				}
				break;
			case JOIN:
				System.out.println("회원가입");
				System.out.print("id : ");
				userid = sc.nextLine();
				System.out.print("password: ");
				userpw = sc.nextLine();
				System.out.print("비밀번호 확인: ");
				chuserpw = sc.nextLine();
				System.out.print("username : ");
				username = sc.nextLine();
				System.out.print("email: ");
				email = sc.nextLine();
				if (userpw.equals(chuserpw)){
					query.signUp(userid, userpw, username, email);
				}else{
					System.out.println("패스워드가 같지 않습니다.");
				}
				break;
			case EXIT:
				break;
			}
			while (boardin) {
				System.out.println("1. 게시글 작성 /2. 게시글 확인/ 3. 종료");
				bdmenu = sc.nextInt();
				sc.nextLine();
				switch (bdmenu) {
				case WRITE:
					break;
				case CHECK:
					break;
				case EXIT:
					boardin=false;
					break;
				}
			}
		}
//		System.out.println(1);
//		query.signUp("test502", "test55", "test", "test2@321.321");
//		System.out.println(2);
		db.dbClose();

	}

}
