import java.util.Scanner;

public class okay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scnr = new Scanner(System.in);
	// Program where you find speed//
	//speed = d/t//
	
	double userSpeed;
	double userDistance;
	double userTime;
	
	
	System.out.println("Hello, please enter your distance traveled.");
	userDistance = scnr.nextInt();
	
	
	
	System.out.println("Please enter the time it takes to travel:");
	userTime = scnr.nextInt();
	
	
	
	
	System.out.println("Your speed is : "  + (userDistance / userTime));
	
	
	
	
	
	
	
	
	
	}

}
