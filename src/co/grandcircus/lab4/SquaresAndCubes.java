package co.grandcircus.lab4;

import java.util.Scanner;

public class SquaresAndCubes {

    public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	int input;
	String cont;

	do {
	    // Prompt user to enter an integer
	    input = getInput(scnr);

	    // Display table of squares and cubes from 1 through the user's integer
	    printNumSquareCubeTable(input);
	    
	    // TODO: Need to deal with nextInt nextLine problem!!
	    // Ask user if they would like to enter another integer
	    cont = confirmContinue(scnr);
	    
	} while (cont.equalsIgnoreCase("y"));

    }

    private static String confirmContinue(Scanner scnr) {
	System.out.println("Would you like to enter another integer? (y/n)");
	return scnr.nextLine();
    }

    private static void printNumSquareCubeTable(int input) {
	// Define header and div styles
	String div = "=======";
	String spacing = "\t";
	
	// Print table header
	System.out.println("Number" + spacing + "Squared" + spacing + "Cubed");
	System.out.println(div + spacing + div + spacing + div);
	
	// Print numbers, their squares, and their cubes
	for (int i = 1; i <= input; i++) {
	    System.out.println(i + spacing + (i*i) + spacing + (i*i*i));
	}
    }

    private static int getInput(Scanner scnr) {
	System.out.print("Please enter an integer: ");
	return scnr.nextInt();
    }

}
