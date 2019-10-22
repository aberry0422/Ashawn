//Project Name: Program 5
//Author: Ashawn Berry
//version: 1.0
//Last modified: 10/20/19
package Professor;
import java.util.Scanner;
import java.util.Random;


public class Program5 {
	static Random randomNumber= new Random();
	static int pop = randomNumber.nextInt(10)+1;
	static boolean up = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		int pop = randomNumber.nextInt(10)+1;
		System.out.println("How many licks to get to the center of the Tootsie pop!");
		System.out.println("~=~=~=~=~=~=~=~=~=~=~=~=");
		
	while(pop>0) {
		System.out.println("1. Pick up ");
		System.out.println("2. Lick ");
		System.out.println("3. Exit");
		System.out.println("What woukld you like to do?");
		int choice = keyboard.nextInt();
		if (choice==2) 
			{
			System.out.println("How many times do you want to lick the Tootsie pop?");
			int choice1 = keyboard.nextInt();
			pop-=lick (choice1);
		}
		else if (choice==1)
			{
			pickUp();
		}
		if(choice==3) {
			pop=-6;
		}
		
	}
	if (pop==0) {
		System.out.println("You licked to the center");
	}
	else {
		System.out.println("You licked it too much");
	}
		 
		
	
	
	
		
	}

	public static int lick(int amount1){
		return amount1;
		}	
	public static boolean pickUp() 
	{
		return up = true;
	}
	public static void bite() {
		System.out.println("You bit it loser.");
	}
	

}
