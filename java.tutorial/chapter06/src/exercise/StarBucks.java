package exercise;

public class StarBucks {
	int money;
	
	public String brewing(int money) {
		if(money == Menu.STARAMERICANO) {
			return "스타벅스 아메리카노를 구입헀습니다";
		}
		else if(money == Menu.STARLATTE) {
			return "스타벅스 라떼를 구입했습니다";
		}
		else {
			return null;
		}
	}
	
	
}
