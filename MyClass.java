import java.util.Scanner; //imports scanner class

public class MyClass {
<<<<<<< HEAD

   
    public static void main(String args[]) {

    intro();
    stump(6, getRows());
    printfood();
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
=======
   
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

>>>>>>> 1d66820c313fecfed4c21b333748c846a11e52a5

	public static void row(int spaces, int stars){
          int i = 0;
          for(i = 0; i < spaces; i++){
              System.out.print(" ");
          }
<<<<<<< HEAD
 for(i = 0; i < stars; i++){
=======
          for(i = 0; i < stars; i++){
>>>>>>> 1d66820c313fecfed4c21b333748c846a11e52a5
              System.out.print("*");
          }
          System.out.print("*");
          for(i = 0; i < stars; i++){
              System.out.print("*");
          }
          System.out.print("\n");
<<<<<<< HEAD
 //          stump(5,getRows());
    }
    
    
  public static void stump(int width, int rows){ //Varibles can be changed; Need varible for width
  int i = 0;
=======
    }
  public static void stump(int width, int rows){ //Varibles can be changed; Need varible for width
>>>>>>> 1d66820c313fecfed4c21b333748c846a11e52a5
for(i=0; i < rows/4; i++){  //I think this is correct but it needs to be tested
    
    for (i=0; i < width/3; i++){
System.out.print("  ");
    }
    for (i=0; i <= width/3; i++){
        System.out.print("*");
    }
}
}
}