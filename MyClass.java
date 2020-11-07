import java.util.Scanner; //imports scanner class

public class MyClass {
	public static void main(String args[]) {
		intro();
		int times=getRows(); 
		
		int trunkNumber;
        
        if((1+2*times)%3 >= 2){
            trunkNumber = (1+2*times)/3 + 1;
        }else{
            trunkNumber = (1+2*times)/3;
        }
        
        for(int i=0; i<times; i++){
            row(times-i,1+2*i);
        }
        stump((1+2*times), times);
	}    


	public static void intro(){
		System.out.println("Christmas Trees!\nYou will be prompted to enter the number of rows to comprise the height of the tree.\nThe program will then calculate how exactly to make the top half, and then the stump.");
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
		for(int i = 0; i < spaces; i++){
			System.out.print(" ");
		}
		for(int i = 0; i < stars; i++){
			System.out.print("*");
		}
		System.out.print("\n");
	}


	public static void stump(int width, int rows){ //Varibles can be changed; Need varible for width
    	for(int i=0; i < rows/4; i++){  //I think this is correct but it needs to be tested
    
    		for (i=0; i < width/3; i++){
    			System.out.print(" ");
    		}
    		for (i=0; i <= width/3; i++){
    			System.out.print("*");
    		}
    	}
	}
}
