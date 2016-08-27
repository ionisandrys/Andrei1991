/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CatalogLibrarie;

/**
 *
 * @author Andrei
 */
public class User {
    /** The user name.
     I want the application to ask for the user name, is nothing important
     */
	static String userName;
	
	/**
	 * Need a name for the user, so I create one method to do that.
         * If the user introduces just one character, the application warns that
         * the character is too short. I chose just one character, nothing 
         * important for application
	 */
	static void addUser(){
		userName = Console.readString("\n> Enter your name: \n\n", Messages.tryAgainMessage, 1);	
	}

}
    

