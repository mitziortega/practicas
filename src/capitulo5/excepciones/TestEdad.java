/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo5.excepciones;


/**
 *
 * @author root
 */
public class TestEdad {
    public static void main(String[] args) {
        try{
            
             ValidarEdad.validadEdada(-3);
        } catch (Exception ex) {
         System.out.println(ex.getMessage());
        }finally{
            System.out.println("Yo siempre me ejecuto"); 
        }
    }
    
}
