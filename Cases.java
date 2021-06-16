import java.util.Scanner;

public class Cases{
    
             public static void main(String []args){
        
                         int choice;
                         char key;
                 
        Scanner x=new Scanner(System.in);
        
                         while(true){
        
                                 System.out.println("Press Any Key:\n1- MOVE RIGHT\n2- MOVE LEFT\n3- MOVE UP\n4- MOVE DOWN\nq- EXIT");
                                                                                         key = x.next().charAt(0);
                         
        if(key=='q')
        
                                 {

                                     break;
         
                                 }

                                 else{
                                 choice=(int)key;
                                 switch(choice){

                                 case 49:

                                     System.out.println("MOVE RIGHT");
 
                                 break;
 
                                 case 50:
                     
                System.out.println("MOVE LEFT");
                     
            break;
                     
            case 51:
                     
                System.out.println("MOVE UP");
                     
            break;
                     
            case 52:
                     
                System.out.println("MOVE DOWN");

                                 break;
                     
            default:
                     
                System.out.println("Try again. Acceptable input: [1 - Move right, 2 - Move Left, 3 - Move Up, 4 - Move Down, q - exit program]");
                     
            break;
       
 }
}
}}}