package quiz1;

//import Scanner in order to read input from user
import java.util.Scanner;

// import Math to be used later, during calculation
import java.lang.Math;

public class QB_Rating {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		// Prompt user to enter touchdowns
		System.out.print("Enter the number of touchdowns scored: ");
		// Assign that number to TD
		double TD = input.nextInt();
		// Prompt user to enter total yards
		System.out.print("Enter the total number of yards: ");
		// Assign that number to Yards
		double Yards = input.nextInt();
		// Prompt user to enter interceptions
		System.out.print("Enter the number of interceptions: ");
		// Assign that number to INT
		double INT = input.nextInt();
		// Prompt user to enter completions
		System.out.print("Enter the number of completions: ");
		// Assign that number to comp
		double comp = input.nextInt();
		// Prompt user to enter number of passes attempted
		System.out.print("Enter the number of passes attempted: ");
		// Assign that number to ATT
		double ATT = input.nextInt();
		
		/* The formula for the calculation is 
		 * passer rating = ((mm(a) + mm(b) + mm(c) + mm(d))/6) * 100 where 
		 * mm(x) = max(0, min(x, 2.375)) and
		 * a = (comp/ATT - 0.3) * 5
		 * b = (Yards/ATT - 3) * 0.25
		 * c = (TD/ATT) * 20
		 * d = 2.375 - ((INT/ATT) * 25)
		 */
		
		double a = (comp/ATT - 0.3) * 5;
		double b = (Yards/ATT - 3) * 0.25;
		double c = (TD/ATT) * 20;
		double d = 2.375 - ((INT/ATT)*25);
		double PasserRating = ((Math.max(0, Math.min(a, 2.375)) + Math.max(0, Math.min(b, 2.375)) + Math.max(0, Math.min(c, 2.375)) + Math.max(0, Math.min(d, 2.375))) / 6) * 100;
		
		System.out.print("The passer rating is: ");
		System.out.print(PasserRating); 
			
	

	}

}
