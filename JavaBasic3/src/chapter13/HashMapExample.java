package chapter13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수: " + map.size());
		System.out.println(map.get("홍길동"));
		
//		map.entrySet() 엔트리로 접근하는방식
//		map.keySet() 키값으로 접근하는 방식
//		map.values() 값으로 접근하는 방식
		
		//1. 키 집합(Key Set)을 이용하는 방법
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String keyString = (String) keyIterator.next();
			System.out.print(keyString);
			System.out.println(": " + map.get(keyString));
		}

		
		System.out.println();
		//2. 엔트리 집합(Entry Set)을 이용하는 방법
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			System.out.print(entry.getKey());
			System.out.println(": " + entry.getValue());
		}
		
	}
}
