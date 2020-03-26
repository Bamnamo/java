package exercise;

public class BuyCoffee {
	public static void main(String[] args) {
		
		Men kim = new Men("Kim", 10000);
		StarBucks starbucks = new StarBucks();
		kim.buyStarbucks(starbucks, 4000);
		
		
		Men lee = new Men("lee", 10000);	
		CoffeeBean coffeebean = new CoffeeBean();
		lee.buyCoffeebean(coffeebean, 4500);
				
		
}
	
	
	


}
