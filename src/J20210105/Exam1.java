package J20210105;
//���� : ��� 3���� ������ �� �ִ� �迭�� ����� ������� ä���ּ���. 
//3���� ������� �ڱ�Ұ��� ���Ѻ�����.

public class Exam1 {

	public static void main(String[] args) {
		People p1 = new People("���ؼ�", 24, "����");
		People p2 = new People("�����", 30, "����");
		People p3 = new People("��켮", 27, "����");
		
		People[] people = {p1, p2, p3};
		
//		people[0].introduce();
//		people[1].introduce();
//		people[2].introduce();
		
		for (int i = 0; i < 3; i++) {
			people[i].introduce();
		}
		
		
	  }
}
