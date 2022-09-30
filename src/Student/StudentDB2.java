package Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import Student.StudentVO;

public class StudentDB2 {
	
	Vector<StudentVO> vec = new Vector<>();
	StudentVO vo;
	StudentDAO dao;
	//--------모두 조회
	public void selectStudent() {
		Connection con = null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			
			String sql=("select * from Student order by studentid");
			con = dao.getConnection();
			pstmt = con.prepareStatement(sql);
			while(rs.next()) {
				int studentid = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String sex = rs.getString(4);
				String phone = rs.getString(5);
				String addr = rs.getString(6);
				String memo = rs.getString(7);
				int restday = rs.getInt(8);
				int penalty = rs.getInt(9);
				int startCareDay = rs.getInt(10);
				int endCareDay = rs.getInt(11);
				dao = new StudentDAO();
				
				System.out.println(dao.toString());
				vec.add(vo);
			}
			rs.close();
			con.close();
		}catch(SQLException e) {

		}
		
	}
//	--- 이름, 번호로 조회
	public void selectStudentname(String Name,String Phone) {
		Connection con = null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			String sql=("select * from Student where name like '%"+Name+"%' and phone = '"+Phone+"'");
			con = dao.getConnection();
			pstmt = con.prepareStatement(sql);
			while(rs.next()) {
				pstmt.setString(1, Name);
				pstmt.setString(2, Phone);
				dao = new StudentDAO();
				
				System.out.println(dao.toString());
				vec.add(vo);
			}
			rs.close();
			con.close();
		}catch(SQLException e) {
		}
	}
//	--- 등록
	public void insertStudent(int studentId,String name,int age,String sex,String phone
			,String addr,String memo,int restday,int penalty,int startCareDay,int endCareDay) {
		int result=0;
		Connection con = null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			
			String sql=("inset into student values(studentId.nextval,?,?,?,?,?,?,?,?,?,?");
			con = dao.getConnection();
			pstmt = con.prepareStatement(sql);
			while(rs.next()) {
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1, name); 
				pstmt.setInt(2, age); 
				pstmt.setString(3, sex); 
				pstmt.setString(4, phone); 
				pstmt.setString(5, addr);
				pstmt.setString(6, memo); 
				pstmt.setInt(7, restday); 
				pstmt.setInt(8, penalty); 
				pstmt.setInt(9, startCareDay); 
				pstmt.setInt(10, endCareDay); 
				result=pstmt.executeUpdate();
				dao = new StudentDAO();
				
				System.out.println(dao.toString());
				vec.add(vo);
			}
			rs.close();
			con.close();
		}catch(SQLException e) {
		}
	}
	
//		---- 삭제
		public int deleteStudent(String name) {
			int result=0;
			Connection con=null;
			String sql="delete from student where name=?";
			PreparedStatement pstmt=null;
			try {
				con = dao.getConnection();
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1, name);
				result=pstmt.executeUpdate();
				con.close();
				pstmt.close();
			} catch (SQLException e) { 
				e.printStackTrace(); 
			}
			return result;
		}
//		---- 번호 로 선택해서 수정/이름, 성별, 전화,주소,메모
		public int updateStudent(String fieldname,String word,int no) {
			int result=0;
			Connection con=null;
			String sql="update student set "+fieldname+" =? where studentId =? ";
			PreparedStatement pstmt=null;
			try {
				con = dao.getConnection();
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1, word);
				pstmt.setInt(2, no);
				result=pstmt.executeUpdate();
			} catch (SQLException e) { 
				e.printStackTrace(); 
			}//close(con, pstmt); 
				
			
			return result;
	}
		
		
}
		
		
	


