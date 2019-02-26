package Car;

public class Test {
	public static void main(String[] args) {
		Car serce = new Car(4, 100.00);
		System.out.println("Number of wheels: "+serce.getWheels());
		System.out.println("Car's speed is: "+serce.getSpeed());
	}
}
