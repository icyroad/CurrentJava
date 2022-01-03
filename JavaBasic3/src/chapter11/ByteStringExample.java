package chapter11;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ByteStringExample {
	public static void main(String[] args) {
		byte[] bytes = "abcdefg".getBytes();	//문자를 숫자로
		String string = new String(bytes);		//숫자를 문자로	
		
		
		byte[] bytes1 = "안녕".getBytes();	//문자를 숫자로 변환
		System.out.println(Arrays.toString(bytes1));
		
		//중간에 암호화 과정을 한다면 하고
		//전송
		//복호화
		
		//숫자를 다시 문자열로 변환
		String string2 = new String(bytes1, StandardCharsets.UTF_8);
		System.out.println(string2);
	}
}
