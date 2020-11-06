import java.util.Scanner;  // Import the Scanner class

public class MyClass {
    public static void main(String args[]) {
      Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("How Many Times?");

    int times = myObj.nextInt();  // Read user input
    int trunkwidth = Math.round((times * 2 - 1) / 3);
    int trunkheight = times / 4;
    int trunkspace = Math.round((times * 2 - 1) / 3 + 1);
    if ( (trunkwidth & 1) == 0 ) {
    trunkwidth = trunkwidth -1 ;
    } 
    if (times == 5){
        trunkspace = trunkspace -1;
    }
    if (times == 8){
        trunkspace = trunkspace -1;
    }
    for(int i=0; i < times; i++){
    row(times - i,i * 2 + 1);
   // trunk(trunkwidth, trunkwidth);
    }
    for(int i = 0; i < times / 4; i++){
    trunk(trunkspace , trunkwidth);
    }
    
    
    }
    
    public static void row(int spaces, int stars){
         for(int i = 0; i < spaces; i++){
             System.out.print(" ");
         }
    for(int i = 0; i < stars; i++){
    System.out.print("*");
    }
    System.out.print("\n");
    }
      public static void trunk(int spaces, int stars){
          for(int i = -1; i < spaces; i++){
             System.out.print(" ");
          }
           for(int i = 0; i < stars; i++){
    System.out.print("*");
    }
    System.out.print("\n");
      }
    
}
     
