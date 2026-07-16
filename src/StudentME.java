
public class StudentME {

	
//	1단계 : 현실의 영희 학생 객체 모델링
// 데이터 -이름, 나이, 학번
// 동작 - 공부하기, 영희 정보 출력	
	
// 2단계 : 현실의 영희 객체의 클래스 설계도 만들기
	/*
		클래스명 : Student
			맴버변수 선언
			1. 학생이름(문자열) 저장할 name 변수 선언
			2. 학생나이(정수) 저장할 age 변수 선언
			3. 학생이름(문자열) 저장할 studentId 변수 선언
	
			메소드 선언
			1. 학생이 공부하는 동작 출력 기능의 study 메소드 선언
			예) " 영희 학생이 공부하고 있습니다. "
		
			2. 학생 정보를 출력하는 기능의 printInpo 메소드 선언
			예) "이름 : 영희, 나이: 20, 학번: 2025001"
	*/
	
	String name;
	int age;
	int studentId;
	
	void study() {
	System.out.println(name +" 학생이 공부하고 있습니다.");
	};
	void printInpo() {
	System.out.println("이름:" + name +", 나이:"+ age+ ", 학번:"+studentId);
	};
	
	
	
	public static void main(String[] args) {
		
		
		
		
	
		
		
		StudentME student25001 = new StudentME();
		student25001.name = "영희";
		student25001.age = 20; 
		student25001.studentId = 2025001;

		
		student25001.study();
		
		student25001.printInpo();
		
	}

}
