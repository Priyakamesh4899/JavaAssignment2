package Assignment;

public class MainClass {
       public static void main(String args[])
       {
    	   Lion L=new Lion("Flesh meat","yes","America","Vandalur zoo");
    	   Tiger T=new Tiger("Meat","No","India","Bombay");
    	   Cat C =new Cat("Milk,fish","no","India","Small villages");
    	   wolf W=new wolf("Chicken","yes","Australia","Mountains");
    	   Hippo H=new Hippo("Veggies","yes","Africa","Forests");
    	   Dog D=new Dog("Bone","yes","Home","India");
    	   System.out.println(L);
    	   L.eat();
    	   L.makeNoise();
    	   L.roam();
    	   L.sleep();
    	   System.out.println(C);
    	   C.eat();
    	   C.makeNoise();
    	   C.roam();
    	   C.sleep();
    	   System.out.println(D);
    	   D.eat();
    	   D.makeNoise();
    	   D.roam();
    	   D.sleep();
    	   System.out.println(H);
    	   H.eat();
    	   H.makeNoise();
    	   H.roam();
    	   H.sleep();
    	   System.out.println(W);
    	   W.eat();
    	   W.makeNoise();
    	   W.roam();
    	   W.sleep();
    	   System.out.println(T);
    	   T.eat();
    	   T.makeNoise();
    	   T.roam();
    	   T.sleep();
       }
}
