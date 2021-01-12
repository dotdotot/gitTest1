package J20210105;

public class Exam4 {
	// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.
	public static void main(String[] args) {
		Humen h1 = new Humen();
		h1.name = "홍길동";
		h1.age = 22;
		
		h1.introduce();
		// 출력 : 저는 22살 홍길동 입니다.
		
		Humen h2 = new Humen();
		h2.name = "홍길순";
		h2.age = 25;
		
		h2.introduce();
		// 출력 : 저는 25살 홍길순 입니다.
		
		h1.introduce();
		// 출력 : 저는 22살 홍길동 입니다.
	}
}