/*
 * Class ArtAlbum extends the parent class, Book
   Art Albums have paper quality
 */
package librarie;

/**
 *
 * @author Andrei
 */

    public class ArtAlbum extends Book {
    
    private String quality;
    
    // getter and setter 
    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

         // Overwrite showList() method from Book class
    // "super" calls showList() method from the parrent class, Book class
       @Override
          public String showList() {  
            String callFromParrent = super.showList();
            
            // Defining how to display message in console, for Art Album
        String abm = "Kind: Art Album; Paper quality: " + getQuality() + callFromParrent;
          return abm;
    }
}
    
    

