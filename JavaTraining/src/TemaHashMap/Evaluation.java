
package TemaHashMap;

/**
 *
 * @author Andrei
 */
import java.util.StringTokenizer;
// The java.util.StringTokenizer class allows to break a string into tokens.
// Its methods do not distinguish among identifiers, numbers, and quoted strings.
public final class Evaluation {

	public Evaluation(String s) {
		/*
		 * Pattern is Title|Pages|Kind|Type|UserID|Description|Stars
		 */

		// initializer our tokenizer
		StringTokenizer st = new StringTokenizer(s, "|");
		// set the values
        // nextToken() method returns the next token from this string tokenizer.
		this.setTitle(st.nextToken());
		this.setPages(st.nextToken());
		this.setKind(st.nextToken());
		this.setType(st.nextToken());
		this.setUserID(st.nextToken());
                this.setDescription(st.nextToken());
                this.setStars(st.nextToken());

	}
        String title;
        String pages;
        String kind;
	String type;
	String userID;
	String description;
        String stars;

         // getters and setters
	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

        public String getStars() {
                return stars;
    }

        public void setStars(String stars) {
                this.stars = stars;
    }
 
         
	

}
