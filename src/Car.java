  public class Car{
		  
		  String Car_name;
		  
		  Car(String a){
			  Car_name = a;
		  }
		  
		  public void run(int num) {
			  
			  for (int x = 1; x <= num; x++) {
				  System.out.println("자동차가 달립니다.");				  
			  }
		  }
		  
		  public void max_speed(int num) {
			  System.out.println("자동차가 최대속력 " + num + "km로 달립니다.");
		  }
	  }