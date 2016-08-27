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
public class Menu {
    static int menuChoice ;	
	
	static private void displayFirstMenu(){
		
		System.out.println("> Choose one of the options below : ");
		
		System.out.println("2- Add a book to the Library.");
		System.out.println("0- Exit.");
		

	}
	
	static private void displaySecondMenu(){
		
		System.out.println("> Choose one of the options below : ");
		
		System.out.println("1- Check library list.");
		System.out.println("2- Add a book to the Library.");
		System.out.println("3- Delete a book.");
		System.out.println("0- Exit.");
		
		
	}
	
	static void displayMenu(){
		if(Library.bookList.isEmpty()){
			displayFirstMenu();
			Menu.menuChoice = Console.readInteger(Messages.choiceMessage, Messages.tryAgainMessage, 0, 7);
		}else if(Library.bookList.size() > 0){
			displaySecondMenu();
			Menu.menuChoice = Console.readInteger(Messages.choiceMessage, Messages.tryAgainMessage, 0, 7);
		}
	}

}
    

