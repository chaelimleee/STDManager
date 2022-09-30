package Student;

public class StudentVO {
	private int studentId;
	private String name;
	private int age;
	private String sex;
	private String phone;
	private String addr;
	private String memo;
	private int restday;
	private int penalty;
	private int startCareDay;
	private int endCareDay;
	
	public StudentVO() {}
	public StudentVO(int studentId,String name,int age,String sex,String phone
			,String addr,String memo,int restday,int penalty,int startCareDay,int endCareDay) {
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phone= phone;
		this.addr = addr;
		this.memo = memo;
		this.restday = restday;
		this.penalty = penalty;
		this.startCareDay = startCareDay;
		this.endCareDay = endCareDay;
		
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public int getRestday() {
		return restday;
	}
	public void setRestday(int restday) {
		this.restday = restday;
	}
	public int getPenalty() {
		return penalty;
	}
	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}
	
	public int getStartCareDay() {
		return startCareDay;
	}
	public void setStartCareDay(int startCareDay) {
		this.startCareDay = startCareDay;
	}
	public int getEndCareDay() {
		return endCareDay;
	}
	public void setEndCareDay(int endCareDay) {
		this.endCareDay = endCareDay;
	}
	@Override
	public String toString() {
		return "StudentVO [studentId=" + studentId + ", name=" + name + ", age=" + age + ", sex=" + sex + ", phone="
				+ phone + ", addr=" + addr + ", memo=" + memo + ", restday=" + restday + ", penalty=" + penalty
				+ ", startCareDay=" + startCareDay + ", endCareDay=" + endCareDay + "]";
	}
	public int reStudentId(String name,String phone) {
		return studentId;
	}
	
}
