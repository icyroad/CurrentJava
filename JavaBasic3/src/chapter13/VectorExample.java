package chapter13;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<Student> list = new Vector<>();
		
		list.add(new Student (2021120001,	"박경신",	"406"));
		list.add(new Student (2021120002,	"김정선",	"406"));
		list.add(new Student (2021120003,	"조현",		"405"));
		list.add(new Student (2021120004,	"경송은",	"401"));
		list.add(new Student (2021120005,	"오세현",	"402"));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
	}
}
