import java.util.Scanner;
	// Project Name: The Switch
	//Name: Ashawn C Berry
	//Github:aberry0422
	//Last Modified: 9/17/19
	//Version: 1.0
	
// Import
	
public class Switch {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Start Keyboard scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Declare variabkes
		int choice; 
		
		//Display menu and get user input
		System.out.println("Main Menu");
		System.out.println("=======\n");
		System.out.println("1.) Say Yeah!");
		System.out.println("2.) Say Hooray!");
		System.out.println("3.) Say Goodbye");
		System.out.println("4.) Exit");
		System.out.println("Please make a choice (1-4)");
		choice = keyboard.nextInt();
		
		// Note, if you wanted to input a char. Char's a bit
		// char choice;
		// choice = keyboard.next().charAt(0);
		
		// Output content
		switch (choice)
		{
		case 1:
			System.out.println("Yeah!");
			break;
		case 2:
			System.out.println("Hooray!");
			break;
		case 3:
			System.out.println("Goodbye");
			break;
		case 4: 
			System.out.println("Thankls for stopping by.");
			break;
		default:
			System.out.println("You made an invalid choice.");
			// Notice no need for a break
		}
		// Close the keyboard
		keyboard.close();
		
		
		
		
	}

}
