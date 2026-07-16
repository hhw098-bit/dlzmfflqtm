/*
 	1단계 보라색원, 빨간색원, 파란색원 객체들을 모델링하여 데이터
 	 + 기능 추출
 	- 데이터 : 색, 원의 반지름
 	- 기능 : 원의 면적을 구하는 기능
 
 	2단계 원 설계도(클래스) 만들기
 	
 */



class Circle{
	
	//클래스변수
	double radius; //1. 원의 반지름 저장할 변수
	
	
	//클래스메소드
	
	//1 메소드명 : setRadius
	// 기능: 매개변수로 전달받은 반지름 값을 위 radius변수에 저장하는 기능
	void setRadius(double newRadius){
		
		radius = newRadius;
	}
	
	//2 메소드명 : calcuateArea
	// 기능: 원의 면적을 구해서 반환하는 기능
	double calcuateArea() {
		//원 면적 = 반지름 X 반지름 X 3.14;
		return radius * radius * 3.14; 
	}
}



public class Ex2_1 {

	
	public static void main(String[] args) {
		// 3단계 2단계에서 만든 class Circle 설계도 하나를 
		// 이용해 객체 메모리 생성 후 사용

		// 순서1 Circle 설계도를 하나 이용해 객체 메모리 
		//	생성후 참조변수에 객체메모리 주소번지 저장
		// 클래스자료형  참조변수명 = new 클래스자료형();
			 Circle    원주율1   = new  Circle();
		
		// 순서2 반지름 값 5를 double radius 객체 변수에 저장	 
	    System.out.println("\n=======원주율1=========================================");
		원주율1.setRadius(5);
		//ㄴ = 원주율.radius = 5;
		System.out.println(원주율1.radius); // 5.0;
		
		// 순서3 원면적을 구하기 위해 new  Circle(); 객체메모리내부에
		// 포함된 calcuateArea() 메소드 호출하기
		System.out.println(원주율1.calcuateArea());//78.5;

		System.out.println("\n=======원주율2=========================================");
		
		// 3단계 2단계에서 만든 class Circle 설계도 하나를 
		// 이용해 객체 메모리 생성 후 사용
		
		// 순서1 Circle 설계도를 하나 이용해 객체 메모리 
		//	생성후 참조변수에 객체메모리 주소번지 저장
		// 클래스자료형  참조변수명 = new 클래스자료형();
		Circle    원주율2   = new  Circle();
		
		// 순서2 반지름 값 3를 double radius 객체 변수에 저장	 
		
		원주율2.setRadius(3);
		//ㄴ = 원주율.radius = 3;
		System.out.println(원주율2.radius); // 3.0;
		
		// 순서3 원면적을 구하기 위해 new  Circle(); 객체메모리내부에
		// 포함된 calcuateArea() 메소드 호출하기
		System.out.println(원주율2.calcuateArea());//28.26;
		
		
		
		
		
	}// ==== main 메소드 끝;

}
