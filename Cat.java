package Assignment;

public class Cat extends Feline{
	Cat(){}
	public Cat(String food, String hunger, String boundaries, String location) {
		super(food, hunger, boundaries, location);
		// TODO Auto-generated constructor stub
	}

	public void makeNoise() {
		System.out.println("Meow Meow");
	}

	public void sleep() {
		System.out.println("Sleeps");
	}

	public void eat() {
		System.out.println("Cat eats "+food);	
	}
	@Override
	public String toString() {
		return "Cat [food=" + food + ", hunger=" + hunger + ", boundaries=" + boundaries + ", location=" + location
				+ "]";
	}
	
}
