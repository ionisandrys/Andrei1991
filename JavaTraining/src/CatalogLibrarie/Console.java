/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CatalogLibrarie;

import java.io.IOException;

/**
 *
 * @author Andrei
 */
public class Console {
    private static final String CONSOLE = "> ";
	private static final String DEFAULT_PROMPT = "Enter input: ";
	private static final String DEFAULT_RETRY = "Invalid Input. Try again.";
	public static int readInteger(String prompt, String error, int min, int max) {
		if (min >= max) {
			return 0;   //Should not happen, but can if the client programmer is not paying attention
		}
 
		try {
			int i = Integer.valueOf((readLine(prompt)));
			if ((i < min) || (i > max)) {
				System.out.println(error);
				return readInteger(prompt, error, min, max);
			}
			return i;
		} catch (NumberFormatException e) {
			System.out.println(error);
			return readInteger(prompt, error, min, max);
		}
	}
 
	/**
	 * Prompts the user for an Integer input in a given range.
	 *
	 * @param prompt The message asking for user input.
	 * @param min The minimum valid input.
	 * @param max The maximum valid input.
	 * @return An integer in the range min..max
	 */
	public static int readInteger(String prompt, int min, int max) {
		return readInteger(prompt, DEFAULT_RETRY, min, max);
	}
 
	/**
	 * Prompts the user for an Integer input in a given range.
	 *
	 * @param min The minimum valid input.
	 * @param max The maximum valid input.
	 * @return An integer in the range min..max
	 */
	public static int readInteger(int min, int max) {
		return readInteger(DEFAULT_PROMPT, DEFAULT_RETRY, min, max);
	}
 
	/**
	 * Prompts the user for an Integer input.
	 *
	 * @param prompt The message asking for user input.
	 * @param error The error message to inform the user that the input was invalid.
	 * @return An integer
	 */
	public static int readInteger(String prompt, String error) {
		try {
			return Integer.valueOf((readLine(prompt)));
		} catch (NumberFormatException e) {
			System.out.println("\n" + error);
			return readInteger(prompt, error); 
		}
	}
 
	/**
	 * Prompts the user for an Integer input.
	 *
	 * @param prompt The message asking for user input.
	 * @return An integer
	 */
	public static int readInteger(String prompt) {
		return readInteger(prompt, DEFAULT_RETRY);
	}
 
	/**
	 * Prompts the user for an Integer input.
	 *
	 * @return An integer
	 */
	public static int readInteger() {
		return readInteger(DEFAULT_PROMPT, DEFAULT_RETRY);
	}
 
	/**
	 * Prompts the user for a Double input.
	 * 
	 * @param prompt The message asking for user input.
	 * @param error The message to inform the user about invalid input.
	 * @return A double
	 */
	public static double readDouble(String prompt, String error) {
		try {
			return Double.valueOf((readLine(prompt)));
		} catch (NumberFormatException e) {
			System.out.println("\n" + error);
			return readDouble(prompt, error);
		}
	}
 
	
 
	/**
	 * Prompts the user for a Double input.
	 * 
	 * @return A double
	 */
	 public static double readDouble() {
		return readDouble(DEFAULT_PROMPT, DEFAULT_RETRY);
	 }
 
	/**
	 * Prompts the user for a Float input.
	 *
	 * @param prompt The message asking for input.
	 * @param error The message informing the user that the input was invalid.
	 * @return A float
	 */
	public static float readFloat(String prompt, String error) {
		try {
			return Float.valueOf((readLine(prompt)));
		} catch (NumberFormatException e) {
			System.out.println("\n" + error);
			return readFloat(prompt, error);
		}
	}
 
	/**
	 * Prompts the user for a Float input.
	 *
	 * @param prompt The message asking for input.
	 * @return A float
	 */
	public static float readFloat(String prompt) {
		return readFloat(prompt, DEFAULT_RETRY);
	}
 
	/**
	 * Prompts the user for a Float input.
	 *
	 * @return A float
	 */
	public static float readFloat() {
		return readFloat(DEFAULT_PROMPT, DEFAULT_RETRY);
	}
 
	/**
	 * Prompts the user for a String input at least minLength in size.
	 *
	 * @param prompt The message asking for user input.
	 * @param error The message informing the user about invalid input
	 * @param minLength The minimum length of the string that is valid
	 * @return A string minLength or greater in length
	 */
	public static String readString(String prompt, String error, int minLength) {
		String input = readLine(prompt);
		if (input.length() < minLength) {
			System.out.println("\n" + error);
			return readString(prompt, error, minLength);
		}
 
		return input;
	}
 
	/**
	 * Prompts the user for a String input. It will prompt again if the user does not enter anything
	 *
	 * @param prompt The message asking for user input.
	 * @param error The message informing the user of invalid input
	 * @return A String
	 */
	public static String readString(String prompt, String error) {
		String input = readLine(prompt);
		if ((input.length() == 0) || (input == null) || (input.equals("\n"))) {
			System.out.println("\n" + error);
		}
 
		return input;		
	}
 
	/**
	 * Prompts the user for a String input.
	 *
	 * @param prompt The message asking for user input.
	 * @return A String
	 */
	public static String readString(String prompt) {		
		return readString(prompt, DEFAULT_RETRY);
	}
 
	/**
	 * Prompts the user for a String input.
	 *
	 * @return A String
	 */
	public static String readString() {
		return readString(DEFAULT_PROMPT, DEFAULT_RETRY);
	}
 
	/**
	 *  Working method, used by every single method in this class.
	 *  It uses the low level System.in.read() to build a StringBuffer containing
	 *  the users input and traps the user in an loop until ENTER is pressed.
	 *  In windows, the ENTER button returns /r/n which is dealt with in the loop.
	 */
	public static String readLine(String prompt) {
		System.out.print(prompt);
		System.out.print("\n");
		System.out.print(CONSOLE);
 
		StringBuffer b = new StringBuffer();
		while(true) {
			try {
				char c = (char) System.in.read();
				b.append(c);
				if (c == '\n') {
					return b.toString().trim();    //Enter pressed
				} else if (c == '\r') {					
				}   //Windows carriage return \r is followed by \n so we ignore it and pick it up on the next loop
			} catch (IOException e) { 				
			}     //Unsure what would cause this and what to do about it
		}
	}	
}
    

