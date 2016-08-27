
package CatalogLibrarie;

import java.util.Scanner;

/**
 *
 * @author Andrei
 */
public class Book {
        String title;
	String pages;
	String kind;
	String type;
	String paperQuality;
		
	
	Scanner userInput = new Scanner(System.in);	
	
	/**
	 * Display the book:
	 * @return BookInfo
	 */
	final String displayBook(){
		
		               String BookInfo = 
						"\nTitle:.................."+title+
						"\nPages:.................."+pages+
						"\nKind:..................."+kind+ 
						"\nType:..................."+type+
						"\nPaper:.................."+paperQuality+
						"\n----------------------------";
		return BookInfo;	
	}	
	
	/**
	 * Following method creates the book.
	 */
	final void createBook(){
	
		title = Console.readString(Messages.enterTitleMessage);
		pages = Console.readString(Messages.enterPagesMessage);
		kind = Console.readString(Messages.enterKindMessage);
		type = Console.readString(Messages.enterTypeMessage);
                paperQuality = Console.readString(Messages.enterpaperQualityMessage);
		
	}	
	
	/**
	 * Runs the main part of the program and finish if
         * the user selects  0.
	 */
	public void run(){
		// Call for addUser method in User class
		User.addUser();
		Menu.displayMenu();//Displays the main menu and ask for choice.
		
		exit:			
			while(Menu.menuChoice != 0){
				
// Choice 1: Display all the books:
//   If the user selects 1 and there is at least one book added, then the method
//  displayBookList is called from Library class, then the menu appears
				if(Menu.menuChoice == 1 && Library.bookList.size() > 0){						
					Library.displayBookList();
					Menu.displayMenu();
				}
// If the library is empty, a message appears that tell user to try again 				
				if(Menu.menuChoice == 1 && Library.bookList.isEmpty()){
					System.out.println(Messages.invalidInputMessage);
					Menu.displayMenu();
				}
				
//Choice 2:	Adding a book: the user selects 2 in keyboard, and the addBook
          //  method is called, from Library class, then the menu pops up
				
				if(Menu.menuChoice == 2){
					//createBook();
					Library.addBook();
					Menu.displayMenu();
				}
				
				

//Choice 3:	Removing a book: almost the same principle as choice 1
				
				if(Menu.menuChoice == 3 && Library.bookList.size() > 0){
						Library.removeBook();
				}
					
				if(Menu.menuChoice == 3 && Library.bookList.isEmpty()){
					System.out.println(Messages.invalidInputMessage);
					Menu.displayMenu();
				}

				
//Choice 4:	Display main Menu:
				
				if(Menu.menuChoice == 4){
					if(Library.bookList.size() > 0){
						Menu.displayMenu();
					}else if(Library.bookList.isEmpty()){							
						Menu.displayMenu();
					}
				}
				
//Choice 0:	Exit the program:
				
				if(Menu.menuChoice == 0){
					break;
				}				
				
			}//end of while loop.
		
		System.out.println("  You have Exited the Library!");
		
		
	}//End of run method.

}

