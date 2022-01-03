package chapter08.exercise;

import java.util.Arrays;

public class SortingExample {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		students[0] = new Student("2021001", "한찬길");
		students[1] = new Student("2021002", "다찬길");
		students[2] = new Student("2021003", "바찬길");
		students[3] = new Student("2021004", "나찬길");
		students[4] = new Student("2021005", "카찬길");
		students[5] = new Student("2021006", "아찬길");
		students[6] = new Student("2021007", "타찬길");
		students[7] = new Student("2021008", "라찬길");
		students[8] = new Student("2021009", "사찬길");
		students[9] = new Student("2021010", "차찬길");
		
		for (Student student : students) {
			System.out.println(student);
		}
		
		System.out.println("===========================");
		Arrays.sort(students);
		
		for (Student student : students) {
			System.out.println(student);
		}
		
	}
}
