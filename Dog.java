package Assignment;

public class Dog extends Cannine{
       Dog(){}
       public Dog(String food, String hunger, String boundaries, String location) {
		super(food, hunger, boundaries, location);
		// TODO Auto-generated constructor stub
	}

	public void makeNoise() {
   		System.out.println("Bow Bow");
   		
   	   }

   	public void sleep() {
   		System.out.println("Sleeps");
   	}

   	public void eat() {
   		System.out.println("Dog eats "+food);	
   	}
	@Override
	public String toString() {
		return  "Dog [food=" + food + ", hunger=" + hunger + ", boundaries=" + boundaries + ", location=" + location
				+ "]";
	}
   	
}
