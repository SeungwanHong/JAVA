package ojdbcpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OjdbcTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String DB_URL ="jdbc:oracle:thin:@localhost:1521:orcl";
		final String DB_USER = "scott";
		final String DB_PASSWORD="tiger";
		
		Connection conn = null;
		PreparedStatement pstate= null;
		ResultSet rs = null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("���̺귯�� �ε� �Ϸ�");
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			System.out.println("���Ӽ���");
			
			String sql = "SELECT * FROM EMP WHERE DEPTNO=? AND SAL>?";
			pstate = conn.prepareStatement(sql);
			
			pstate.setString(1, "20");
			pstate.setString(2, "1000");
			rs = pstate.executeQuery();
			
			while(rs.next()){
				String empno = rs.getString("EMPNO");
				String ename = rs.getString("ENAME");
				System.out.println("�μ���ȣ : [" + empno + "] ��� �̸� : ["+ename+"]");

			}
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("���̺귯�� �ε� ����");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("���ӽ���");
		}

	}

}