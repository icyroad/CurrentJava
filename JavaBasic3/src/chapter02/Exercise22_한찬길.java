package chapter02;

public class Exercise22_한찬길 {
	public static void main(String[] args) {
		double distance = 40e12;
		double lightSpeed = 300_000;
		
		double time = distance / (lightSpeed * 60 *60 * 24 * 365);
		
		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " + time + "광년이다.");
		
	}
}
