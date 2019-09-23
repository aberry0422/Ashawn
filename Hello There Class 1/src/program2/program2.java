/**
 */
package program2;


import java.util.Scanner;
public class program2 {
	

	
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
		// TODO Auto-generated method stub
int first = 0;
int secound = 0;
int third = 0; 

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
int choice = keyboard.nextInt();
double ans;

switch(choice) {
case 1: 
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
	
}
	}
	

}
