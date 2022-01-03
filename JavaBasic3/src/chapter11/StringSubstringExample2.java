package chapter11;

public class StringSubstringExample2 {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		String firstNum = ssn.substring(0,6);
		
		String secondNum = ssn.substring(7);
		
		String[] ssnArr = ssn.split("-"); //얘를 기준으로 나눠서 배열로. 없는 경우는 문자 하나씩 분해
		String first = ssnArr[0];
		String second = ssnArr[1];
		
		char[] charArray = ssn.toCharArray(); //얘랑 같게 됨. 알고리즘 문제 풀때 사용
		for (char c : charArray) {
			System.out.println(c);
		}
		
		int i = 10;
		String result = i + "";		// 이거랑 기능은 똑같음 ㅇㅇ
		String result2 = String.valueOf(i); //기본타입의 값을 문자열로 변환하는 메소드
	}
}
