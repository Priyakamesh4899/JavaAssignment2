package Assignment;

public class Lion extends Feline{
    Lion(){}
	public Lion(String food, String hunger, String boundaries, String location) {
		super(food, hunger, boundaries, location);
		// TODO Auto-generated constructor stub
	}

	public void makeNoise() {
		System.out.println("Lion Roars");
		
	}

	public void sleep() {
		System.out.println("Sleeps");
	}

	public void eat() {
		System.out.println("Lion eats "+ food);	
	}
	@Override
	public String toString() {
		return "Lion [food=" + food + ", hunger=" + hunger + ", boundaries=" + boundaries + ", location=" + location
				+ "]";
	}
	
}
