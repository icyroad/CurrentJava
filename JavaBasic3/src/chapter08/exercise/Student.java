package chapter08.exercise;

public class Student implements Comparable<Student>{
	private String name;
	private String studentNo;
	
	public Student(String name, String studentNo) {
		super();
		this.name = name;
		this.studentNo = studentNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", studentNo=" + studentNo + "]";
	}
	
	/*
	 * compareTo()는 매개변수로 들어오는값 Student o 와
	 * 				리턴값이 양수면 자리를 교환
	 * 				리턴값이 0 또는 음수이면 자리를 교환하지 않음
	 */
	@Override
	public int compareTo(Student o) {
		if (name.compareTo(o.getName()) > 0) {
			return 1;
		} else if (name.compareTo(o.getName())==0) {
			return 0;
		} else {
			return -1;
		}
	}
	
	
	
}
