import java.util.Scanner;
public class MyClass {
    static int i = 0;
    public static void main(String args[]) {
      Scanner myObj = new Scanner(System.in);
      System.out.println("How Many Times?");
      int times = myObj.nextInt();
      
      for (i=0; i < times; i++){
       row(i-i/2,i);
          
      }
    }
    public static void row(int spaces, int stars){
      for (i=0; i < spaces; i++){
          System.out.print(" ");
      }
      for (i=0; i < stars; i++){
          System.out.print("*");
      }
      System.out.print("\n");
}
public static void stump(int width, int height){
    for (i=0; i <= width; i++){
        System.out.print("*");     //TODO
    }
}
}