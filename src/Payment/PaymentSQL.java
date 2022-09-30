package Payment;

public class PaymentSQL{

	public PaymentSQL() {}

	
	//결제
    public String payDay(int stdID){
        return "UPDATE PaymentTBL SET payDay = sysdate where studentId = "+stdID;
    }

    //환불시 가장 최신결제내역 환불처리
    public String[] setRefund(int stdID,String refundD,int RAmount,String endCareDay) {
    	String[] str = new String[2];
    	 str[0]="UPDATE PaymentTBL SET isRefund=1 refundDay="+refundD+",refundAmount="+RAmount
    			+" where paymentId = (SELECT studentId FROM PaymentTBL ORDER BY payDay desc where studentId="+stdID+", ROWNUM =1)";
    	 str[1]="UPDATE StudentTBL SET endCareDay='"+endCareDay+"' where studentId="+stdID;
    	return str;
    }
    
    //결제 전체조회(이름,번호)
    public String searchPayment(String name, String phone) {
    	return "SELECT * FROM PaymentTBL where name =\""+name+"\",phone="+phone+"ORDER BY paymentId desc";
    }
    
    
    
    
    
}