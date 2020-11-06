import java.util.Scanner; //imports scanner class

public class MyClass {
 
  public static void main(String args[]) {
    intro();
    getRows();
  }

  public static void intro(){
    System.out.println("Christmas Trees!\nYou will be prompted to enter the number of rows to comprise the height of the tree.\nThe program will then calculate how exactly to make the top half, and then the stump.");
  }

  public static int getRows() {

    Scanner rowScanner = new Scanner(System.in);
    System.out.println("How many rows do you want in the tree height? ==>");
    int rows = rowScanner.nextInt();
    
    
    int i = 0;
	for (i = 0; i < rows ; i++){
		row (rows - i, i);
    }
    return rows;
  }
  
	public static void row(int spaces, int stars){
          int i = 0;
          for(i = 0; i < spaces; i++){
              System.out.print(" ");
          }
          for(i = 0; i < stars; i++){
              System.out.print("*");
          }
          System.out.print("*");
          for(i = 0; i < stars; i++){
              System.out.print("*");
          }
          System.out.print("\n");
    }
}


