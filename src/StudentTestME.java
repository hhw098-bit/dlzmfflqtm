/*
	스토리/ 학교에서 학생 한명의 정보를 관리한다.
			이름,학번,국어/영어/수학 점수를 저장하고, 평균을 계산해서 출력한다.
                                                                 */
//1단계 현실의 학생 객체 모델링

// - 데이터: 이름(name), 학번(studentId), 국어/영어/수학 점수(kor/eng/moth)
// - 기능: 평균 계산(calcArverage), 학생 정보 출력 (printInfo)

//2단계 자바코드로 설계도(class) 설계 ( 변수 = 데이터 + 메소드 = 기능 )

public class StudentTestME {
//클래스 변수 선언
	
	String name;       // 학생 이름 저장할 변수
	
	String studentId;  // 학생 학번 저장할 변수
	
	int kor,eng,math;  // 학생의 국어/영어/수학 점수 저장할 변수
	
//클래스 메소드 선언
	/*
		메소드명 : calcArverage
		기   능 : 국어/영어/수학 점수의 평균을 계산해
				 "○○○님의 평균 점수 : OO.O점" 형식으로 출력한다.	
	                                                             */
	
	
	void calcArverage() {
	//세 과목 점수를 더한 뒤 3.0나눠 실수 평균 구해 avg 지역변수에 저장		
		double avg = (kor+eng+math)/3.0;
	System.out.println(name + "님의 평균 점수 :"+avg+"점");	 //이름과 평균 점수를 이어 붙여 화면에 출력
				
	}
	
	/*
		메소드명 : printInfo
		기   능 : 학번과 이름을 "학번: ○○○, 이름: ○○○"형식으로 출력한다.
	                                                             */
	
	
	void printInfo() {
		System.out.println("학번: " + studentId + ", 이름: "+name);
		
	}
	

	
	public static void main(String[] args) {
		

		//3단계 : new 연산자로 객체메모리 생성 후 사용
		
		// 순서 1+2 참조변수선언 + nwe 연산자로 객체 메모리 생성
		// 방법.
		// 클래스명 참조변수명 = new 클래스명();
		
		StudentTestME s1 = new StudentTestME();
		
		
		
// 순서3 객체 변수 값 설정		
		
		s1.name = "김민준";
		s1.studentId = "2026001";
		s1.kor = 90; s1.eng = 85; s1.math = 95;
		
// 순서4  객체 메소드 호출
		s1.calcArverage(); // 학번: 20260001, 이름: 김민준 ;		
		s1.printInfo(); // 김민준 님의 평균점수: 90.0점  ;  
		
	}

}
