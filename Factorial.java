import java.util.Scanner;

public class Factorial{
    
             public static void main(String []args){
        
                      int num;
        
                      Scanner x=new Scanner(System.in);
                              System.out.println("Enter the value of the Number whose Factorial is to be calculated:");
       
                      num=x.nextInt();
        
                      System.out.println("Factorial of "+ num+" is = "+factorial(num));
       
              }
    
              static int factorial(int n)
{
        
                      int res=1,x=2;
        
                      while(x<=n)
{
 
                             res=res*x;
            
                             x++;
        
                      }
        
                      return res;
    
 }
}