import java.util.Scanner; //imports scanner class

public class MyClass {

   
    public static void main(String args[]) {
     Scanner rowScanner = new Scanner(System.in);
    System.out.println("How many rows do you want in the tree height? ==>");
    int rows = rowScanner.nextInt();
    
int i = 0;
    intro();
    for(i = 0; i < rows; i++){
    row(rows - i, i * 2 + 1);
    }
    for(i = 0; i < rows/4; i++){
    stump(rows * 2 - 1,rows);
    }
    printfood();
        
}


  public static void intro(){
    System.out.println("Christmas Trees!\nYou will be prompted to enter the number of rows to comprise the height of the tree.\nThe program will then calculate how exactly to make the top half, and then the stump.");
    System.out.println();
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
public static void row(int spaces, int stars){
	int i = 0;
        for(i = 0; i < spaces; i++){
           System.out.print(" ");
          }
 	 for(i = 0; i < stars; i++){
            System.out.print("*");
          }
         System.out.print("\n");
    }
  public static void stump(int width, int rows){ 
  int i = 0;
for(i = 0; i < Math.round(rows/4); i++){  
    
    for (i=0; i < Math.round(width/3) + 1; i++){
System.out.print(" ");
    }
    for (i=0; i <= Math.round(width/3) - 1; i++){
        System.out.print("*");
    }
    System.out.print("\n");
}
}
}

