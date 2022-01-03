package chaptor06.exercise.answer;

public class Plane {
	private String manufacture;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;
	
	public Plane() {
		numberOfPlanes++;
		
	}
	
	public Plane(String manfacture, String model, int maxNumberOfPassengers) {
		this();
		this.manufacture = manfacture;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
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

	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if (maxNumberOfPassengers >0) {
			this.maxNumberOfPassengers = maxNumberOfPassengers;
		}
	}
	
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
	
}
