package J20210105;

public class Exam2 {

	public static void main(String[] args) {

	    Customer c1 = new Customer();
	    c1.name = "��¯��";
	    c1.age = 35;

	    Customer c2 = new Customer();
	    c2.name = "�����";
	    c2.age = 29;

	    Customer c3 = new Customer();
	    c3.name = "ȫ�浿";
	    c3.age = 26;

	    Customer c4 = new Customer();
	    c4.name = "�輭��";
	    c4.age = 44;

	    Customer[] customer = {c1, c2, c3 ,c4};
	    //1. ��ü ȸ�� ���̿� �̸� ���
	    //2. ���̰� 30�� �̸��� ����� �̸� ���
	    
	    
	    for(int i = 0; i < 4; i++) {
	    	System.out.println("�̸� : " + customer[i].name);
	    	System.out.println("���� : " + customer[i].age);
	    }
	    
	    System.out.println("==========================");
	    
	    for(int i = 0; i < 4; i++) {
	    	if(customer[i].age < 30) {
	    		System.out.println("�̸� : " + customer[i].name);
	    	}
	    }
	    
	}

}
