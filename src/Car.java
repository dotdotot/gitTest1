  public class Car{
		  
		  String Car_name;
		  
		  Car(String a){
			  Car_name = a;
		  }
		  
		  public void run(int num) {
			  
			  for (int x = 1; x <= num; x++) {
				  System.out.println("�ڵ����� �޸��ϴ�.");				  
			  }
		  }
		  
		  public void max_speed(int num) {
			  System.out.println("�ڵ����� �ִ�ӷ� " + num + "km�� �޸��ϴ�.");
		  }
	  }