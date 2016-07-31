/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculareSinCos;

/**
 *
 * @author Andrei
 */
public class SinCosinus {
    
    public static void main(String[] args){
        
       int a = Integer.parseInt(args[0]);
       int b = Integer.parseInt(args[1]);
       int sum = a+b;
       int prod = a*b;
       
       System.out.println( a + "+" + b + "=" + sum);
       System.out.println( a + "*" + b + "=" + prod);
       
       String d,e,f,g;
       d="My name is ";
       e= "Andrei !";
       f=d+e;
       System.out.println(f);
       
       g = String.valueOf(a+b);
       System.out.println("The number converted to string is"  +  g);
       
       double h = Double.parseDouble("14.4");
       h = Math.toRadians(h);
       System.out.println(Math.sin(h)*Math.sin(h)+ Math.cos(h)*Math.cos(h));
       
       // a 2-a metoda pentru afisarea sin^2(h) + cos^2(h)
       System.out.println(Math.pow(Math.sin(h),2)+ Math.pow(Math.cos(h),2 ));
    }
    
}
