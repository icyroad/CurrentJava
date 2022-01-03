package chaptor06;

public class Car {
	String company;
	String model ;              //필드
	String color ;
	int speed;
	
//	public Car() {
//		              // 생략되어있음, 컴파일 되면 자동으로 나타남
//					  // 생성자를 만드는 컨스트럭터
//	}
	public Car() {
        //디폴트 생성자를 꼭 같이 만들어 줘야 외부에서 오류가 안남
}

	
	//같은 이름의 Car객체가 여러개 있는 경우 사용할 때 구분이 되기 때문에 
	//같은 이름의 생성자를 다 불러오는데 이걸 생성자 오버로딩이라고 한다
	//이름이 같은 생성자는 뒤에 오는 타입에 개수가 다르거나 타입이 달라야한다.
	
	Car(String company, String model){
		   this.company = company;
		   this.model = model;          
	}	   							   

	/* 여기서 타입 뒤에오는 c, m을 매개변수(parameter)라고 한다.
       실제로 생성자를 쓰는 사람이 뭔지 알기좋게 매개변수를
       들어가는 내용이 뭔지 써주는게 좋다 (필드명과 똑같게 적자)

       클래스에 있는 company와 매개변수로 쓰는 지역변수 company를
       구분하기 위해, 클래스 필드에 저장될 company 앞에 this.를 붙여준다
       this : 메모리에 생성될 때 그 인스턴스(객체) 자신을 this라고 한다.
       해당 객체로 한정한다고 생각하면 될 거 같다
       this 뒤에 괄호를 만들고 타입과 개수를 표현하면 그와 타입,개수가 일치하는 객체랑 연결된다.
*/
	
	
		
	Car(String company, String model, int speed){
		this(company, model, speed, null);
	
	}
	Car(String company, String model, int speed, String color ){
		this.company = company;
		this.model = model;
		this.speed = speed;
		this.color = color;
	}
	// 중복되는 생성자가 많을 경우, 얘처럼 몽땅 다들어있는애 하나만 관리하고 this()로 호출해서 쓴다
	// 호출하는 경우 필요한 곳만 매개변수를 써주고 아닌 경우는 기본값을 적는다 (null이나 0 등)
	
}
