/**
 */
//Project Name: Program 2
//Author: Ashawn Berry
//version: 1.0
//Last modified: 9/23/19
package program2;


import java.util.Scanner;
public class program2 {
	

	
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	//Dont forget to turn the keyboard on and turn it off
		// TODO Auto-generated method stub
	// The outcome should allow you to select any number
	// The outcome should also be like using a calculator.
	
int first = 0;
int secound = 0;
int third = 0; 
//The variable determines the outcome fore your answers
System.out.println("Main Menu");
System.out.println("================");
System.out.println("What is your first number?");
first = keyboard.nextInt();
System.out.println("What is your secound number?");
secound = keyboard.nextInt();
System.out.println("What is your third number?");
third = keyboard.nextInt();


System.out.println("1.) Add");
System.out.println("2.) Subtract");
System.out.println("3.) Multiply");
System.out.println("4.) Divide");
// These will be your menu options that you can choose from
int choice = keyboard.nextInt();
double ans;

switch(choice) {
case 1: 
	//addition formula
	ans= first + secound;
	System.out.println(first + "+" + secound + "=" + ans);
	if (ans > third) {
		System.out.println(ans + " is greater than " + third);
		}
	else if (ans < third) {
		System.out.println(ans + "is less than" + third);
	}
	else {
		System.out.println(ans + " is equal to " + third);
	}
	break;
case 2: 
	//subtraction formula
	ans= first - secound;
	System.out.println(first + "-" + secound + "=" + ans);
	if (ans > third) {
		System.out.println(ans + " is greater than " + third);
		}
	else if (ans < third) {
		System.out.println(ans + "is less than" + third);
	}
	else {
		System.out.println(ans + " is equal to " + third);
	}
	break;
case 3: 
	//multiplication formula
	ans= first * secound;
	System.out.println(first + "*" + secound + "=" + ans);
	if (ans > third) {
		System.out.println(ans + " is greater than " + third);
		}
	else if (ans < third) {
		System.out.println(ans + "is less than" + third);
	}
	else {
		System.out.println(ans + " is equal to " + third);
	}
	break;
case 4: 
	// Division formula
	ans= first / secound;
	System.out.println(first + "/" + secound + "=" + ans);
	if (ans > third) {
		System.out.println(ans + " is greater than " + third);
		}
	else if (ans < third) {
		System.out.println(ans + "is less than" + third);
	}
	else {
		System.out.println(ans + " is equal to " + third);
	
	}
	break;
	default:
			System.out.println("Thank you.  Good bye.");
			
			//close keyboard
			keyboard.close();
	
}
	}
	//Security static return name (Pass in)
	//would be public static void if you were not sending 
	
	public static int addition(int first, int secound)
	{
		int ans = first + secound;	
		return ans; 
	}
	
	public static int subtraction(int first, int secound)
	{
		int ans = first - secound;
		return ans; 
	}

}
