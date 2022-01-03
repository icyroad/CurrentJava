package chaptor06;

public class GasCarExample {
	public static void main(String[] args) {
		GasCar gasCar = new GasCar();
		
		gasCar.setGas(5);
		
		boolean gasState = gasCar.isLeftGas();
		if (gasState) {
			System.out.println("출발합니다.");
			gasCar.run();
			
		}
		
		if (gasCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
