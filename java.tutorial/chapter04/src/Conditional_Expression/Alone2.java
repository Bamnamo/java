package Conditional_Expression;

public class Alone2 {
	public static void main(String[] args) {
		String floor = "Six";
		
		switch(floor) { 
		 case "Frst" :
			 System.out.println("1층 약국입니다.");
			 break;
		 case "second" :
			 System.out.println("2층 정형외입니다.");
			 break;
		 case "Third" :
			 System.out.println("3층 피부과입니다.");
			 break;
		 case "Fourth" :
			 System.out.println("4층 치과입니다.");
			 break;
		 case "Fifth" :
			 System.out.println("5층 헬스클럽입니다.");
			 break;
		default :
			System.out.println("존재하지 않는 층입니다.");
		}
		
	}

}
