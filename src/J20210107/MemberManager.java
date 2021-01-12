package J20210107;

public class MemberManager {
	
	Member[] members = new Member[100];
	int count = 0;
	
	void makeData() {
		Member m1 = new Member();

		m1.userId = "firstUser";
		m1.userPw = "1234";
		m1.userName = "홍길동";
		m1.age = 27;

		insertMember(m1);

		Member m2 = new Member();

		m2.userId = "secondUser";
		m2.userPw = "5678";
		m2.userName = "임꺽정";
		m2.age = 45;

		insertMember(m2);

		Member m3 = new Member();

		m3.userId = "thirdUser";
		m3.userPw = "2468";
		m3.userName = "황진이";
		m3.age = 25;

		insertMember(m3);

		Member m4 = new Member();

		m4.userId = "fourthUser";
		m4.userPw = "1357";
		m4.userName = "전우치";
		m4.age = 29;

		insertMember(m4);

		Member m5 = new Member();

		m5.userId = "fourthUser";
		m5.userPw = "2233";
		m5.userName = "정약용";
		m5.age = 40;
		
		insertMember(m5);
    
	}
	
  //모든 고객 정보 출력
	void printMembers() {
		for(int i = 0; i < count; i++) {
			System.out.println(members[i].userName);
		}
	}

	// 고객 등록 기능
	void insertMember(Member m) {
			members[count] = m;
			count++;
	}

  // 특정 아이디를 가진 고객 정보 출력
  void printMemberByUserId(String loginId) {
	  for (int i = 0; i < count; i++) {
		  if (members[i].userId == loginId) {
			  System.out.println("아이디 : " + members[i].userId);
			  System.out.println("이름 : " + members[i].userName);
			  System.out.println("나이 : " + members[i].age);
		  }
	  }
  }

  // 아이디, 이름, 나이 정보로 해당 고객의 비밀번호 찾기
  void findMemberPassword(String loginId, String name, int age) {
	  for (int i = 0; i < count; i++) {
		  if (members[i].userId == loginId) {
			  if(members[i].userName == name) {
				  if(members[i].age == age) {
					  System.out.println(name + "님의 비밀번호는 : " + members[i].userPw + "입니다.");
				  }
			  }
		  }
	  }
  }

  // 아이디와 비밀번호를 입력받아 로그인 처리하기
  void loginCheck(String loginId, String loginPw) {

  }
}
