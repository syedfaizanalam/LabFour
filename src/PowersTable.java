import java.util.Scanner;

public class PowersTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		int num;
		String input;
		
		do {
		
		System.out.println("Please enter a number");	
		num = scnr.nextInt();
			
		System.out.printf("Number");
		System.out.printf("%15s", "Squared");
		System.out.printf("%15s %n", "Cubed");
		System.out.printf("======");
		System.out.printf("%15s", "=======");
		System.out.printf("%15s %n", "=====");
		for(int i = 1; i <= num; i++) {
			System.out.printf("%-14d", i);
			System.out.printf("%-17d", i*i);
			System.out.printf("%-16d %n", i*i*i);}
		
		System.out.println("Would you like to continue? [y/n]");
		input = scnr.next();
		}while(input.equals("y"));
	System.out.println("Goodbye");
	}
}
			

		
			
		