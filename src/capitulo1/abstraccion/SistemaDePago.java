/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo1.abstraccion;


import capitulo2.encapsulamiento.Usuario;
import capitulo2.encapsulamiento.Pago;

/**
 *
 * @author campitos
 */
public class SistemaDePago {


    public static void main(String args[]){
 System.out.println(hacerPago(40,200));

    }

     public static float hacerPago(int horas, float sueldo){
        
        float pago=horas*sueldo;
    
        return pago;
        
    }
    
}
