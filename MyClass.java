import java.util.Scanner;
 
public class MyClass {
    
    public static void main(String args[]) {
        
        Scanner myObj = new Scanner(System.in);
        int lines = myObj.nextInt();
        int spaceCount = lines;
        int starCount = 0;
        
        for (int x = 0; x < lines; x++){
            starsSpaces(starCount+x, spaceCount-x);
        }
        
        for (int x = 0; x < lines/4; x++){
            starsSpaces(lines/3, lines-lines/3);
        }
        
    }
    
    public static void starsSpaces(int stars, int spaces){
        
        for (int i=0;i<spaces;i++){System.out.print(" ");}
        
        for (int i=0; i < stars; i++){
            System.out.print("*");
        }
        System.out.print("*");
        for (int i=0; i < stars; i++){
            System.out.print("*");
        }
        for (int i=0; i < spaces; i++){
            System.out.print(" ");
        }
        System.out.print("\n");
    }
    
}