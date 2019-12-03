


	import java.util.Scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Start keyboard and declare variables
		Scanner keyboard = new Scanner(System.in);
		
				int menuChocice;
				double balence  = 0.00;
					double withdrawlAmount = 0.00;
					double depositAmount = 0.00;
					
				
					System.out.println("Main menu");
					System.out.println("=========");
					System.out.println("1. Make deposit");
					System.out.println("2. View Balence");
					System.out.println("Exit");
					System.out.println("What would you like to do");
					
	
					{
						
					}
					
					
					
						
					
					
						
					do
					{
						menu(); 
				menuChoice = keyboard.nextInt()
					
						
				switch(menuChoice)
					{	
				case 1:
					System.out.println("How much would you like to deposit?");
					depositAmount = keyboard.nextDouble();
					balence = deposit(balence, depositAmount);
					break;
				case 2:
					System.out.println("How much would you like to deposit?");
					withdrawalAmount = keyboard.nextDouble();
					balence = withdrawal(balence, withdrawalAmount);
					
					break;
				case 3:
					displayBalence(balence);
					break;
				case 4:
					break;
				default:
					System.out.println("That is an invlaid choice. Please re-enter");
				
						
					
					while(menuchoice !=4);
					
					public static double deposit(double bal, double dep)
					{
						//double newBalence = 0.00
						//newBalence = bal=dep;
						//return(newBalence);
						return (bal+dep);
						public static double withdrwal(double bal, double dep)
						{
							return(bal-wit)
									public static void displayBalence(double bal)
									{
								System.out.println("Your balence is : $" + bal);
								if(bal<0)
								
									{
									System.out,println("Your balence is")
									}
								}
									}
							
								}
									}
	}

}
