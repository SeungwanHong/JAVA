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

		Connection conn = null;					//jdbc�� ������ ������ �������̽�
		PreparedStatement pstmt = null;			//sql�� �̸� �غ� ��Ű��
												//����ÿ� �Ű������� �޾� ����ϴ� ���
												//���� ���� �� �ش� ������ ������� �޾ƿ� �� �ִ�.
		
		ResultSet rs = null;					//statement�� ���� ���� ����� �޾Ƽ�
												//�������� �� �ְ� ���ִ� ��ü
												//�÷����� ��  row ������ cursor�� �̿��� �����Ѵ�.
		
		try{
			//���̺귯���� Ȱ���� Ŭ������ �ε�(�ʼ�
			//jdbc�� Ȱ���ϱ� ���� �ݵ�� �ؾ��Ѵ�.
			//�ѹ��� ���ָ� �ȴ�.
			//���̺귯���� ����� �ε尡 ���� ������ classNotFoundException ���� �߻�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("���̺귯�� �ε� �Ϸ�");
			
			//���������� ������ ���� �����ͺ��̽��� ����
			//�������� �� ���� ������ �� �� �ִ� Connetion �������̽��� ���� ��ü�� ���ϵȴ�.
			conn = DriverManager.getConnection(DB_url,DB_user,DB_password);
			System.out.println("���� ����");
			
			String sql ="SELECT * FROM EMP";		//sql ����(�����κ�)
			pstmt = conn.prepareStatement(sql);		//preparedStatement�� ���� ���
			
			rs = pstmt.executeQuery();				//���� ���� �� resultSet ���·� ����
			
			//resultSet�� ����ִ� ���� �������� �÷����� �̿��Ͽ� ������ ������
			//re.next()�� �۵� �� ������ Cusor�� �����̴ٰ� ���̻� ������ �����Ͱ� ������ false����
			while(rs.next()){
				String empno = rs.getString("EMPNO");
				String ename = rs.getString("ENAME");
				int sal = rs.getInt("SAL");
				System.out.println("���  : "+empno+" �̸� : "+ename+" �޿� : "+sal);
				
			}
			rs.close();
			pstmt.close();
			conn.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("���̺귯�� �ε� ����");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("���� ����");
		}
	}

}