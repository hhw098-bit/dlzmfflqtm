/*
	스토리 / 카페에서 음료 한잔을 주문한다.
	사이즈 ( TALL / GRANDE )에 따라 가격이 달라지고, 결제 후 영수증을 출력한다.

	1단계 현실의 카페 주문 객체 모델링
	
	- 데이터 : 메뉴 menu 사이즈 size 기본가격 basePrice
	- 기능 : 최종가격 계산 calcPrice 영수증 출력 printReceipt

*/

// 2단계 class 설계도 만들기
public class CoffeOderTest {

	//클래스 변수 선언
//	 메뉴명을 저장할 변수 선언
	String menu;
//	 사이즈 저장할 변수 선언 (TALL 또는 GRANDE)
	String size;
//	기본가격을 저장할 변수 선언
	int basePrice;
// 클래스 메소드 선언
	// 메소드명 calcPrice
	// 기능 size가 GRANDE면 기본가격 + 500원, 아니면 기본가격으로
	int calcPrice() {
		
		if(size.equals("GRANDE") ) {
			return  basePrice + 500;
			 
		}else {
			
			return basePrice;
		}
		
		
	}
	
	
//	메소드명 printReceipt
//	기능 calcPrice()를 호출해 "[영수증] 메뉴: 000(사이즈) / 가격: 000 원"출력
	
	
	void printReceipt() {
		int price = calcPrice();
		System.out.println("[영수증] 메뉴: "+ menu + "("+size+")"+" / 가격: "+ price +"원");
	}
	
	
	
	public static void main(String[] args) {
	
// 3단계 CoffeOrderTest 클래스 하나를 이용해 new 로 객체 생성 후 데이터 저장 및 사용		
	//순서1+순서2 order객체 생성
		
		CoffeOderTest order = new CoffeOderTest();
		
		
// 순서3 order객체 데이터 설정		
	// 메뉴명 -> 아메리카노 저장	
	// 사이즈 -> GRANDE 저장	
	// 기본가격 -> 4000 저장	
	order.menu= "아메리카노";	
	order.size= "GRANDE";
	order.basePrice= 4000;
// 순서4 메소드 호출해서 사용
		// 출력 : [영수증] 메뉴: 아메리카노(GRANDE) / 가격: 4000 원
		
order.printReceipt();
		
		
		
		
		
		
	}

}
