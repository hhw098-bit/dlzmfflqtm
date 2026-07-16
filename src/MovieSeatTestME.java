/*
스토리 :
좌석 하나는 예약 여부와 예약자 이름을 가진다. 
이미 예약된 좌석은 다시 예약할 수 없고, 취소하면 예약자 이름도 지워진다.

*/

// 1단계 : 현실의 영화관 좌석 객체 모델링
// - 데이터 : 좌석번호(seatNumber), 예약여부(isReserved), 예약자(reservedBy)
// - 기능   : 예약(reserve), 취소(cancel), 좌석 정보 출력(printSeat)

// 2단계 : 자바 코드로 class 설계 (데이터=변수 + 기능=메소드)
public class MovieSeatTestME {
	//클래스 변수 선언
		// 좌석 번호 저장할 변수
		String seatNumber;
		// 예약 여부 저장할 변수
		boolean isReserved;
		// 예약자 이름 저장할 변수
		String reservedBy;

	//클래스 메소드 선언
		/*
		 메소드명 : reserve
		 기   능  : 예약이 안 되어 있으면 customer로 예약 처리,
		            이미 예약돼 있으면 "이미 예약된 좌석입니다." 출력
		*/
		void reserve(String customer) {
			// TODO: isReserved 검사 후 예약 처리
			if( !isReserved  ) { // boolean은 기본값이 false이므로 !사용하여 대출 판단여부를 구한다.
				isReserved = true; // 
				
				reservedBy = customer;
				System.out.println("좌석, "+"["+ customer+"]" +"님 예약 완료. ");
			}else {// 이미 대출중이면?
				
				System.out.println(customer+"고객님 이미 예약된 좌석입니다.");
			}	
				
			}	

		/*
		 메소드명 : cancel
		 기   능  : 예약을 취소하고 예약자 정보를 지운다
		*/
		void cancel() {
			// TODO: 취소 처리
		
		isReserved = false; //예약 상태 취소
		reservedBy = null;// 예약자 정보를 지운다 (null = 참조하는 값 없음)
		
		System.out.println(seatNumber+" 좌석 예약이 취소 되었습니다.");
		
		}

		/*
		 메소드명 : printSeat
		 기   능  : 좌석번호, 예약여부, 예약자를 한 줄로 출력한다
		*/
		void printSeat() {
			// TODO: 좌석 정보 출력
		}

	public static void main(String[] args) {
		// 3단계 : MovieSeat 객체 생성 후 데이터 저장 및 사용
		//1. 객체 생성
		MovieSeatTestME seat = new MovieSeatTestME();

		//2. 데이터 저장
		seat.seatNumber = "F7";
		seat.isReserved = false;

		//3. 기능 호출
		seat.reserve("박지훈");
		seat.reserve("이수아");
		seat.printSeat();
		seat.cancel();
		seat.printSeat();
	}
}