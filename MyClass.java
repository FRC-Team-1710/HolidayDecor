import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How many times?");
    
        int times = myObj.nextInt();
    
        for(int i=0; i<times; i++){
            row(times-i,1+2*i);
            System.out.print("\n");
        }
        for(int i=0; i<times/3; i++){
            row((2*(times-1)/2), 1+2*times-2*((2*(times-1)/2)));
            System.out.print("\n");
        }
    }
    
    public static void row(int spaces, int stars){
        for(int i=0; i<spaces; i++){
            System.out.print(" ");
        }
        for(int i=0; i<stars; i++){
            System.out.print("*");
        }
    }
}