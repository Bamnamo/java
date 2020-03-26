package exercise;

public class Men {
	 String menName;
	 int money;
	
	 Men(String menName, int money) {
		this.menName = menName;
		this.money = money;		
	}
	
	public void buyStarbucks(StarBucks starbucks, int money) {
		String message = starbucks.brewing(4000);
		if(message != null) {
			this.money -=money;
			System.out.println(menName + " 님이 " + money + "으로 " + message);
		}
	}
	
	public void buyCoffeebean(CoffeeBean coffeebean, int money) {
		String message = coffeebean.brewing(4500);
		if(message != null) {
			this.money -=money;
			System.out.println(menName + " 님이 " + money + "으로 " + message);
	}
	
	
	}

}
