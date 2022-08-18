package hw6IfElseCondition;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		System.out.println("Todays Temperature 105");
		Scanner scanner = new Scanner(System.in);
		int Temperature = scanner.nextInt();

		if (Temperature < 32) { 
			System.out.println("Freezing");

		} else if (Temperature < 55) {

			System.out.println("Pleasant");
		} else if (Temperature < 73) {

			System.out.println("Getting Warmer");
		} else if (Temperature < 101) {

			System.out.println("Hot");
		} else

			System.out.println("Ice on my Head Please");
	}
}
