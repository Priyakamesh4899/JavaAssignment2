package Assignment;

public abstract class Animals {
	String food;
	String hunger;
	String boundaries;
	String location;
	Animals(){};
	public Animals(String food, String hunger, String boundaries, String location) {
		super();
		this.food = food;
		this.hunger = hunger;
		this.boundaries = boundaries;
		this.location = location;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getHunger() {
		return hunger;
	}
	public void setHunger(String hunger) {
		this.hunger = hunger;
	}
	public String getBoundaries() {
		return boundaries;
	}
	public void setBoundaries(String boundaries) {
		this.boundaries = boundaries;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public abstract void makeNoise();
	public abstract void sleep();
	public abstract void roam();
	public abstract void eat();
	
	
        
}
