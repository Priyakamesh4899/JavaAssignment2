import java.util.Scanner;
public class Vowels{
   
                public static void main(String []args){
        
                        String s=new String();
        
                        int len=0,count=0,i;
  
                        Scanner in =new Scanner(System.in); 
                                
                        System.out.println("Enter the String:");
                               
                        s=in.nextLine();
       
                        len=s.length();
        
                        for(i=0;i<len;i++)
        
                        {
            
                              if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' )
           
                              {
              
                                 count++;
          
                              }
        
                        }
       
                        System.out.println("No of vowels in the word "+s+" is "+count);
    
}
}