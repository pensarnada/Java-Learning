package Car;

public class Test {
	public static void main(String[] args) {
		Car serce = new Car(4, 100.00);
		serce.setHorsepower(50);
		serce.setAccident();
		System.out.println("Is the car has an accident record? "+serce.getAccident());
		System.out.println("Number of wheels of serce: "+serce.getWheels());
		System.out.println("Speed of serce: "+serce.getSpeed());
		System.out.println("Horse-power of serce:"+serce.getHorsepower());

	}
}
