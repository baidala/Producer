/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaption;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Interaption intr = new Interaption();
        //InteraptionFlag intrFlg = new InteraptionFlag();
        Producer prod = new Producer();
        
        
        //Thread thread1 = new Thread(intr);
        //Thread thread2 = new Thread(intrFlg);
        
        //thread1.start();
        //thread2.start();
        prod.start();
        try {
            Thread.sleep(6000);
            //thread1.interrupt();
            //System.out.println(thread1.isInterrupted());
            
            //thread2.interrupt();
            //System.out.println(thread2.isInterrupted());
           prod.interrupt();
           System.out.println( prod.isInterrupted() );
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
}
