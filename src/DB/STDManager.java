package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import Admin.AdminVO;
import Attendance.AttendanceVO;

public class STDManager {

	static Connection connection = null;
	Statement stmt=null;
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
private static STDManager stdManager= null;
	
	public static STDManager getInstance() throws SQLException {
		if(stdManager==null) stdManager = new STDManager();
		return stdManager;
	}	
	
	public Connection getCon() {
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "STDMANAGER", "1234");
		} catch (SQLException e) {
			e.printStackTrace();System.out.println("DB연결 실패!");
		}
		return connection;
	}
	
	public void close(Connection c, Statement s) {
		try {
			if(s!=null)s.close();
			if(c!=null)c.close();
		} catch (SQLException e) {
			System.out.println("con,pstmt close error!");
		}
	}
	public void close(Connection c, Statement s,ResultSet r) {
		try {
			if(r!=null)r.close();
			if(s!=null)s.close();
			if(c!=null)c.close();
		} catch (SQLException e) {
			System.out.println("con,pstmt,rs close error!");
		}
	}
	//sql 실행
	public int run(String sql) {
		int result=0;
		connection = getCon();
		try {
			stmt = connection.createStatement();
			result=stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close(connection,stmt);
		return result;
	}
	
	public boolean selectAdmin(String sql) {
		boolean result = false;
		connection = getCon();
		ResultSet rs = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
