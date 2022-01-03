package chaptor07;

public class DmbCellPhone extends CellPhone{
	
	int channel;					  //이 클래스에는 필드 하나뿐인데
	
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;           //부모에게 상속받은 필드
		this.color = color;			  //부모에게 상속받은 필드
		this.channel = channel;
	}
	
	
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmg() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
}
