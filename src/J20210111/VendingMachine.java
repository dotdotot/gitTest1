package J20210111;

public class VendingMachine {
	Beverage coke = new Beverage("�ݶ�", 1000);
	Beverage saida = new Beverage("���̴�", 1200);
	Beverage coffee = new Beverage("Ŀ��", 800);
	
	Beverage[] beverage = {coke,saida,coffee};
	
	public void printAllBeverages() {
		for (int i = 0; i < beverage.length; i++) {
			System.out.println(beverage[i].name + " : " + beverage[i].price);
		}
	}
	
	int inputedMoney;
	
	public void setInputedMoney(int Money) {
		inputedMoney = inputedMoney + Money;
		
		System.out.println("���� ���Ե� �ݾ��� " + inputedMoney + "�� �Դϴ�.");
	}
	
	public String getBeverage(int x) {
		
		if (inputedMoney >= beverage[x].price) {
			System.out.println(beverage[x].name + "�� �����̽��ϴ�.");
			inputedMoney = inputedMoney - beverage[x].price;
		}
		else {
			System.out.println("�ܾ��� �����մϴ�.");
			return "";
		}
		
		System.out.println("���� �ܾ��� " + inputedMoney + "�� �Դϴ�.");
		
		return beverage[x].name;
	}
}
