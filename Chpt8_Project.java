// Kristian Dimitrov
import java.util.Scanner;
public class Chpt8_Project {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Create 2D array with 10 rows and 2 columns
		int[][] employees = new int [10][2];
		
		System.out.print("Enter the current age (between 19-70) and desired retirement age (62, 66 or 70) for " + employees.length + " employees: ");
		
		// Populate the array with user input and display the current age, retirement age, and years of work remaining for each employee
		for (int i = 0; i < employees.length; i++) {
			for (int j = 0; j < employees[0].length; j++)
				employees[i][j] = input.nextInt();
		}
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println("\nThe current age and disired retirment age for employee #" + (i + 1) + " is: " + employees[i][0] + "  " + employees[i][1]);
			System.out.println("\nEmployee #" + (i + 1) + " has to work " + (employees[i][1] - employees[i][0]) + " years before they can retire");
		}
	}
}
