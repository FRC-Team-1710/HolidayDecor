
import java.util.Scanner; //imports scanner class


public class MyClass {
   
    public static void main(String args[]) {

    getRows(); 
    printfood();
        
}
   public static int getRows() {
    Scanner rowScanner = new Scanner(System.in);
    System.out.println("How many rows do you want in the tree height? ==>");
    int rows = rowScanner.nextInt();
    return rows;

    
    }
public static void printfood(){
   
   //Printing the favorite foods start
   
   System.out.println();
   System.out.println("Cooper's favorite food is pancakes");
   System.out.println("Rahi's favorite food are eggs");
   System.out.println("Gaven's favorite food is steak");
   System.out.println("Charlie's favorite food is ice cream!");
   System.out.println("Andrew's favorite food is pizza");
   
   //Printing the favorite foods end
   
   
}
  
}

