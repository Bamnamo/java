package exercise;

public class CoffeeBean {
	int money;
	
	public String brewing(int money) {
		this.money += money;
		
		if(money == Menu.BEANAMERICANO) {
			return "커피빈 아메리카노를 구입헀습니다";
		}
		else if(money == Menu.BEANLATTE) {
			return "커피빈 라떼를 구입했습니다";
		}
		else {
			return null;
		}
	}

}
