package J20210107;

public class MemberManager {
	
	Member[] members = new Member[100];
	int count = 0;
	
	void makeData() {
		Member m1 = new Member();

		m1.userId = "firstUser";
		m1.userPw = "1234";
		m1.userName = "ȫ�浿";
		m1.age = 27;

		insertMember(m1);

		Member m2 = new Member();

		m2.userId = "secondUser";
		m2.userPw = "5678";
		m2.userName = "�Ӳ���";
		m2.age = 45;

		insertMember(m2);

		Member m3 = new Member();

		m3.userId = "thirdUser";
		m3.userPw = "2468";
		m3.userName = "Ȳ����";
		m3.age = 25;

		insertMember(m3);

		Member m4 = new Member();

		m4.userId = "fourthUser";
		m4.userPw = "1357";
		m4.userName = "����ġ";
		m4.age = 29;

		insertMember(m4);

		Member m5 = new Member();

		m5.userId = "fourthUser";
		m5.userPw = "2233";
		m5.userName = "�����";
		m5.age = 40;
		
		insertMember(m5);
    
	}
	
  //��� �� ���� ���
	void printMembers() {
		for(int i = 0; i < count; i++) {
			System.out.println(members[i].userName);
		}
	}

	// �� ��� ���
	void insertMember(Member m) {
			members[count] = m;
			count++;
	}

  // Ư�� ���̵� ���� �� ���� ���
  void printMemberByUserId(String loginId) {
	  for (int i = 0; i < count; i++) {
		  if (members[i].userId == loginId) {
			  System.out.println("���̵� : " + members[i].userId);
			  System.out.println("�̸� : " + members[i].userName);
			  System.out.println("���� : " + members[i].age);
		  }
	  }
  }

  // ���̵�, �̸�, ���� ������ �ش� ���� ��й�ȣ ã��
  void findMemberPassword(String loginId, String name, int age) {
	  for (int i = 0; i < count; i++) {
		  if (members[i].userId == loginId) {
			  if(members[i].userName == name) {
				  if(members[i].age == age) {
					  System.out.println(name + "���� ��й�ȣ�� : " + members[i].userPw + "�Դϴ�.");
				  }
			  }
		  }
	  }
  }

  // ���̵�� ��й�ȣ�� �Է¹޾� �α��� ó���ϱ�
  void loginCheck(String loginId, String loginPw) {

  }
}
