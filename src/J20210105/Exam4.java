package J20210105;

public class Exam4 {
	// ���� : �Ʒ� �ڵ��� �� ���� ���� ���ĺ�����.
	public static void main(String[] args) {
		Humen h1 = new Humen();
		h1.name = "ȫ�浿";
		h1.age = 22;
		
		h1.introduce();
		// ��� : ���� 22�� ȫ�浿 �Դϴ�.
		
		Humen h2 = new Humen();
		h2.name = "ȫ���";
		h2.age = 25;
		
		h2.introduce();
		// ��� : ���� 25�� ȫ��� �Դϴ�.
		
		h1.introduce();
		// ��� : ���� 22�� ȫ�浿 �Դϴ�.
	}
}