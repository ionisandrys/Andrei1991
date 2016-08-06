/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersmagic;

/**
 *
 * @author Andrei
 */
public class NumbersMagic {
    
    public static void main(String[] args){
        double a = -191.635;
        double b = 43.74;
        System.out.println(Math.abs(a));
        System.out.println(Math.ceil(b));
        System.out.println(Math.floor(b));
        System.out.println(Math.rint(b));
        System.out.println(Math.max(16,45));
        System.out.println(Math.min(16,45));
        System.out.println(Math.exp(1));
        System.out.println(Math.exp(11.635));
        System.out.println(Math.log(11.635));
        System.out.println(Math.pow(11.635, 2.76));
        System.out.println(Math.sqrt(11.635));
        for (int i=0; i<3;i++)
            System.out.println((int)(Math.random()*10));
        
        
    }
}
