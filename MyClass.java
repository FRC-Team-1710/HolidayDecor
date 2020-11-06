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
  public static void stump(int width, int rows){ //Varibles can be changed; Need varible for width
for(i=0; i < rows/4; i++){  //I think this is correct but it needs to be tested
    
    for (i=0; i < width/3; i++){
        System.out.print(" ");
    }
    for (i=0; i <= width/3; i++){
        System.out.print("*");
    }
}
}
}