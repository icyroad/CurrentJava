package chapter13;

import java.util.Objects;

//Lombok(롬복)
//@Data

public class Student {
	private int studNo;
	private String studName;
	private String studDep;

	public Student(int studNo, String studName, String studDep) {
		this.studNo = studNo;
		this.studName = studName;
		this.studDep = studDep;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(studDep, studName, studNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return Objects.equals(studDep, other.studDep) && Objects.equals(studName, other.studName)
				&& studNo == other.studNo;
	}

	public int getStudNo() {
		return studNo;
	}
	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudDep() {
		return studDep;
	}
	public void setStudDep(String studDep) {
		this.studDep = studDep;
	}

	@Override
	public String toString() {
		return studNo + "\t " + studName + "\t" + studDep;
	}
	
}
