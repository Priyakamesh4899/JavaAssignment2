package Assignment;

public class wolf extends Cannine {
	  wolf(){}
      
      public wolf(String food, String hunger, String boundaries, String location) {
		super(food, hunger, boundaries, location);
		// TODO Auto-generated constructor stub
	}

	public void makeNoise() {
  		System.out.println("wolf howls");
  		
  	   }

  	public void sleep() {
  		System.out.println("Sleeps");
  	}

  	public void eat() {
  		System.out.println("Wolf eats "+food);	
  	}
	@Override
	public String toString() {
		return "wolf [food=" + food + ", hunger=" + hunger + ", boundaries=" + boundaries + ", location=" + location
				+ "]";
	}
}
