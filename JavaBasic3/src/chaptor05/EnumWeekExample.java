package chaptor05;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class EnumWeekExample {
	public static void main(String[] args) {
		//오늘 날짜 정보 가져오기
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		Week today = null;
		
		//
		DayOfWeek week = now.getDayOfWeek();
		switch (week) {
		case MONDAY:
			today = Week.MONDAY;
			break;
		case TUESDAY:
			today = Week.TUESDAY;
			break;
		case WEDNESDAY:
			today = Week.WEDNESDAY;
			break;
		case THURSDAY:
			today = Week.THURSDAY;
			break;
		case FRIDAY:
			today = Week.FRIDAY;
			break;
		case SATURDAY:
			today = Week.SATURDAY;
			break;
		case SUNDAY:
			today = Week.SUNDAY;
			break;
		default:
			break;
		}	
		System.out.println(Week.MONDAY.ordinal());   // MONDAY가 열거에서 위치한 순서를 반환
		//추가한거
		System.out.println("오늘 요일: " + today.toString());
		System.out.println("오늘 요일: " + today.getName());
		
			System.out.println("오늘 요일: " + today);
			if (today == Week.SUNDAY) {
				System.err.println("일요일에는 축구를 합니다.");
			} else {
				System.out.println("열심히 공부를 합니다.");
			}
		
	}
}
