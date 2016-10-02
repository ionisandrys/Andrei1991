
package numereComplexe;

/**
 *
 * @author Andrei
 */
   /**
 * This class creates a complex number, and allows me to do arithmetic
 * operations with these numbers.
  
 */
public final class Complex {
    // The number is represented by this form: X+i*Y.
    public final double x, y;
    //   I allow anyone to access these numbers so i have used
    //  the public modifier. 
        
    /** The following constructor builds the real and imaginary parts. */
    public Complex(double real_part, double imaginary_part) {
        x=real_part;
        y=imaginary_part;
    }
    
    /** Construct a real number. */
    public Complex(double real_part) {
        x=real_part;
        y=0;
    }

    // Basic operations on Complex numbers. 
    
    /** Return the real part. */
    public double re(){
        return x;
    }
    
    /** Return the imaginary part. */
    public double im(){
        return y;
    }

    /** Return the complex conjugate
     * @return  */
    public Complex conj() {
        return new Complex(x,-y);
    }
    
    /** Return the square of the absolute value.
     * @return  */
    public double absSquared() {
        return x*x+y*y;
    }
    
    /** Return the absolute value. */
    public double abs() {
        
        return Math.sqrt(absSquared());
    }
        
    // Operatii
    
    /** Add a complex number to this one.
     * 
     * @param z The complex number to be added.
     * @return A new complex number which is the sum.
     */
    public Complex add(Complex z) {
        return new Complex(x+z.x, y+z.y);
    }
    
    /** Subtract a complex number from this one.
     * 
     * @param z The complex number to be subtracted.
     * @return A new complex number which is the sum.
     */
    public Complex minus(Complex z) {
        return new Complex(x-z.x, y-z.y);
    }

    /** Negate this complex number.
     * 
     * @return The negation.
     */
    public Complex neg() {
        return new Complex(-x, -y);
    }
    
    /** Compute the product of two complex numbers
     * 
     * @param z The complex number to be multiplied.
     * @return A new complex number which is the product.
     */
    public Complex mult(Complex z) {
        return new Complex(x*z.x-y*z.y, x*z.y+z.x*y);
    }

    /** Divide this complex number by a real number.
     * 
     * @param q The number to divide by.
     * @return A new complex number representing the quotient.
     */
    public Complex div(double q) {
        return new Complex(x/q,y/q);
    }
    
    /** Return the multiplicative inverse. */
    public Complex inv() {
        // find the square of the absolute value of this complex number.
        double abs_squared=absSquared();
        return new Complex(x/abs_squared, -y/abs_squared);
    }

    /** Compute the quotient of two complex numbers.
     * 
     * @param z The complex number to divide this one by.
     * @return A new complex number which is the quotient.
     */
    public Complex div(Complex z) {
        return mult(z.inv());
    }
    
    
    //  Returning as a string for a readable format
    //   The "@Override" below just says we are overriding a function
    //    defined in a parent class. In this case, the parent is java.lang.Object.
    //    All classes in Java have the Object class as a superclass.
    
    @Override
    public String toString() {
         
        // 1) "" represents the empty string.
        // 2) If you add something to a string, it converts the thing you
        // are adding to a string, and then concatentates it with the string.

        // We do some voodoo to make sure the number is displayed reasonably.
        if (y==0) {
            return ""+x;
        }
        if (y>0) {
            return ""+x+"+"+y+"*I";
        }
        // if y<0.
        return ""+x+"-"+(-y)+"*I";
    }
    
 }
    

