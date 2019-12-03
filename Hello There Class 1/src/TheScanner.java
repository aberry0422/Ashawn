

		// Import Required code
	import java.util.Scanner; 
public class TheScanner {
// Project Name: The Scanner
//Name: Ashawn C Berry
//Github:aberry0422
//Last Modified: 9/12/19
//Version: 1.0

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare variables
		int age;
		String name = "Ashawn";
	
		// Start keyboard scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Collect input from user
		System.out.print("What is your name? ");
		name = keyboard.next();
		System.out.print("What is your age? ");
		age = keyboard.nextInt();
		
		// Output User information
		System.out.println("\n" name + " is " age +  );
		
		// Close Keyboard
		keyboard.close();
		
		//Determine wjhat kind of drink is permitted.
		if (age < 21)
		{
			System.out.println("How about a nice glass of tea?");
		}
			else
		{
			System.out.println("You can drink whatver you want.");
		}
	}

}
