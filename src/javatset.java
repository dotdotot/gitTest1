
public class javatset {

	public static void main(String[] args) {
	    
	    Person p1 = new Person();
	    p1.name = "ȫ�浿";
	    p1.age = 27;

	    Person p2 = new Person();
	    p2.name = "ȫ���";
	    p2.age = 25;

	    p1.introduce(); // �ȳ��ϼ��� 27�� ȫ�浿�Դϴ�.
	    p2.introduce(); // �ȳ��ϼ��� 25�� ȫ����Դϴ�.

	    Student s1 = new Student();
	    s1.name = "�̼���";
	    s1.math = 90;
	    s1.korean = 87;
	    s1.english = 77;

	    s1.sum(); // �̼����� ������ 254
	    s1.avg(); // �̼����� ����� 84.6

	    Student s2 = new Student();
	    s2.name = "�Ӳ���";
	    s2.math = 70;
	    s2.korean = 97;
	    s2.english = 75;

	    s2.sum(); // �Ӳ����� ������ 242
	    s2.avg(); // �Ӳ����� ����� 80.6

	  }
	  
}

		    
