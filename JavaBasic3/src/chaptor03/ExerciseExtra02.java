package chaptor03;

public class ExerciseExtra02 {
	public static void main(String[] args) {
		char ch = 'A';
		
		char lowerCase = (ch>=65 && ch <=90) ? (char)(ch+32) :ch;
		
		System.out.println(lowerCase);
	}
}
