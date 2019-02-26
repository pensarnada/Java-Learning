package Car;

public class Car extends Extras implements ICar {
	private int numberofwheels = 2;
	private double thespeed = 0;
	private int horsepower = 0;
	
	public int getWheels() {
		return this.numberofwheels;
	}
	
	public void setWheels(int numberofwheels) {
		this.numberofwheels = numberofwheels;
	}

	public double getSpeed() {
		return this.thespeed;
	}
		
	public void getSpeed(double thespeed) {
		this.thespeed = thespeed;
	}
	
	public Car(int wheels,double speed) {
		this.numberofwheels = wheels;
		this.thespeed = speed;
	}
	public void sethorsepower(int hp) {
		this.horsepower = hp;
	}
		
	public int gethorsepower() {
		return this.horsepower;
	}
	
}
