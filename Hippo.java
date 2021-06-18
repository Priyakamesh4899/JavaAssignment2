package Assignment;
public class Hippo extends Animals{
	Hippo(){}
	public Hippo(String food, String hunger, String boundaries, String location) {
		super(food, hunger, boundaries, location);
		// TODO Auto-generated constructor stub
	}
	public void makeNoise() {
		System.out.println("Hippo growls");
	}

	public void sleep() {
		System.out.println("Sleeps");
	}

	public void eat() {
		System.out.println("Hippo eats "+ food);	
	}
	public void roam() {
		System.out.println("Doesnt roam");
		
	}
	@Override
	public String toString() {
		return "Hippo [food=" + food + ", hunger=" + hunger + ", boundaries=" + boundaries + ", location=" + location
				+ "]";
	}
	
	

}
