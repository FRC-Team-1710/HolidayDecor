import java.util.Scanner;  // Import the Scanner class

public class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("How many times?");
    
    int times = myObj.nextInt();
    
    int i = 0;
    for(i=0; i < times; i++) {
        row(i,i);
    }
      
  }

 public static void row(int tree){
    int i = 0;
    for(i = 0; i < tree; i++) {
        System.out.print(" ");
    }
    for(i = 0; i < stars; i++) {
        System.out.print("*");
        
        }
        System.out.print("\n");
    }
}

