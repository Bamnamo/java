package singleton;

public class CarFactoryTest {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car mySonta = factory.createCar();
		Car yourSonta = factory.createCar();
		System.out.println(mySonta.getCarNum());
		System.out.println(yourSonta.getCarNum());
		
	} 

}
