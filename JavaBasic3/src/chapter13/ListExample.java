package chapter13;

import java.util.ArrayList;

import chapter08.exercise.Student;
import chapter09.Person;

public class ListExample {
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();//얘는 리스트
		Student[] arr = new Student[10]; //얘는 배열이라 크기변경 불가능

		/* Generic (제네릭)
		 *  데이터의 타입을 고정하여 안정성을 높임
		 *  타입 변경시에도 자동으로 변경되어 사용하기 편하다
		 *  타입 이름은 대문자로 쓰고 하나의 문자로 한다
		 */
		Box<Integer> box = new Box<Integer>(); 
		// 박스 객체를 생성할 때 여기는 Integer만 들어갈거라고 하는것

		box.setValue(100);
		int result = box.getValue() + 100;
		
		
//		Box<Student> box2 = new Box<Student>;
//		box2.setValue(new Student());
		
		
		
		//필드의 타입을 Object로 선언하면 모든 타입의 데이터를 담을 수 있다.
		//근데 이렇게 하면 안에 있는 데이터의 타입이 뭔지 모른다.
//		Box box = new Box();   

//		box.setValue("홍길동");
//		Object value1 = box.getValue();
//		System.out.println(value1);
//		
//		box.setValue(100);
//		Object value2 = box.getValue();
//		System.out.println(value2);
//
//		box.setValue(3.14);
//		
//		int result = ((Integer)box.getValue()) + 100;
//	
	
	
	}
}
