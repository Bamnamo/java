package exercise;

public class DogTest {
	public static void main(String[]args) {
		Dog[] house = new Dog[5];
		
		house[0] = new Dog("가론", "허스키");
		house[1] = new Dog("순자", "치와와");
		house[2] = new Dog("가발이", "맬러뮤트");
		house[3] = new Dog("댕자", "요크셔테리어");
		house[4] = new Dog("강짜", "웰시코기");
		
		for(int i=0; i<house.length; i++) {
			house[i].showDogInfo();
		}
		for(int i=0; i<house.length; i++) {
			System.out.println(house[i]);
		}
		
	}

}
