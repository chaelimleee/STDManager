package Attendance;

public class AttendanceSQL {

	
	//Attendance 전체
	public String select() {
		return "SELECT studentId,TO_CHAR(day,'YYYY/MM/DD'),period,isAttend,reason FROM AttendanceTBL A"
				+" INNER JOIN PaymentTBL P ON A.studentId=P.studentId"
				+" WHERE TO_CHAR(day,'YYYY/MM/DD') in (SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD') FROM DUAL) and isRefund = 0"
				+" ORDER BY studentId, period";
	}
	
	//Attendance stdid대신 이름
	public String selectN() {
		return "SELECT name,TO_CHAR(day,'YYYY/MM/DD'),period,isAttend,reason FROM AttendanceTBL A"
				+" INNER JOIN StudentTBL S ON A.studentId=S.studentId"
				+" INNER JOIN PaymentTBL P ON A.studentId=P.studentId"
				+" WHERE TO_CHAR(day,'YYYY/MM/DD') in (SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD') FROM DUAL) and isRefund = 0"
				+" ORDER BY name, period";
	}
	
	//학생(번호받아서 int i)별 해당날짜(String day) 출석횟수 
	public String selectCnt(int i,String day) {
		return "SELECT count(period) FROM Attendance A "
				+" INNER JOIN PaymentTBL P ON A.studentId=P.studentId"
				+" WHERE studentId = "+i+" and isAttend = 1 and TO_CHAR(day,'YYYY/MM/DD') in (SELECT TO_CHAR("+day+", 'YYYY/MM/DD') FROM DUAL)";
	}
	
	//학생별 월별 출석횟수
		public String cntMonthly(int i) {
			return "SELECT count(period) FROM Attendance A where studentId = "+i
					+" and isAttend = 1 and TO_CHAR(day,'YYYYMM') in (SELECT TO_CHAR(sysdate, 'YYYYMM') FROM DUAL)";
	}
	//Attendance + name
	public String selectAtt() {
		return "SELECT S.studentId,TO_CHAR(day,'YYYY/MM/DD'),period,isAttend,reason,name FROM AttendanceTBL A"
				+" INNER JOIN StudentTBL S ON A.studentId=S.studentId"
				+" INNER JOIN PaymentTBL P ON A.studentId=P.studentId"
				+" WHERE TO_CHAR(day,'YYYY/MM/DD') in (SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD') FROM DUAL) and isRefund = 0"
				+" ORDER BY S.studentId,period";
	}
	
	public String weekly() {
		return "SELECT studentId,TO_CHAR(day,'YYYY/MM/DD'),period,isAttend,reason,name FROM AttendanceTBL A"
				+" INNER JOIN StudentTBL S ON A.studentId=S.studentId"
				+" INNER JOIN PaymentTBL P ON A.studentId=P.studentId"
				+" WHERE TO_CHAR(day,'YYYY/MM/DD') in (SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD') FROM DUAL) and isRefund = 0"
				+" ORDER BY studentId,period";
	}
	
	//출결관리하는 학생수(=환불하지않은 학생수)
	public String cntCareStd() {
		return "SELECT count(S.studentId) FROM StudentTBL S"
				+" INNER JOIN PaymentTBL P ON P.studentId=P.studentId"
				+" WHERE isRefund = 0";
	}
	
	
}
