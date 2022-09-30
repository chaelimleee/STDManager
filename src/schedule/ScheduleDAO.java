package schedule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ScheduleDAO {
	
	Connection con = null;
	PreparedStatement pstmt = null;
	
	static{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	private static ScheduleDAO dao = null;
	public static ScheduleDAO getInstance() {
		if(dao == null) {	dao = new ScheduleDAO() ;}
		return dao;
	}
	
	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			con = DriverManager.getConnection(url, "scchedule", "1234");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		return con;
	}
	
	public void close(Connection c, PreparedStatement p ) {
			try {
				if(c!=null)c.close();
				if(p!=null)p.close();
			} catch (SQLException e) {
				System.out.println("close 오류!!");
				e.printStackTrace();
			}
			
	}
	
	public void close(Connection c, PreparedStatement p ,ResultSet r) {
			try {
				if(c!=null)c.close();
				if(p!=null)p.close();
				if(r!=null)r.close();
			} catch (SQLException e) {
				System.out.println("close 오류!!");
				e.printStackTrace();
			}
	}
	
}
