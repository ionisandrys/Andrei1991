/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberHolderAndFixProgram;

import java.awt.Rectangle;
import java.util.Scanner;
public class FixProgram {

    public static void main(String[] args) {
        
        /*
        Fix the program:
        public class SomethingIsRight {
    public static void main(String[] args) {
        Rectangle myRect;
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }
}
*/
        //   First, we have to import the java.awt.rectangle package
        //   Then, we have to correctly declare, instantiate and 
        //  initialize the object, as below:
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        //System.out.println("myRect's area is " + myRect.area() );
        //   Metoda ,,area,, nu este definita in clasa Rectangle, compilatorul
        //nu recunoaste aceasta metoda
        //  Cea mai usoara metoda de a calcula aria este urmatoarea:
        double width = 20;
        double height = 30;
        double area = width*height;
        System.out.println(" Area is: " + area);
        
        //  A 2-a metoda este folosind clasa java.util.Scanner
        //  Am importat aceasta clasa
        // folosim metoda ,next' din clasa Scanner
        Scanner arie = new Scanner(System.in);
        System.out.println(" Introduceti valoarea pentru lungimea laturii");
        //Programul ne cere valoarea pentru lungime
        double lungime = arie.nextDouble();
        System.out.println("Introduceti valoarea pentru latimea laturii");
        // Programul ne cere valoarea pentru latimea laturii
        double latime = arie.nextDouble();
        double suprafata = lungime*latime;
        System.out.println("Aria este " + suprafata);
        
    }
}
    
    

