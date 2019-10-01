//Project Name: Program 3
//Author: Ashawn Berry
//version: 1.0
//Last modified: 9/23/19

package program3;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int num = 0;
		String name;
		int onSwitch=1;
		Scanner keyboard = new Scanner(System.in);
		//Don't forget to turn the keyboard on and turn it off
		System.out.println("What is your name?");
	
		name = keyboard.next();
			System.out.println("Pick a number between 1 and 100");
		while(onSwitch ==1) {
				if (num >0 && num<101) {
					System.out.println("Thank you for your input " +name+"!" );
		onSwitch = 0;
				}
				else {
					System.out.println("Type a number in between 1 and 100");
					num = keyboard.nextInt();
				}
		}
	//end of the loop
		for(int i = num; i >0; i--) {
			if (num==1) {
				System.out.println("There's " +num+ " jerseys on the shelf" +num+ " jersey on the shelf\n take one down, look all around, there is no jeresy on the shelf! ");
		System.out.println("\n");
		}
		else{
			System.out.println("There's " +num+ " jerseys on the shelf" +num+ " jersey on the shelf\n take one down, look all around, now there is " +(num-1)+ " jerseys on the shelf");
			System.out.println("\n");
		num--;
		
			}
	}
	
}
}		
	

		
		
		
		
	



	


