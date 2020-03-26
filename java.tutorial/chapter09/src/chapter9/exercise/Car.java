package chapter9.exercise;

public abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	public abstract void washCar();
	
	

	public void run() {
		start();
		drive();
		stop();
		turnoff();	
		washCar();
	}
}
