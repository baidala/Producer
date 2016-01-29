/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaption;

/**
 *
 * @author student
 */
public class Consumer extends Thread {
    
    private Producer prod;
    
    Consumer (Producer p) {
        this.prod = p;
    }
    
    
    @Override
    public void run() {
        
        System.out.println(prod.getMessage());
        
        
        
    
    }
    
}
