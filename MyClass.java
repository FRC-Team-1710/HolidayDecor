import java.util.Scanner; //imports scanner class

public class MyClass {
   
    public static void main(String args[]) {
      getRows();
    }

  public static int getRows() {
    Scanner rowScanner = new Scanner(System.in);
    System.out.println("How many rows do you want in the tree height? ==>");
    int rows = rowScanner.nextInt();
    return rows;
  }
}

