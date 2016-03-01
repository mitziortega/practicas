/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author campitos
 */
public class ProbarThreadsLaMejor {
    //Esta es la forma No. 3, LA MEJOR!!!!!
    public static void main(String[] args) {
        Thread t2=new Thread(new Runnable(){
            @Override
            public void run() {
              int x=1;
            for(int i=0;i<=30;i++){
                System.out.println(x++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            }
            
        });
        
        Thread t3=new Thread(new Runnable(){
            @Override
            public void run() {
             while(true){
                System.out.println("Todos vamos a morrriiiiiirrrrr!!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            }
            
        });
        
        t2.start();
        t3.start();
    }
    
}
