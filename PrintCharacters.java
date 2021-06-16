public class PrintCharacters{

     
            public static void main(String []args){
        
                    char letter='A';
        
                    int ascii=66;
   
                    System.out.println("The Alphabetic characters :");     
                    while(ascii<92){
            
                           System.out.println(letter);
            
                           letter=(char)ascii;
           
                           ascii++;
        
                     }
     
}
}