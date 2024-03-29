/*ojdbc 드래그
프로젝트 폴더
카피
프로젝트 폴더 설정
java Build path
라이브러리스 탭
Add JAR
ojdbc6.jar

order and export 탭
ojdbc 채크 어플라이 오케이
*/
package ojdbcpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OjdbcTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String DB_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		final String DB_user = "scott";
		final String DB_password = "tiger";

		Connection conn = null;							//jdbc의 정보를 가지는 인터페이스
		PreparedStatement pstmt = null;			//sql을 미리 준비 시키고
																				//실행시에 매개변수를 받아 사용하는 방시
																				//쿼리 실행 후 해당 쿼리의 결과물을 받아올 수 있다.

		ResultSet rs = null;								//statement의 쿼리 실행 결과를 받아서
																				//가지고올 수 있게 해주는 객체
																				//컬럼정보 및  row 정보를 cursor를 이용해 관리한다.

		try{
			//라이브러리를 활용할 클래스를 로딩(필수
			//jdbc를 활용하기 전에 반드시 해야한다.
			//한번만 해주면 된다.
			//라이브러리가 제대로 로드가 되지 않으면 classNotFoundException 예외 발생
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("라이브러리 로드 완료");

			//연결정보를 가지고 실제 데이터베이스에 접속
			//연결정보 및 쿼리 실행을 알 수 있는 Connetion 인터페이스의 구현 객체가 리턴된다.
			conn = DriverManager.getConnection(DB_url,DB_user,DB_password);
			System.out.println("접속 성공");

			String sql ="SELECT * FROM EMP";			//sql 문장(쿼리부분)
			pstmt = conn.prepareStatement(sql);		//preparedStatement에 쿼리 등록

			rs = pstmt.executeQuery();						//쿼리 실행 후 resultSet 형태로 리턴

			//resultSet에 들어있는 쿼리 실행결과를 컬럼명을 이용하여 데이터 빼내기
			//re.next()가 작동 할 때마다 Cusor가 움지이다가 더이상 빼내올 데이터가 없으면 false리턴
			while(rs.next()){
				String empno = rs.getString("EMPNO");
				String ename = rs.getString("ENAME");
				int sal = rs.getInt("SAL");
				System.out.println("사번  : "+empno+" 이름 : "+ename+" 급여 : "+sal);

			}
			rs.close();
			pstmt.close();
			conn.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("라이브러리 로드 실패");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("접속 실패");
		}
	}

}
