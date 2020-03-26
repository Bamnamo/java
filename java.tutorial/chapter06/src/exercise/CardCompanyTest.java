package exercise;

public class CardCompanyTest {
	public static void main(String[]args) {
		CardCompany company = CardCompany.getInstance();
		
		Card myCard = company.createCard();
		Card yourCard = company.createCard();
		Card himCard = company.createCard();
		
		System.out.println(myCard.getCardNumber());
		System.out.println(yourCard.getCardNumber());
		System.out.println(himCard.getCardNumber());
	}
	

}
