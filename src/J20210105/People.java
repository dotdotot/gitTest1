package J20210105;

public class People{
	int age;
	String name;
	String address;
	
	People(){
		
	}
	People(String a, int b, String c){
		name = a;
		age = b;
		address = c;
	}
	
	public void introduce() {
		System.out.println("이름 : " + name + "/ 나이 : " + age);
	}
}