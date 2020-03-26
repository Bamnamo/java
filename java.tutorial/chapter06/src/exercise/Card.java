package exercise;

public class Card {
	private static int seriaNum = 1000;
	private int cardNumber;

	Card (){
		seriaNum++;
		cardNumber = seriaNum;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber() {
		this.cardNumber = cardNumber;
	}
}
