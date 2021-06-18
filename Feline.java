package Assignment;

public abstract class Feline extends Animals {
	Feline(){}
	public Feline(String food, String hunger, String boundaries, String location) {
		super(food, hunger, boundaries, location);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Feline [food=" + food + ", hunger=" + hunger + ", boundaries=" + boundaries + ", location=" + location
				+ "]";
	}
	public void roam() {
    	System.out.println("Roam Daily");
}
}