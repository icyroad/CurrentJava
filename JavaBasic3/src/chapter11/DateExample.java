package chapter11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExample {
	public static void main(String[] args) {
		
		LocalDate.now(); // 현재 날짜를 나타냄
		System.out.println(LocalDate.now());
		
		LocalDateTime.now(); // 현재 시간을 나타냄
		System.out.println(LocalDateTime.now());
	
		String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초"));
		System.out.println(now);
	}
}
