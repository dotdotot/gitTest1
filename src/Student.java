
public class Student {

	   String name;
	   int math;
	   int korean;
	   int english;
	   
	   Student(){
		   
	   }
	   
	   Student(String a, int b, int c, int d){
		   name = a;
		   math = b;
		   korean = c;
		   english = d;
	   }
	   
	   public void sum() {
		  int sum = math + korean + english;
		  
		  System.out.println(name + "¿« √—¡°¿∫ " + sum);
	   }
	   
	   public void avg() {
		   double avg = (math + korean + english + 0.0)/3;
		   
		   System.out.println(name + "¿« ∆Ú±’¿∫ " + avg);
	   }
	   
	  
}
