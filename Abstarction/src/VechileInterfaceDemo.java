
public class VechileInterfaceDemo {
	public static void main(String[] args) {
		Vechile bike = new Bike();
		bike.start();
		bike.move();
		bike.stop();
		
		Vechile car = new Car();
		car.start();
		car.move();
		car.stop();
		
		Vechile Auto = new Auto();
		Auto.start();
		Auto.move();
		Auto.stop();
	}
}
