/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaption;

import java.util.Date;

/**
 *
 * @author student
 */
public class InteraptionFlag implements Runnable {
    
    @Override
    public void run() {
        
        System.out.println(Thread.currentThread().isInterrupted());
        
        while (true) {
            if ( !Thread.currentThread().isInterrupted() ) {
                            
                System.out.println(Thread.currentThread().isInterrupted());
                System.out.println(new Date().toString());
                System.out.println(Thread.currentThread().isInterrupted());
                
            } else {
                return ;
            }
            
        }
        
        
        
        
    }
    
}
