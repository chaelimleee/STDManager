package ETC;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateTime {
	
	public static String today() {
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		return today.format(formatter);
	}
	
	public static int findDayOfWeek() {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.DAY_OF_WEEK);
	}
	public static dateType DayOfWeek(int fdw) {
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
	/*
	public static void main(String[] args) {
		System.out.println(today());
		System.out.println(DayOfWeek(findDayOfWeek()));
	} */
}


