/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberHolderAndFixProgram;

/**
 *
 * @author Andrei
 */
public class NumberHolder {
    // declaring member variables ( fields)
    private int anInteger;
    private float aFloat;
    
    public static void main(String[] args){
        //creating objects and assign each to a variable
        //declaration, instantiation(new) and initialization, below
        NumberHolder numar = new NumberHolder();
        numar.anInteger = 2;
        numar.aFloat = 5.6f;
        //display messages
        System.out.println("Primul număr este : " + numar.anInteger);
	System.out.println(" Al 2-lea număr este : " + numar.aFloat);
        
    }
    }
