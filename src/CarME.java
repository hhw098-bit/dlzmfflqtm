//객체지향 프로그래밍 3단계 기법
// 1단계 : 현실의 소나타 객체를 모델링(데이터와 기능 추출 하는 작업)
// - 데이터 : 브랜드, 색상, 속도
// - 기능 : 가속, 감속

// 2단계 : 자바코드로 class 설계 (맴버변수 + 메소드)

public class CarME {

	//맴버변수 선언
	//1. 브랜드명을 저장할 문자열 변수 선언
	//2. 색상을 저장할 문자열 변수 선언
	//3. 자동차 현재속도를 저장할 정수 변수 선언
	
	String brandName;
	String carColor;
	int nowSpeed;
	
	
	//맴버메소드 선언
	//1. 자동차 현재 속도를 10증가 시키는 기능의 accelerate 메소드 선언
	//2. 자동차 현재 속도를 10감소 시키는 기능의 breaks 메소드 선언
	
	
	void accelerate() {
	 
	 nowSpeed+= 10;
		System.out.println(brandName+" 가속! 현재속도: "+"nowSpeed "+ nowSpeed+"km/h");
	};
	void breaks(){
		nowSpeed-= 10;
		System.out.println(brandName+" 감속! 현재속도: "+"nowSpeed "+ nowSpeed+"km/h");
	};
	
	
	public static void main(String[] args) {
	// 3단계 : 2단계 에서 만든 Car 클래스(설계도) 하나를 이용해 "Kia"자동차 객체 생성 및 사용
	// 순서1 Car클래스를 이용해 	"Kia" 자동차 객체 메모리 하나 생성	
	// 클래스 자료형 참조변수명 = new 클래스명();	
		CarME Kia = new CarME ();
/*		순서2. "Hyundai" 자동차 객체에 브랜드명을 "Kia"로 저장
									색상을 "Black" 로 저장
									현재속도를 0으로 저장

*/	
		Kia.brandName= "Kia";
		Kia.carColor= "Black";
		Kia.nowSpeed= 0;
		
		
		
		// 순서3. 현재속도 10 증가

		Kia.accelerate();
		
		// 순서4. 현재속도 10 감소
		Kia.breaks();
		
		System.out.println("\n________________________");
		
	//==============================================================	
		
	// 3단계 : 2단계 에서 만든 Car 클래스(설계도) 하나를 이용해 "Hyundai"자동차 객체 생성 및 사용
		
	// 순서1 Car클래스를 이용해 	"Hyundai" 자동차 객체 메모리 하나 생성
	// 클래스 자료형 참조변수명 = new 클래스명();	
		CarME Hyundai = new CarME ();	
	/*
	 * 						0X16 객체 메모리 주소	
	 [ 0X16 ] =--------------------------------------------
	  					String brandName [null]
						String carColor [null]
						int nowSpeed [0]
						
						void accelerate(){ nowSpeed +=10}
						void breaks(){nowSpeed +=10}
	  			---------------------------------------------
	  	
	 */
	/*		순서2. "Hyundai" 자동차 객체에 브랜드명을 "Hyundai"로 저장
	  									색상을 "Red" 로 저장
	  									현재속도를 0으로 저장
	 
	*/	
		Hyundai.brandName="Hyundai";
		Hyundai.carColor="Red";
		Hyundai.nowSpeed=0;
		
		
		
		// 순서3. 현재속도 10 증가

		Hyundai.accelerate();
		
		// 순서4. 현재속도 10 감소
		Hyundai.breaks();
		
		
	}

}
