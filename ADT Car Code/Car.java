package Car;

public class Car implements ICar {
	int numberofwheels = 2;
	double thespeed = 0;
	int horsepower = 0;
	
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
	
}
