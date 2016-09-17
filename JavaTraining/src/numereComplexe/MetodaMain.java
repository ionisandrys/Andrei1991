/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numereComplexe;

/**
 *
 * @author Andrei
 */
public class MetodaMain {
    public static void main(String[] args) {
        // Creating 2 complex numbers 
        Complex a=new Complex(11,4), b=new Complex(3,9);
        
        // Messages in console
        System.out.println("I created two complex numbers: a = "+a+" and b = "+b+ ".");
        
        // Operations
        System.out.println("The absolute values of these numbers are |a|="+a.abs()+" and |b|="+b.abs()+".");
        System.out.println("The sum of these numbers is a+b= "+a.add(b)+ ".");
        System.out.println("The difference between these numbers is a-b= "+a.minus(b)+ ".");
        System.out.println("The product of these numbers is a*b= "+a.mult(b)+ ".");
        System.out.println("The ratio of these numbers is a / 7 = "+a.div(7)+ "."); 
        System.out.println("The negative of a is:" + a.neg());   
        System.out.println( "The complex conjugate of a is:" + a.conj());
        
        }

}
    

