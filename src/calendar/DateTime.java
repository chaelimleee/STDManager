package calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateTime {
	
	private int year;
	private int month;
	private int todaydate;
	private Object todayday;
	private Calendar calendar=null;
	private LocalDate today=null;
	
	public DateTime() {
		today = LocalDate.now();
		year = today.getYear();
		month = today.getMonthValue();
		todaydate = today.getDayOfMonth();
		todayday = DayOfWeek(findDayOfWeek());		
	}
	
	public int findDayOfWeek() {
		calendar = Calendar.getInstance();
		return calendar.get(Calendar.DAY_OF_WEEK);
	}
	
	public dateType DayOfWeek(int fdw) {
		dateType today = null;
		switch(fdw){
		case 1: today = dateType.일요일; break;
		case 2: today = dateType.월요일; break;
		case 3: today = dateType.화요일; break;
		case 4: today = dateType.수요일; break;
		case 5: today = dateType.목요일; break;
		case 6: today = dateType.금요일; break;
		case 7: today = dateType.토요일; break;
		}
		return today;
	}
	
	public int getStartSundayOfMonth() {
		int i = calendar.getFirstDayOfWeek();
		int sundaydate=1;
		while(!(""+DayOfWeek(i)).equals("일요일")) {
			i++; sundaydate++;
		}
		return sundaydate;
	}
	
	
	public String toString() {
		return year+"년 "+month+"월 "+todaydate+"일 "+todayday;
	}
}

/*
 * public static String today() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		return today.format(formatter);
	}
	*/
/*
public static void main(String[] args) {
	System.out.println(today());
	System.out.println(DayOfWeek(findDayOfWeek()));
} */


