package Assignment;

public abstract class Cannine extends Animals {
	Cannine(){}
  
    public Cannine(String food, String hunger, String boundaries, String location) {
		super(food, hunger, boundaries, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cannine [food=" + food + ", hunger=" + hunger + ", boundaries=" + boundaries + ", location=" + location
				+ "]";
	}
	public void roam() {
    	System.out.println("Roam Rarely");
    }
}
