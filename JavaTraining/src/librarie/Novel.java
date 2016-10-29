/*
 * Class Novel extends the parent class, Book
   Novels have paper quality
 */
package librarie;

/**
 *
 * @author Andrei
 */
public class Novel extends Book {
    
    private String NovelType;
    public String getNovelType() {
        return NovelType;
    }

    public void setNovelType(String NovelType) {
        this.NovelType = NovelType;
    }
    // Overwrite showList() method from Book class
    // "super" calls showList() method from the parrent class, Book class
    
    @Override
    public String showList() {  
        String callFromParrent = super.showList();
         // Defining how to display message in console, for Art Album
        String nvl = "Kind: Novel; Type: " + getNovelType() + callFromParrent;
        return nvl;
   }
}
    

