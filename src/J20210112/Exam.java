package J20210112;

import java.util.Scanner;

public class Exam {
	// Scanner�� �̿��� �Է°��� �޾�
	// �������� ���ϴ� ���� ������ ���ּ���.

	// ����) ���ϴ� ���� �Է����ּ��� : 4 (�Է��� ����)

	// 4�� ���.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int dan;

		System.out.print("���ϴ� ���� �Է����ּ��� : ");
		dan = scan.nextInt();

		for (int gugu = 1; gugu <= 9; gugu++) {
			System.out.println(dan + " * " + gugu + " = " + gugu * dan);
		}
	}
}
