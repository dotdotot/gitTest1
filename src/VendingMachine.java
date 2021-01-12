
public class VendingMachine {
	
	int my_money;
	
	VendingMachine(){
		
	}
	
	public void printAllBeverages() {
		// 출력 : 0.콜라 : 1000
	    // 출력 : 1.사이다 : 1200
	    // 출력 : 2.커피 : 800
		
		System.out.println("0.콜라 : 1000");
		System.out.println("1.사이다 : 1200");
		System.out.println("2.커피 : 800");
	}
	
	public void SetInputedMoney(int money) {
		my_money = my_money + money;
		
		System.out.println("현재 투입된 금액은 " + my_money + "원입니다.");
	}
	

	
	public String getBeverage(int num) {
		
		int coke = 1000;
		int saida = 1200;
		int coffee = 800;
		
		if (num == 0) {
			if (my_money >= coke) {
				my_money = my_money - coke;
				System.out.println("콜라를 뽑으셨습니다.");
				System.out.println("현재 투입된 금액은 " + my_money + "원입니다.");
				return "콜라";
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		}else if(num == 1) {
			if (my_money >= saida) {
				my_money = my_money - saida;
				System.out.println("사이다를 뽑으셨습니다.");
				System.out.println("남은 잔액은 " + my_money + "원입니다.");
				return "사이다";
			}else {
				System.out.println("잔액이 부족합니다.");
			}
		}else if (num == 2) {
			if (my_money >= coffee) {
				my_money = my_money - coffee;
				System.out.println("커피를 뽑으셨습니다.");
				System.out.println("남은 잔액은 " + my_money + "원입니다.");
				return "커피";
			}else {
				System.out.println("잔액이 부족합니다.");
			}	
		}
		return "NULL";
	}
}
