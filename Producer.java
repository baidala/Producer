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
        System.out.println("Producer");
        
        
    }
    
    private void putMessage() {
        if ( messages.size() <= MAXVECTOR  ) {
            messages.addElement(new Date().toString() + "  new message from producer.");
        }
        
    }
    
    public String getMessage() {
        String value = "";
        
        if ( messages.size() > 0 ) {
            value = (String) messages.firstElement();
            messages.removeElement(value);
        }
        
        return value;
    }
}
