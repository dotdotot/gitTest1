
public class VendingMachine {
	
	int my_money;
	
	VendingMachine(){
		
	}
	
	public void printAllBeverages() {
		// ��� : 0.�ݶ� : 1000
	    // ��� : 1.���̴� : 1200
	    // ��� : 2.Ŀ�� : 800
		
		System.out.println("0.�ݶ� : 1000");
		System.out.println("1.���̴� : 1200");
		System.out.println("2.Ŀ�� : 800");
	}
	
	public void SetInputedMoney(int money) {
		my_money = my_money + money;
		
		System.out.println("���� ���Ե� �ݾ��� " + my_money + "���Դϴ�.");
	}
	

	
	public String getBeverage(int num) {
		
		int coke = 1000;
		int saida = 1200;
		int coffee = 800;
		
		if (num == 0) {
			if (my_money >= coke) {
				my_money = my_money - coke;
				System.out.println("�ݶ� �����̽��ϴ�.");
				System.out.println("���� ���Ե� �ݾ��� " + my_money + "���Դϴ�.");
				return "�ݶ�";
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
		}else if(num == 1) {
			if (my_money >= saida) {
				my_money = my_money - saida;
				System.out.println("���̴ٸ� �����̽��ϴ�.");
				System.out.println("���� �ܾ��� " + my_money + "���Դϴ�.");
				return "���̴�";
			}else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
		}else if (num == 2) {
			if (my_money >= coffee) {
				my_money = my_money - coffee;
				System.out.println("Ŀ�Ǹ� �����̽��ϴ�.");
				System.out.println("���� �ܾ��� " + my_money + "���Դϴ�.");
				return "Ŀ��";
			}else {
				System.out.println("�ܾ��� �����մϴ�.");
			}	
		}
		return "NULL";
	}
}
