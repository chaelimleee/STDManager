import java.sql.SQLException;
import java.util.Vector;

import Admin.AdminDAO;
import Attendance.AttendanceUtil;
import Attendance.AttendanceVO;
import GUImodeling._1_Loginpage;
import GUImodeling._3_Main;
import GUImodeling._4_0_CareStudents;
import GUImodeling._2_TodayTask;

public class TEST {
	public static void main(String[] args) throws SQLException {
		
		/*//최초 admin id,pwd 생성
		try {
			new AdminDAO().insertAdmin("admin", "1234");
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		new _1_Loginpage().run();
//		new _2_TodayTask().run();
//		new _3_Main().run();
//		new _4_0_CareStudents().run();
//		Vector<AttendanceVO>vec=new AttendanceUtil().selectAll();
//		for(AttendanceVO vo:vec)
//			System.out.println(vo.getPeriod());

	}

}
	
