package chapter9.step1;

public class CatTest {
	public static void main(String[]args) {
		Bus bus = new Bus();
		AutoCar autocar = new AutoCar();
		
		bus.run();
		autocar.run();
		
		bus.refuel();
		autocar.refuel();
		
		bus.takePassenger();
		autocar.load();
		
		bus.stop();
		autocar.stop();
		}
}
