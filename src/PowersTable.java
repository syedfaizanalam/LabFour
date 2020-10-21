import java.util.Scanner;

public class PowersTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		String input;
		int choice; 
		
		System.out.println("Good day, sir.");
		System.out.println("Would you like to make a multiplication table [1] or "
				+ "see a table of sqaured and cubed values [2]?");		
		
		//create program that asks user whether or not they want to choose b/w
		//option 1 or 2 and then whether or not they want to retry
		do {
		System.out.println("Please, enter 1 or 2.");	
		choice = scnr.nextInt();
		if(choice == 1) {
			multipTable();
		} else if (choice == 2) {
			table();
		} else {
			System.out.println("Sorry, invalid response.");
		}
		System.out.println("Would you like to try again? [y/n]");
		input = scnr.next();
		}while(input.contentEquals("y"));
		
		
	System.out.println("Goodbye");
	}
	
	public static void multipTable() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Let's make a multiplication table.");
		System.out.println("Enter a value to set the table's limit.");
		
		int numLimit = scnr.nextInt();
		
		for(int i = 1; i<=numLimit;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("------------------------------------------");
         
        for(int i = 1 ;i<=numLimit;i++) {
            // print left most column first
            System.out.format("%4d |",i);
            for(int j=1;j<=numLimit;j++) {
                System.out.format("%4d",i*j);
            }
            System.out.println();
        }
		
	}
	
	public static void table() {
		Scanner scnr = new Scanner(System.in);
		
		
		int num;
		
		
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
		
		
	}
	
}
			

		
			
		