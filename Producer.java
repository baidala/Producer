/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaption;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author student
 */
public class Producer extends Thread {
    private Vector messages = new Vector();
    static final int MAXVECTOR = 5;
    
    @Override
    public void run() {
        
        for ( int i = 0 ; i < 3; i++) {
            this.putMessage();
            System.out.println("Put message "+i);
        }
        
    
    }
    
    private synchronized void putMessage() {
        if ( messages.size() <= MAXVECTOR  ) {
            messages.addElement(messages.size() +" : "+ new Date().toString() + "  new message from producer.");
        }
        
    }
    
    public synchronized String getMessage() {
        String value = "Undefined message.";
        
        if ( messages.size() > 0 ) {
            value = (String) messages.firstElement();
            messages.removeElement(value);
        }
        
        return value;
    }
}
