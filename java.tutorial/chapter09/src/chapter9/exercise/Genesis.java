package chapter9.exercise;

public class Genesis extends Car {

	@Override
	public void start() {
		System.out.println("Genesis 시동을 켭니다");
	}

	@Override
	public void drive() {
		System.out.println("Genesis 달립니다");
	}

	@Override
	public void stop() {
		System.out.println("Genesis 멈춥니다");
	}

	@Override
	public void turnoff() {
		System.out.println("Genesis 시동을 끕니다");
	}

	@Override
	public void washCar() {
		System.out.println("세차를 합니다");
		
	}

}
