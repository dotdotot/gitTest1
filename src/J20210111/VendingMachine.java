package J20210111;

public class VendingMachine {
	Beverage coke = new Beverage("콜라", 1000);
	Beverage saida = new Beverage("사이다", 1200);
	Beverage coffee = new Beverage("커피", 800);
	
	Beverage[] beverage = {coke,saida,coffee};
	
	public void printAllBeverages() {
		for (int i = 0; i < beverage.length; i++) {
			System.out.println(beverage[i].name + " : " + beverage[i].price);
		}
	}
	
	int inputedMoney;
	
	public void setInputedMoney(int Money) {
		inputedMoney = inputedMoney + Money;
		
		System.out.println("현재 투입된 금액은 " + inputedMoney + "원 입니다.");
	}
	
	public String getBeverage(int x) {
		
		if (inputedMoney >= beverage[x].price) {
			System.out.println(beverage[x].name + "를 뽑으셨습니다.");
			inputedMoney = inputedMoney - beverage[x].price;
		}
		else {
			System.out.println("잔액이 부족합니다.");
			return "";
		}
		
		System.out.println("남은 잔액은 " + inputedMoney + "원 입니다.");
		
		return beverage[x].name;
	}
}
