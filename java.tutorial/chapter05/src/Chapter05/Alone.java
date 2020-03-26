package Chapter05;

public class Alone {
	String name;
	int age;
	boolean isMarried;
	int numberOfChildren;
	

	public static void main(String[] args) {
		Alone alone = new Alone();
		alone.age = 40;
		alone.name = "james";
		alone.isMarried = true;
		alone.numberOfChildren = 3;
		
		System.out.println("나이 :" + alone.age);
		System.out.println("이름 :" + alone.name);
		System.out.println("결혼 여부 :" + alone.isMarried);
		System.out.println("자녀 수 :" + alone.numberOfChildren);
		
		

	}

}
