package exercise;
import java.util.ArrayList;

public class DogArrayList {
	public static void main(String[] args) {
		ArrayList<Dog> house= new ArrayList<Dog>();
		
		house.add(new Dog("가론", "허스키"));
		house.add(new Dog("순자", "치와와"));
		house.add(new Dog("가발이", "맬러뮤트"));
		house.add(new Dog("댕자", "요크셔테리어"));
		house.add(new Dog("강짜", "웰시코기")); 
		
		for(int i =0; i<house.size(); i++) {
			System.out.println(house.get(i).showDogInfo());
		}
		
		for(Dog dog : house) {
			System.out.println(dog.showDogInfo());
		}
	}


}
