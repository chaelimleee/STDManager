package Attendance;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Vector;

import DB.STDManager;

public class AttendanceUtil {

	STDManager stdManager;
	
	public AttendanceUtil() throws SQLException {
		stdManager=STDManager.getInstance();
	}
	
	//출결 전체목록(번호와,교시 순으로 정렬)
	public Vector<AttendanceVO> selectAtt() throws SQLException {
		return new AttendanceDAO().selectAttend(new AttendanceSQL().select());
	}
	
	//출결 전체목록+이름 (번호,기간별 정렬)
	public Vector<AttendanceVO> selectAll() throws SQLException {
		return new AttendanceDAO().selectAttName(new AttendanceSQL().selectAtt());
	}
	
	//출결관리하는 학생수(=환불하지않은 학생수)
	public int stdAttCnt() throws SQLException {
		return new AttendanceDAO().cntAtt(new AttendanceSQL().cntCareStd());
	}
	
	//학생(번호받아서)별 해당날짜 출석횟수 
	public int stdAttCnt(int i,String day) throws SQLException {
		return new AttendanceDAO().cntAtt(new AttendanceSQL().selectCnt(i,day));
	}
	//주차별 계산
	public double calAttWeek(int i) {
		return i / (7*5) * 100;
	}
	//월별 계산
	public double calAttMonth(int i) {
		return i / (7*20) * 100;
	}
}
