package chapter13;

import java.util.HashSet;

public class SetExample {
	public static void main(String[] args) {
		
		HashSet<Student> set = new HashSet<>();
		set.add(new Student (2021120001,	"박경신",	"406"));
		set.add(new Student (2021120001,	"박경신",	"406"));
		//set은 중복을 제거하기 때문에 같은 데이터를 또 추가해도 1개로 친다
		//클래스에서 해시코드를 만드는 이유는 해당 데이터가 중복으로 분류되는 기준을 알려주기 위한 것
		set.add(new Student (2021120002,	"김정선",	"406"));
		set.add(new Student (2021120003,	"조현",		"405"));
		set.add(new Student (2021120004,	"경송은",	"401"));
		set.add(new Student (2021120005,	"오세현",	"402"));
		System.out.println(set.size());
	}
}
