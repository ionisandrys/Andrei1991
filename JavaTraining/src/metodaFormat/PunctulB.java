/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodaFormat;

/**
 *
 * @author Andrei
 */
import java.util.Calendar;
public class PunctulB {
    
    public static void main(String[] args){
        
        long x = 461012;
        System.out.format("%d%n",x);
        System.out.format("%08d%n",x);
        System.out.format("%+8d%n",x);
        System.out.format("%,8d%n",x);
        System.out.format("%+,8d%n",x);
        
        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);
        System.out.format("%tD%n", c);
        
        double pi=Math.PI;
        System.out.format("%f%n",pi);
        System.out.format("%.4f%n",pi);
        System.out.format("%10.3f%n",pi);
        System.out.format("%-10.3f%n",pi);
    }
    
}
