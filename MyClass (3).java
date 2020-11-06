/* import java.util.Scanner;  // Import the Scanner class

public class MyClass {
    public static void main(String args[]) {
        
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("How many Times?");

    int times = myObj.nextInt();  // Read user input
    
      int i = 0;
      for(i=0; i < times; i++){
          row(times-i,i);
          
      }
      
      
      
      
    } */
    
    public static void row(int spaces, int stars){
          int i = 0;
          
          for(i=0; i < spaces; i++){
              System.out.print(" ");
          }
          
          for(i=0; i < stars; i++){
              System.out.print("*");
          }
          
          System.out.print("*");
          
          for(i=0; i < stars; i++){
              System.out.print("*");
          }
          
          System.out.print("\n");
    }
//}