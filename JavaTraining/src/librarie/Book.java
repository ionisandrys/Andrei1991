/*
 * Class Book is the parrent class for ArtAlbum and Novel classes
   Both Novels and Art Albums have in common the title and the number of pages!
 */
package librarie;

/**
 *
 * @author Andrei
 */
     public class Book {
    private int Pages;
    private String Title;

    public int getBookPages() {
        return Pages;
    }

    public void setBookPages(int bookPages) {
        this.Pages = bookPages;
    }

    public String getTitle() {
        return Title;
    }

    
    public void setTitle(String Title) {
        this.Title = Title;
    }
    // Defining how to display message in console
    public String showList() {
        return ("; Name = " + Title + "; Number of pages = " + Pages);
    }
}
    

