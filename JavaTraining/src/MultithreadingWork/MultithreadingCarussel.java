/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultithreadingWork;

/**
 *
 * @author Andrei
 */
public class MultithreadingCarussel {
    public static void main(String[] args){
        Thread t1 = new InheritedThread();
        
        t1.start();
        
        InterfaceImplemented ini = new InterfaceImplemented();
        Thread t2 = new Thread(ini);
        t2.start();
    
}
}