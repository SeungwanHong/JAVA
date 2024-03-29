package ojdbcpackage;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OjdbcTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		final String DB_USER = "scott";
		final String DB_PASSWORD = "tiger";
		
		Connection conn = null;
		PreparedStatement pstate = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("라이브러리 로드 성공");
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			System.out.println("연결 성공");
			//1)
//			System.out.println("검색할 이름 철자 입력 : ");
//			str = sc.nextLine();
//			String sql = "select * "
//						+"from emp "
//						+"where emp.ename like ?";
//			pstate = conn.prepareStatement(sql);
//			
//			pstate.setString(1, "%"+str+"%");
//			rs = pstate.executeQuery();
//			while(rs.next()){
//				String empno = rs.getString("EMPNO");
//				String ename = rs.getString("ENAME");
//				
//				System.out.println(empno+"/"+ename);
//			}
			
			//2)
//			System.out.println("검색할 부서코드 입력 (10,20,30): ");
//			str = sc.nextLine();
//			String sql = "select e.empno, e.ename, d.LOC "
//					+ "from emp e,dept d "
//					+ "where e.DEPTNO = d.DEPTNO "
//					+ "and d.DEPTNO = ?";
//			pstate = conn.prepareStatement(sql);
//			
//			pstate.setString(1, str);
//			rs = pstate.executeQuery();
//			while(rs.next()){
//				String empno = rs.getString("EMPNO");
//				String ename = rs.getString("ENAME");
//				String loc = rs.getString("LOC");
//				
//				System.out.println(empno+"/"+ename+"/"+loc);
//			}
//			//3)
//			System.out.println("검색할 부서코드 입력 (10,20,30): ");
//			str = sc.nextLine();
//			String sql = "select * "
//					+ "from emp "
//					+ "where sal in(select max(sal) "
//					+ "from emp "
//					+ "where deptno =? "
//					+ "group by job)";
//			pstate = conn.prepareStatement(sql);
//			
//			pstate.setString(1, str);
//			rs = pstate.executeQuery();
//			while(rs.next()){
//				String empno = rs.getString("EMPNO");
//				String ename = rs.getString("ENAME");
//				int sal = rs.getInt("SAL");
//				
//				System.out.println(empno+"/"+ename+"/"+sal);
//			}
			//4)
//			System.out.println("인원수 입력: ");
//			str = sc.nextLine();
//			String sql = 
//					"select count(deptno) as cnt, deptno, sum(sal) as sal "
//					+ "from emp "
//					+ "group by deptno "
//					+ "having count(deptno) > ?";
//			pstate = conn.prepareStatement(sql);
//			
//			pstate.setString(1, str);
//			rs = pstate.executeQuery();
//			while(rs.next()){
//				int cnt = rs.getInt("CNT");
//				int deptno = rs.getInt("DEPTNO");
//				int sal = rs.getInt("SAL");
//				
//				System.out.println(cnt+"/"+deptno+"/"+sal);
//			}
			//5)
//			System.out.println("이름 입력: ");
//			str = sc.nextLine();
//			String sql = 
//					"select deptno, ename, deptno "
//					+ "from emp "
//					+ "where emp.sal>(select avgs.avgsal "
//					+ "                from (select round(avg(sal),2) as avgsal, deptno "
//					+ "                      from emp "
//					+ "                      group by deptno "
//					+ "                      ) avgs, "
//					+ "                      (select * "
//					+ "                       from emp "
//					+ "                       where emp.ename='MILLER' "
//					+ "                       )nameing "
//					+ "                where nameing.deptno = avgs.deptno)";
//			
//			pstate = conn.prepareStatement(sql);
//			
//			pstate.setString(1, str);
//			rs = pstate.executeQuery();
//			while(rs.next()){
//				String empno = rs.getString("EMPNO");
//				String ename = rs.getString("ENAME");
//				String deptno = rs.getString("DEPTNO");
//				
//				System.out.println(empno+"/"+deptno+"/"+deptno);
//			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("라이브러리 로드 실패");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("sql 문제");
		}
	}

}
