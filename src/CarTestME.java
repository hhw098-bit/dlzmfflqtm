/*
 *  스토리/ 자동차는 현재 속도와 남은 연료를 가진다.
 *  	  가속하면 속도가 오르고 연료가 줄며, 연료가 부족하면 가속할 수 없다.
 * 
 */

//1단계 현실의 자동차 객체 모델링
// -데이터 모델링, 속도, 남은 연료
// -기능 가속하기, 상태 확인 

//2단계 class설계
public class CarTestME {
// 클래스 변수 선언
	
	String model;  // 1 모델명 저장할 변수 선언
	
	int speed;    // 2 현재 속도 저장할 변수 선언
	
	int fuel;     // 3 남은 연료(L)저장할 변수 선언
// 클래스 메소드 선언	
	/*
		메소드명 accelerate
		기능  연료가 amount만큼 남아있으면 연료를 소모하고
				속도를 (amount*10)만큼 올린다
			연료가 부족하면 '연료 부족! 가속 실패.' 출력
		
	*/

	void accelerate(double amount) { // 2.0   10.0
		
		if( fuel >= amount) { //남은 연료가 사용할 양보다 크거나 같은지 검사
			  
			fuel -= amount;//남은 연료에서 사용한 양만큼 차감
			speed += (int)(amount*10); 
	//연료 1L당 속도 10 증가-> 실수결과를 int로 형변환해 speed변수에 누적	
		}else {//연료 부족
			System.out.println("연료 부족! 가속 실패.");
	  }
		
	}
	
	/*
	메소드명 checkStatus
	기능  모델명 속도 남은 연료를 한 줄로 출력한다.
			"모델: OOO/ 속도: OOkm/h / 남은 연료: OOL"출력
	
	*/	
	
void checkStatus() { 
		
System.out.println("모델: "+model+" / 속도:"+speed+"[km/h]"+" / 남은 연료:"+fuel+"L");
	  }
		
	
	
	
	
	
	
	public static void main(String[] args) {
	
		
		//3단계 CarTest 객체 생성 후 데이터 저장 및 사용
		// 1 객체 생성
		CarTestME car = new CarTestME();
		// 2 객체 데이터 저장
		// 모델명 -> 아반떼
		// 현재속도 -> 0	
		// 남은연료 -> 5.0
		car.model= "아반떼";
		car.speed= 0;
		car.fuel= (int)5.0;
		//3 객체 메소드 호출 해서 사용
		
		car.accelerate(2.0);// 연료 충분 -> fuel 5.0 ->3.0, speed 0->20
		car.accelerate(10.0);// 연료 부족 -> 변화없음
		car.checkStatus();// 
	}
		
		
}
