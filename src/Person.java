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
	      System.out.println("안녕하세요 " + age + "살 " + name + "입니다.");
	    }
	    
	  }