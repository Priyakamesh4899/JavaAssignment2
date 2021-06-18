package Assignment;

public class Tiger extends Feline{
	Tiger(){}
	public Tiger(String food, String hunger, String boundaries, String location) {
		super(food, hunger, boundaries, location);
		// TODO Auto-generated constructor stub
	}

	    public void makeNoise() {
			System.out.println("Tiger snarls");
		}

		public void sleep() {
			System.out.println("Sleeps");
		}

		public void eat() {
			System.out.println("Tiger eats "+food);	
		}
		@Override
		public String toString() {
			return "Tiger [food=" + food + ", hunger=" + hunger + ", boundaries=" + boundaries + ", location="
					+ location + "]";
		}
		
		
}
