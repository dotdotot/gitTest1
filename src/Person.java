public class Person{
	    String name;
	    int age;
	    
	    Person(){
	    }
	    
	    Person(String a,int b){
	      name = a;
	      age = b;
	    }

	    public void introduce(){
	      System.out.println("�ȳ��ϼ��� " + age + "�� " + name + "�Դϴ�.");
	    }
	    
	  }