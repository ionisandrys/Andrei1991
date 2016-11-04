/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemaHashMap;
import java.util.HashMap;
/**
 *
 * @author Andrei
 */
public class HashBook {
    



	public static void main(String[] args) {

		HashMap<String, Evaluation> map = new HashMap<String, Evaluation>();
		map = init();
		// iterate to all the keys stored on our hashmap
		for (String s : map.keySet()) {
			// print the books characteristics
	System.out.println("Title:" + s + "\n"
        +  "Pages: " + map.get(s).getPages() + "\n"+"Kind: " + map.get(s).getKind() + "\n"+ 
    "Type " + map.get(s).getType() + "\n" + "UserID: "+ map.get(s).getUserID() + 
        "\n" + map.get(s).getDescription()+ "\n" + "Rating: " + map.get(s).getStars()+"\n");
		}
	}

	private static HashMap<String, Evaluation> init() {
		// initialize our book objects
    // The set of delimiters (the characters that separate tokens) are "|". 
		Evaluation s1 = new Evaluation(
				"STEAUA SUDULUI|259|Novel|Aventura|42342|Un roman de aventura|4.5");
                Evaluation s2 = new Evaluation(
				"BALTAGUL|236|Novel|Drama|12342342|Călătoria Vitoriei Lipan pe urmele soțului ei|3.5");
                Evaluation s3 = new Evaluation(
				"CAPITANUL HATTERAS|314|Novel|Roman SF|181342342|Sea adventure novel|5.0");
                Evaluation s4 = new Evaluation(
				"REGELE MIHAI|352|ArtAlbum|Premium|1913341|Imagini din viata unui rege|5.0");
		

		// initialize of hashmap
		HashMap<String, Evaluation> map = new HashMap<String, Evaluation>();

		// assign each book title as key and the Evaluation objects as values on
		// our hashmap
		map.put(s1.getTitle(), s1);
                map.put(s2.getTitle(), s2);
		map.put(s3.getTitle(), s3);
                map.put(s4.getTitle(), s4);

		return map;
	}

}
    

