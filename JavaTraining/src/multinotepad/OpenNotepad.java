/*
 * Main class to create 3 instances of Notepad and testing it
 */
package multinotepad;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrei Ionescu
 */
public class OpenNotepad {

    
     public static void main(String[] args) {
        // try catch block
        try{
   // Use process builder to start 3 processes multinotepad.OpenNotepad with parameter
        ProcessBuilder pb; 
        pb = new ProcessBuilder("Notepad");

                Process notepad1 = pb.start();
                Process notepad2 = pb.start();
                Process notepad3 = pb.start();
                Logger.getLogger(OpenNotepad.class.getName()).log(Level.INFO, "Begin instantiating");
    
        }catch (IOException ex) {
                Logger.getLogger(OpenNotepad.class.getName()).log(Level.WARNING, "Attention, failed to instantiate.");
            }

        }
    }
   // end
/**  We could use also a for loop inside the try-catch block, for 3 processes
 * for (int i = 0; i < 3; i++) {
   Process notepad = pb.start();
    Logger.getLogger(OpenNotepad.class.getName()).log(Level.INFO, "Begin instantiating", i);
 * 
 */