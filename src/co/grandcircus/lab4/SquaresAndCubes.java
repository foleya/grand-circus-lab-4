package co.grandcircus.lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquaresAndCubes {

    public static void main(String[] args) {
	numberTableProgramLoop();
    }

    private static void numberTableProgramLoop() {
	Scanner scnr = new Scanner(System.in);
	String cont;
	int input;
	do {
	    // Prompt user to enter an integer
	    input = getInput(scnr);

	    // Clear trash values
	    scnr.nextLine();

	    // Display table of squares and cubes from 1 through the user's integer
	    printNumSquareCubeTable(input);

	    // Ask user if they would like to enter another integer
	    cont = confirmContinue(scnr);

	} while (cont.equalsIgnoreCase("y"));
    }

    private static String confirmContinue(Scanner scnr) {
	System.out.println("\nWould you like to enter another integer? (y/n)");
	return scnr.nextLine();
    }

    private static void printNumSquareCubeTable(int input) {
	// Define header and div styles
	String div = "=======";
	String spacing = "\t";

	// Print table header
	System.out.println("\nNumber" + spacing + "Squared" + spacing + "Cubed");
	System.out.println(div + spacing + div + spacing + div);

	// Print numbers, their squares, and their cubes
	for (int i = 1; i <= input; i++) {
	    System.out.println(i + spacing + (i * i) + spacing + (i * i * i));
	}
    }

    private static int getInput(Scanner scnr) {
	boolean inputIsValid = false;
	int input = 0;

	do {
	    System.out.print("Please enter an integer: ");
	    try {
		input = scnr.nextInt();
		inputIsValid = true;
	    } catch (InputMismatchException ime) {
		System.out.println("\n -- You must enter an integer! --");
		scnr.nextLine();		/* Clear trash values */
	    }
	} while (!inputIsValid);
	
	return input;
    }

}
