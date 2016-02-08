/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo5.excepciones;

import capitulo4.herencia2.ValorNegativoException;

/**
 *
 * @author root
 */
public class ValidarEdad {
    
    public static void validadEdada(int edad)throws Exception{
        if(edad<0)throw new ValorNegativoException();
    }
    
}
