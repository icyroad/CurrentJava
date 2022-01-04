package chapter11;

public class WrapperExample {
	public static void main(String[] args) {
		Integer integer = new Integer(10); 
		int intValue = integer.intValue(); //포장객체에서 기본타입으로 다시 언박싱
		Integer i = 10; // auto boxing
		int j = i;  // auto unboxing
		
		Integer sum = 0;
		for (int k = 0; k < args.length; k++) {
			sum +=k; // (참조형) + (기본형);
					 // 더하는 시점에는 자동으로 언박싱 되는데,
					 // 다시 sum에 대입할때는 참조형에 대입된다.
					 // 가능하면 혼용해서 쓰지 말 것.
		}
		Integer sum2 = 0;
		for (int m = 0; m < args.length; m++) {
			sum2 = Integer.sum(sum2, m); //이런 식으로 쓰는게 더 나음.
		}
		System.out.println(sum);
		
		
		
		int[] arr = {1, 5, -19, 20, 301, 22, -3};
		
		int max = Integer.MIN_VALUE;
		int min = integer.MAX_VALUE;
		for (int k = 0; k < arr.length; k++) {
			if (max < arr[k]) {
				max = arr[k];
			}	
		}
		System.out.println(max);
	}
}
