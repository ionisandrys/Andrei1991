/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultithreadingWork;
//  InheritedThread that extends class Thread and display all instance methods
// (run them and display the result)

import java.util.Arrays;

/* Instance methods => invoked on specific instance of a specific class. Method 
wants to know upon which class it was invoked. The way it happens there is a 
invisible parameter called ''this''. Inside of 'this' we have members of instance 
class already set with values.*/

/**
 *
 * @author Andrei
 */
public class InheritedThread extends Thread {
    
    @Override
    public void run(){
        this.checkAccess();
      //  int countStackFrames = this.countStackFrames();
        this.equals(this);
        System.out.println("getClass : "+this.getClass());
        System.out.println(" ClassLoader:"+this.getContextClassLoader());
        System.out.println("Thread ID is:"+this.getId());
        System.out.println("Name of thread "+this.getName());
        System.out.println("The thread priority is: "+this.getPriority());
  /*    Following method -->
        Returns an array of stack trace elements representing the stack dump of 
        this thread. This method will return a zero-length array if this thread 
        has not started, has started but has not yet been scheduled to run by 
        the system, or has terminated.
        */
        System.out.println(Arrays.toString(this.getStackTrace()));
        System.out.println("State: "+this.getState());
        System.out.println("Thread is for "+this.getThreadGroup());
        System.out.println("The hashcode is: " +this.hashCode());
                                                this.interrupt();
        System.out.println("Thread running "+this.isAlive());
        System.out.println("Is there a daemon "+this.isDaemon());
        System.out.println("Is thread interrupted? "+this.isInterrupted());
        

        System.out.println("Method toString returns: "+this.toString());
       // this.suspend();
      //  this.resume();
//        this.setDaemon(false);
        this.setName("Andrei");
  this.setContextClassLoader(null); //null parameter indicating the system class loader
        this.setPriority(5);
        this.start();
      //  this.stop();
      
  //    clone() throws CloneNotSupportedException as a Thread can not be 
  //   meaningfully cloned. Construct a new Thread instead.
  try {
            this.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("EX");
        }
  // Join() waits for this thread to die.
  try {
            this.join(456);
        } catch (InterruptedException ex) {
          System.out.println("No join");  
        }
    }
    
}
