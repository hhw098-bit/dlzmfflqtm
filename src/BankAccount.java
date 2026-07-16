/*
 	1단계 현실의 부산은행 계좌, 국민은행 계좌 객체들을 모델링하여 데이터
 	 + 기능 추출
 	- 데이터 : 계좌번호(accN), 예금주(owner), 잔액(balance)
 	- 기능 : 입금기능(inM), 출금기능(outM), 잔액확인(checkBalance)
 
 	
 	
 */
//2단계 원 설계도(클래스) 만들기
public class BankAccount {
String accN;
String owner;
double balance;
	
	// 클래스 메소드명 inM
//기능:	돈입금    특정금액을amount 입금하면 잔액balance이 증가
	
void inM(double amount) {
	
	balance += amount; // 현재 잔액에 입금금액
			// 기존잔액 10만 + 5만 입금 = 잔액balance15만
	System.out.println(owner +"님의 계좌에 "+amount+" 원이 입금되었습니다.");
	System.out.println("현재 잔액 : "+balance+"_원");
}

// 클래스 메소드명 outM
// 기능:	돈출금    특정금액amount 을  출금하면 잔액balance이 감소
//	단, 잔액이 부족하면 출금 불가
void outM(double amount) {
	
	// 현재 잔액이 출금할 금액보다 많거나 같다면? 출금 O
	
	if(balance>=amount) {
		// 기존잔액 10만 - 5만amount 출금 = 잔액balance 5만
		balance -= amount; // 현재 잔액에 출금금액을 뺀다.
		System.out.println(owner +"님의 계좌에 "+amount+" 원이 출금되었습니다.");
		System.out.println("현재 잔액 : "+balance+"_원");
	}else {
	
		// 현재 잔액이 출금할 금액보다 작다면? 출금 X
		System.out.println("잔액 부족 출금 실패");
	
	}
	
}

// 클래스 메소드명 checkBalance
//기능: 잔액정보 출력    

void checkBalance() {

	System.out.println(owner +"님의 현재 잔액 : "+balance+" 원");
}





// 4 main 메소드
// 기능 자바 코드 실행시키는 시작 기능
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3단계 객체 생성 후 사용
		// 순서1 은행계좌 객체 생성
		BankAccount 은행계좌 = new BankAccount();
		/*
			순서2 계좌 정보 설정
			-계좌번호 설정
			-예금주 설정	
			- 초기 잔액 설정 (10만)	
		*/
		은행계좌.accN = "123-456-789";
		은행계좌.owner = "이영희";
		은행계좌.balance = 100000;
		
		은행계좌.inM(50000); // 50000 입금 -> balance 변수값 15만 
		은행계좌.outM(30000); // 30000 출금 -> balance 변수감 12만
		은행계좌.checkBalance();
		
		
		
		
		
		
		
		
		
	}

}
