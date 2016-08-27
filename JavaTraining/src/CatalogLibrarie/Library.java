
package CatalogLibrarie;

import java.util.ArrayList;

/**
 *
 * @author Andrei
 */
public class Library {
    /** The books choice. */
	public static int bookChoice;
	
	static String returnBookTitle;	
	
	/** The books list. */
	static ArrayList<Book> bookList = new ArrayList<>();
	
	
	
	/**
	 * Adds the book.
	 */
	static void addBook(){
		Book newBook = new Book(); //create newBook object 
		newBook.createBook();
		bookList.add(newBook);//add the book to the BookList ArrayList.
			
	}

	/**
	 * Display book list.
	 */
	static void displayBookList(){
		if (bookList.isEmpty()){//If the library is empty, it goes back to main menu and choice.
			
			System.out.println(Messages.empltyLibraryMessage + Messages.tryAgainMessage);
			
			Menu.menuChoice = 2;
			
		} else {					
			for (int i = 1; i < bookList.size(); i++){
				System.out.printf("\n>-----------Book number: [%s]--------------\n",i);
				System.out.println(bookList.get(i).displayBook());	
				
			}//End of For Loop.			
		}// End of Else Statement.			
	}//End of if Statement.
	
	/**
	 * Removes the book.
	 */
	public static void removeBook(){
		
		int i = 1;
		
		while (i < bookList.size()){//show the user the list of all the books
			displayBookList();
			i = i+1;
		}//end of while loop.
                bookChoice = Console.readInteger(Messages.enterRemoveBookIndex ,Messages.bookIndexNotInListMessage + Messages.tryAgainMessage, 0, bookList.size());
		
		bookList.remove(bookChoice);
		System.out.print(Messages.successRemovedBookMessages);
		Menu.menuChoice = 1;
	}
	
	
	
}
    

