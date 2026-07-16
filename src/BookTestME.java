/*
 스토리. 도서관 책 한권을 관리 한다.  
       대출 여부를 두고, 이미 대출 중이면 다시 대출 할수 없다.
*/

// 1단계 : 현실의 도서 -"자바의정석", "수학의정석" 객체 모델링( 데이터 와 기능 추출 )
// - 데이터 : 제목(title), 저자(author), 대출여부(isRented)
// - 기능   : 대출(rent), 반납(returnBook), 상태 출력(printStatus)


// 2단계 : 현실의 도서를 추상화해서 도서 설계도(class) 설계
public class BookTestME {
//클래스 변수 선언 
	//1. 책 제목 저장할 변수 선언
	String title; 
	//2. 책 저자 저장할 변수 선언
	String author;
	//3. 대출 여부 저장할 변수 선언 
	Boolean isRented;
//클래스 메소드 선언
	/*
	 메소드명 : rent
	 기   능  : 대출 중이 아니면 대출 처리하고 완료 메시지 출력,
	            이미 대출 중이면 "이미 대출 중입니다." 출력
	*/
	void rent() {
		     // TODO: isRented 검사 후 처리
	if( !isRented  ) { // boolean은 기본값이 false이므로 !사용하여 대출 판단여부를 구한다.
		isRented = true; // 대출 상태로 변경
		System.out.println( title +" 대출 완료 ");
	}else {// 이미 대출중이면?
		
		System.out.println("이미 대출 중입니다.");
	}	
		
	}	
	
	/*
	 메소드명 : returnBook
	 기   능  : isRented를 false로 바꾸고 반납 완료 메시지 출력
	*/
	void returnBook() {
		// TODO: 반납 처리
	
			isRented = false;// 대출상태를 해제(반납)
			 System.out.println(title +" 반납 완료 ");
		
		
	}	
	/*
	 메소드명 : printStatus
	 기   능  : 제목, 저자, 대출여부를 한 줄로 출력한다
	*/
	void printStatus() {
		// TODO: 상태 출력
		
		System.out.println("제목:"+title+" / 저자:"+author+" / 대출여부:"+isRented);
	}	


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3단계 new 연산자로 객체 메모리 생성 후 사용
		
		// 순서 1+2 참조 변수 선언 + 객체 메모리 생성
	BookTestME 대출1 = new BookTestME(); 	
		
		
		
//순서3. 	객체 메모리 내부에 포함된 객체 변수 값 설정
		  
	대출1.title = "자바의 정석";	 
	대출1.author = "남궁성";	 
	대출1.isRented = false;	 
	
	
	
//순서4. 객체 메소드 호출해서 대출 / 반납 하기.	
	
	대출1.rent();   //  대출이 아닌 상태에서 대출 상태로 | false -> true |
	
	대출1.rent();   //  이미 대출 true -> 대출된 상태이므로 지금은 대출 x
	대출1.printStatus();
	대출1.returnBook(); // 자바의 정석 반납 완료
	
	대출1.printStatus();
		
		
		
		
		
		
		
	}

}
