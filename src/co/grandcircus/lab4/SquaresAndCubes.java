package co.grandcircus.lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquaresAndCubes {

    public static void main(String[] args) {
	numberTableProgramLoop();
    }

    /**
     * This method contains the primary logic loop for the program. It asks the user
     * to enter an integer, then generates a table of the user's integer's squares
     * and cubes. This method loops if the user specifically requests it.
     */
    private static void numberTableProgramLoop() {
	Scanner scnr = new Scanner(System.in);
	String cont;
	int input;
	
	// Run program as long as user wants to continue
	do {
	    // Prompt user to enter a positive integer
	    input = getValidInput(scnr);
	    scnr.nextLine(); 	/* clear trash values */

	    // Display table of squares and cubes from 1 through the user's integer
	    printNumSquareCubeTable(input);

	    // Ask user if they would like to enter another integer
	    cont = confirmContinue(scnr);

	} while (cont.equalsIgnoreCase("y"));

	// Close scanner resource
	scnr.close();
    }

    /**
     * This method takes a Scanner as a parameter, prompts a user to enter an
     * integer and then returns that integer. If the user does not input an integer,
     * or enters a negative integer, it informs the user that a positive integer is
     * required, and looping until one is entered.
     * 
     * @param Scanner
     * @return Integer
     */
    private static int getValidInput(Scanner scnr) {
	boolean inputIsValid = false;
	int input = 0;

	do {
	    System.out.print("Please enter a positive integer: ");
	    try {
		input = scnr.nextInt();
		if (input > 0) {
		    inputIsValid = true;
		} else {
		    System.out.println("\n -- You must enter a positive integer! --\n");
		    scnr.nextLine(); /* Clear trash values */
		}
	    } catch (InputMismatchException ime) {
		System.out.println("\n -- You must enter a positive integer! --\n");
		scnr.nextLine(); /* Clear trash values */
	    }
	} while (!inputIsValid);

	return input;
    }

    /**
     * This method takes an integer as a parameter, then uses defined style settings
     * to print a table displaying the squares and cubes of each number from 1
     * through the integer parameter.
     * 
     * @param integer
     */
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

    /**
     * This method asks if the user would like to continue. It takes a scanner as a
     * parameter and returns the user's answer as a string.
     * 
     * @param Scanner
     * @return String
     */
    private static String confirmContinue(Scanner scnr) {
	System.out.println("\nWould you like to enter another integer? (y/n)");
	return scnr.nextLine();
    }

}
