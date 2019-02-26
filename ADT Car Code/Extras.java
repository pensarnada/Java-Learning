package Car;

public abstract class Extras {
	boolean accidenthappened = false;
	
	public void accident() {
		this.accidenthappened = true;
	}
	public abstract void sethorsepower(int hp);

	public abstract int gethorsepower();
}
