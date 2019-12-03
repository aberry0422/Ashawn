//Project Name: Program 3
//Author: Ashawn Berry
//version: 1.0
//Last modified: 9/23/19	

import java.util.Random;
import java.util.Scanner;
public class profgame;

package Professor;

public class Professor {
// Declare universal variables
	//note the security and privacy settings
	public String name = "Mr.Messner";
	public int likeableScale;
	private String office;
	//Constructor
	//The constructor is used to load default settings or values
	//This will only execute the class is first created
	public Professor()
	{
		likeableScale = 5;
		office = "Lynch 103";
		System.out.println("You have been assigned a professor!\n\n");
	}
	public void displayinfo() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	public void like()
	{
		if(likeableScale==10)
			System.out.println("\n\n Hold on! You can't like your professor any more!\n\n");
		else
			likeableScale++;
		}
	public void dislike()
	{
		int number;
		if(likeableScale > number)
			System.out.println("\n\n zzyou like your professor too much - why would you \n\n");
		else
			System.out.println("\n\n You have sucessfukky thrown your your professor");
			likeableScale = 5;
	}
	
	public void throwProf(int number)
	{
		if(likeableScale==10)
			System.out.println("\n\n Hold on! You can't like your professor any more!\n\n");
		else
			likeableScale++;
	}

	
	public void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber= new Random();
		int randomToss = 0;
		int menuchoice = 0;
		//Initialize an instance of the class Professor
		//we are only making one, but we could make as many we want
		//Professor profTwo = new Professor;
		Professor profone = new Professor();
		
		do
		{
			System.out.println("Throw Your Prof!");
			System.out.println("~=~=~=~=~=~=~=~=~=~=~=~=");
			System.out.println("1. Display Professor Information");
			System.out.println("2. Like Your Professor");
			System.out.println("3.Dislike Your Professor");
			System.out.println("4. Throw Your Professor!");
			System.out.println("5. Exit");
			System.out.println("What woukld you like to do?");
			menuChoice = keyboard.nextInt();
		
			switch(menuChoice)
			{
			case 1:
				profone.displayInfo();
				//profoneTwo.displayInfo();
				System.out.println(profone.name);
				break;
			case 2:
				profone.like();
				break;
			case 3:
				profone.dislike();
				break;
			case 4:
				randomToss = randomNumber.nextInt();
				profone.throwProf(randomToss);
				break;
			case 5:
				break;
				default: System.out.println("Please enter q valid choice. Your grade depends on it");
					
			
			}
			while(menuchoice != 5);
			//close keyboard
			keyboard.close();
}
