package J20210112;

import java.util.Scanner;

public class Exam {
	// Scanner를 이용해 입력값을 받아
	// 구구단을 원하는 단이 나오게 해주세요.

	// 예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

	// 4단 출력.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int dan;

		System.out.print("원하는 단을 입력해주세요 : ");
		dan = scan.nextInt();

		for (int gugu = 1; gugu <= 9; gugu++) {
			System.out.println(dan + " * " + gugu + " = " + gugu * dan);
		}
	}
}
