package chaptor05;

// enumeration(열거)
public enum Week {
	MONDAY("월", 101), 
	TUESDAY("화", 202), 
	WEDNESDAY("수", 303), 
	THURSDAY("목", 404), 
	FRIDAY("금", 505), 
	SATURDAY("토", 606), 
	SUNDAY("일", 707);

	//상수에 추가로 내부적인 값을 넣는 방법
	String name;
	private int num;
	private Week(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public int getNum() {
		return num;
	}
}