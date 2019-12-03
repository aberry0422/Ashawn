
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter = 0;
		int loopCounter = 15;
		int secoundLoopCounter = 8;
		
		//Highlight Increments
		System.out.println("Counter = " + counter);
		counter = counter + 1;
		System.out.println("Counter = " + counter);
		counter++;
		System.out.println("Counter = " + counter);
		++counter;
		System.out.println("Counter = " + counter);
		
		//While Loops
		// There is a change the while loop may never execute
		while(loopCounter >0)
		{
			loopCounter--;
			System.out.println("Loop Counter = " + loopCounter);	
		}
		
		
		//The do while loop is very similar
		//The do while loop is very guranteed to run at least one
		do {
			System.out.println("Secound Loop Counter = " + secoundLoopCounter);
			secoundLoopCounter++;
		}while (secoundLoopCounter !=19);
		
		
	}

}
