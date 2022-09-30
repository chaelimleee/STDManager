package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAO {
	
	static { 
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	private static StudentDAO dao=null;
	public static StudentDAO getInstance() {
		if(dao==null)dao=new StudentDAO();
		return dao;
	}
	
	public Connection getConnection() {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection con=null;
		try {
			con=DriverManager.getConnection(url,"student","1234");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
			System.exit(0);
		}
		return con;
	}

	public void close(Connection con,PreparedStatement pstmt) {
		try {
			if(pstmt!=null) pstmt.close();
			if(con!=null) con.close();
		} catch (SQLException e) {
			System.out.println("오류");
		}
	}
	public void close(Connection con,PreparedStatement pstmt,ResultSet rs) {
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(con!=null) con.close();
		} catch (SQLException e) {
			System.out.println("오류");
		}
	}
}
	