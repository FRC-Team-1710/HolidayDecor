import java.util.Scanner; //imports scanner class

public class MyClass {
   
    public static void main(String args[]) {
        getRows();
        
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


