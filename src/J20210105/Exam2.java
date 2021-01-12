package J20210105;

public class Exam2 {

	public static void main(String[] args) {

	    Customer c1 = new Customer();
	    c1.name = "김짱구";
	    c1.age = 35;

	    Customer c2 = new Customer();
	    c2.name = "손흥민";
	    c2.age = 29;

	    Customer c3 = new Customer();
	    c3.name = "홍길동";
	    c3.age = 26;

	    Customer c4 = new Customer();
	    c4.name = "김서방";
	    c4.age = 44;

	    Customer[] customer = {c1, c2, c3 ,c4};
	    //1. 전체 회원 나이와 이름 출력
	    //2. 나이가 30세 미만인 사람의 이름 출력
	    
	    
	    for(int i = 0; i < 4; i++) {
	    	System.out.println("이름 : " + customer[i].name);
	    	System.out.println("나이 : " + customer[i].age);
	    }
	    
	    System.out.println("==========================");
	    
	    for(int i = 0; i < 4; i++) {
	    	if(customer[i].age < 30) {
	    		System.out.println("이름 : " + customer[i].name);
	    	}
	    }
	    
	}

}
