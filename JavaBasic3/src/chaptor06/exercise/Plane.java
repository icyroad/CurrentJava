package chaptor06.exercise;

public class Plane {
	private String manufacture;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;
	
	public Plane(){
		this.manufacture = "0";			  //그냥 기본값으로 초기화 하라는 의미여서 필요 없는 코드
		this.model = "0";
		this.maxNumberOfPassengers = 0;
		numberOfPlanes++ ;                //중복되는 코드
		
	}
	
	public Plane(String manufacture, String model, int maxNumberOfPassengers) {
		this.manufacture = manufacture;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
		numberOfPlanes++ ;	             //중복되는 코드 this()로 줄이기
	}
	
	
	
	
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	public void setmaxNumberOfPassengers(int maxNumberOfPassengers) {
		if (maxNumberOfPassengers>0) {
			this.maxNumberOfPassengers = maxNumberOfPassengers;
		} else {
			this.maxNumberOfPassengers = 0;
		}
		
	}
	
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
	
	public String toString() {
		return String.format(manufacture +", "+ model + ", " + maxNumberOfPassengers + ", " + numberOfPlanes);  
	}
	
	
}
