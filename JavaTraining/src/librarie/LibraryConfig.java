/*
 *    Class LibraryConfig
 *    In this class, we create methods for adding, delete and listing books and
 *  we create the menu in console
 *    It contains the main method 
 */
package librarie;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
import java.util.LinkedList;
import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Andrei
 */
public class LibraryConfig {
    
    // method for getting user input and validating it is a number
    public static int userInput() {
        
        int userChoice = 0;
        Scanner inputValue = new Scanner(System.in); // Scanner object
        
   // java.util.Scanner has many hasNextXXX methods that can be used to validate input.
   // For Java primitives, we use hasNextInt() method, for an integer, in this case
   //   for user input, which in an integer ( ex 1, 2, 3, 4)
   
            System.out.println("Choose an option: ");
            if (inputValue.hasNextInt()) {
                userChoice = inputValue.nextInt();
           
            } else {
                System.out.println("Invalid input.");
                inputValue.next();
    // An inputValue.next() statement to advance the Scanner until it hasNextInt()
            }
        return userChoice;
    } //end of method for validating user input

    // Creating the main menu
    public static void displayFirstMenu() {
        
        System.out.println("              < CHOOSE AN OPTION >            ");
        System.out.println("1. Add book");
        System.out.println("2. Delete book");
        System.out.println("3. List books");
        System.out.println("4. Quit");
        
    } // end of method displayFirstMenu();
   private static final Logger Mesaj = LogManager.getLogger(LibraryConfig.class);
    // method to add book
    static void addBook(LinkedList<Book> bookList) {
        LinkedList<Book> list = bookList; // <Book> type elements in collection
      
        System.out.printf("1. Novel\n2. Art album\n");
      
            int option = userInput();
            if (option == 1) {
                Novel newBook = new Novel();
                System.out.println("Write novel title");
                Scanner nume = new Scanner(System.in);
                newBook.setTitle(nume.nextLine());
                
                // check if number of pages is > 5 
                    System.out.println("Number of pages");
                    int pages = userInput();
                    if (pages > 5) {
                        newBook.setBookPages(pages);
                    } else {
           System.out.println(" Number of pages must be at least five !");
                    }
               
                System.out.println("Kind");
                Scanner bookType = new Scanner(System.in);
                newBook.setNovelType(bookType.nextLine());
                // add the new book in the list
                list.add(newBook);
              System.out.println("Novel added");
        //     PropertyConfigurator.configure("log4j.properties");
               Mesaj.info("New novel created: " + newBook.showList());
           
               } else if (option == 2) {
                ArtAlbum newBook = new ArtAlbum();
                System.out.println("Art Album title");
                Scanner nume = new Scanner(System.in);
                newBook.setTitle(nume.nextLine());

                // validation of number of pages
                    System.out.println("Number of pages ");
                    int pages = userInput();
                    if (pages > 5 ) {
                        newBook.setBookPages(pages);
                   
                    } else {
                System.out.println("Number of pages must be at least five");
                 }
          // end validation of number of pages

                System.out.println("Paper quality");
                Scanner paperType = new Scanner(System.in);
                newBook.setQuality(paperType.nextLine());
                // add the new book in the list
                list.add(newBook);
            System.out.println("Art album added");
            Mesaj.info("New ArtAlbum added: " + newBook.showList());
           } 
            } // end of method add book

    // method to delete book
    
    static void deleteBook(LinkedList bookList) {
        LinkedList lista = bookList;
        if (lista.isEmpty()) {
            System.out.println("Library is empty !");
            System.out.println("");
        } else {
            listBooks(lista); // list all the books
            System.out.println("Select the number of book to delete");
      
                int newInput = userInput(); // variable to store the user input
                // index validation
                if ((newInput <= 0) || (newInput > lista.size())) {
                    System.out.println("The book does not exist !!!");
                } else {
                    lista.remove(newInput - 1);
                    System.out.println("Book removed");
                    System.out.println("");
                //    PropertyConfigurator.configure("log4j.properties");
              Mesaj.warn("Item deleted: ");
                } // end of validation of index to delete
        }
    } // end of method delete book

    // method to list books
    static void listBooks(LinkedList bookList) {
        int listIndex = 0;
        LinkedList lista = bookList;
        System.out.println("       3. List Books      ");
        System.out.println("");
        try {
            while (lista.get(listIndex) != null) {
                Book currentBook;
                currentBook = (Book) lista.get(listIndex);
                System.out.println((listIndex + 1) + ". " + currentBook.showList());
                listIndex++;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("");
            System.out.println("------------ End List Books --------------------");
            System.out.println("");
            Mesaj.fatal("End of book list");
        }
    } // end of method list books
    
    // method to save all books in one external file named bookstore.txt
   public static void bookStoreTxt(Book bookName) {
     // the following bookstore.txt is in the project folder   
        try (BufferedWriter text = new BufferedWriter(new FileWriter("bookstore.txt", true))) {
            text.write(bookName.showList()); // write in the bookstore.txt the list of books
            text.newLine(); // jumps to the next line
            Mesaj.info("Book added to bookstore.txt.");
        } catch (IOException exc) {
      System.out.println("Unable to create file bookstore.txt " + exc.getMessage());
            Mesaj.fatal("Unable to create file bookstore.txt." );
        }
    } // end method add new created book to bookstore.txt
    
    //      creating a new exception named "NotExistingBook"
     public static class NotExistingBook extends Exception {

        public NotExistingBook() {
            System.out.println("Required book didn't exist in our bookstore.");
        }
    }
      
      // method for searching a book in list
   public static void bookSearch(LinkedList bookList) throws NotExistingBook {
        LinkedList lista = bookList;
        Book currentBook;
        if (lista.isEmpty()) {
            System.out.println("No book in the list.");
        } else {
            System.out.println("Enter the title of the book to search...");
            Scanner bookTitle = new Scanner(System.in);
            String searchedBook = bookTitle.nextLine();
            boolean found = false;
            int i = 0;
            do {
                currentBook = (Book)lista.get(i);
                if ( searchedBook.equals(currentBook.getTitle()) ) {
                    System.out.println("Book is in the list");
                    System.out.println((i + 1) + ". " + currentBook.showList());
                    found = true;
                }
                i++;
            } while (!found && i < lista.size());
            if (!found) {
                throw new NotExistingBook();
            }
        }
    } // end method search book
    // main method
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Novel book1 = new Novel();
        book1.setTitle("STEAUA SUDULUI");
        book1.setBookPages(259);
        book1.setNovelType("Aventura");

        Novel book2 = new Novel();
        book2.setTitle("CAPITANUL HATTERAS");
        book2.setBookPages(314);
        book2.setNovelType("Aventura");

        Novel book3 = new Novel();
        book3.setTitle("LA LILIECI");
        book3.setBookPages(851);
        book3.setNovelType("Aventura");
        
        Novel book4 = new Novel();
        book4.setTitle("BALTAGUL");
        book4.setBookPages(236);
        book4.setNovelType("Drama");
        
        Novel book5 = new Novel();
        book5.setTitle("INGERI SI DEMONI");
        book5.setBookPages(569);
        book5.setNovelType("Actiune");
        
        ArtAlbum book6 = new ArtAlbum();
        book6.setTitle("LUCHIAN");
        book6.setBookPages(216);
        book6.setQuality("Premium");
        
         ArtAlbum book7 = new ArtAlbum();
        book7.setTitle("GRIGORESCU");
        book7.setBookPages(340);
        book7.setQuality("Premium");
        
         ArtAlbum book8 = new ArtAlbum();
        book8.setTitle("VIATA CA O PASIUNE");
        book8.setBookPages(616);
        book8.setQuality("Standard");
        
         ArtAlbum book9 = new ArtAlbum();
        book9.setTitle("MONUMENTE MEDIEVALE");
        book9.setBookPages(132);
        book9.setQuality("Premium");
        
         ArtAlbum book10 = new ArtAlbum();
        book10.setTitle("REGELE MIHAI");
        book10.setBookPages(352);
        book10.setQuality("Premium");

        LinkedList<Book> listOfBooks = new LinkedList<>();
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);
        listOfBooks.add(book5);
        listOfBooks.add(book6);
        listOfBooks.add(book7);
        listOfBooks.add(book8);
        listOfBooks.add(book9);
        listOfBooks.add(book10);

        // starting application
        displayFirstMenu();
         boolean continuareAplicatie = false;
       do {
            int choice = userInput();
            switch (choice) {
                case 1:
                    addBook(listOfBooks);
                    displayFirstMenu();
                    break;
                case 2:
                    deleteBook(listOfBooks);
                    displayFirstMenu();
                    break;
                case 3:
                    listBooks(listOfBooks);
                    displayFirstMenu();
                    break;
                case 4:
                    System.out.println("Quiting");
                    continuareAplicatie = true;
                    break;
                default:
                    System.out.println("That is not an option in the list. Try again.");
                    break;
            }
        } while (!continuareAplicatie);
    }
}
  // End
       /**
       // public enum Select { S1, S2, S3, S4}
          public  enum Selectare {
            S1{
                public void Sel1(){
                    LinkedList<Book> listOfBooks = new LinkedList<>();
                    addBook(listOfBooks);
                    displayFirstMenu();
                     }
            },
            S2{
                public void Sel2(){
                   LinkedList<Book> listOfBooks = new LinkedList<>();
                   deleteBook(listOfBooks);
                    displayFirstMenu();
                }
            },
            S3{
                public void Sel3(){
                    LinkedList<Book> listOfBooks = new LinkedList<>();
                    listBooks(listOfBooks);
                    displayFirstMenu();
                }
                    
                },
            
            S4{
                public void Sel4(){
                 LinkedList<Book> listOfBooks = new LinkedList<>();  
                  System.out.println("Quiting");
                }
}
        }*/
        /**
        int keyboard = userInput();
        if( keyboard ==1){
            addBook(listOfBooks);
                    displayFirstMenu();
          }else if( keyboard ==2){
            deleteBook(listOfBooks);
                    displayFirstMenu();
                 }else if(keyboard == 3){
                   listBooks(listOfBooks);
                    displayFirstMenu();  
                 }else if(keyboard==4){
                     System.out.println("Quiting");
                 }
                 */ 



    

