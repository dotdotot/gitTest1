package J20210105;
//문제 : 사람 3명을 저장할 수 있는 배열을 만들고 사람으로 채워주세요. 
//3명의 사람에게 자기소개를 시켜보세요.

public class Exam1 {

	public static void main(String[] args) {
		People p1 = new People("김준석", 24, "파주");
		People p2 = new People("김승희", 30, "파주");
		People p3 = new People("김우석", 27, "파주");
		
		People[] people = {p1, p2, p3};
		
//		people[0].introduce();
//		people[1].introduce();
//		people[2].introduce();
		
		for (int i = 0; i < 3; i++) {
			people[i].introduce();
		}
		
		
	  }
}
