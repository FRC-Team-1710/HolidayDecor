import java.util.Scanner;

public class MyClass {
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many time?");
		int times = input.nextInt();
		
		
		for(int i = 0; i < times;i++){
			for(int j = 0; j < times - i; j++){
				System.out.print(" ");
			}
			for(int k = 0; k <= i * 2 + 1; k++){
				System.out.print("*");
			}
			System.out.println("*");
		}
			for(int i = 0; i <= times; i++){
				for(int j = 0; j < times;j++){
					System.out.print(" ");
				}
				System.out.println();
			}
		}
}