package J20210107;

public class Exam3 {
	// 문제 : 사람의 id를 출력해주세요.
	// 조건 : 사람의 id를 20으로 설정해주세요.
	// 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
	// 조건 : 사람 클래스에서 출력할 수 없습니다.
	public static void main(String[] args) {
		사람 a사람 = new 사람();
		
		// 구현시작
		a사람.setId(20);
		// 구현끝
		System.out.println("제 번호는 " + a사람.getId() + " 입니다.");
		// 출력 : 제 번호는 20 입니다.
	}

}
