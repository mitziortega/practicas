/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo4.herencia2;

/**
 *
 * @author T-301
 */
public class TestSuperficies {
 public static void main(String args[]) throws Exception{
     for(Superficies s:GenerarSuperficies.obtenerFiguras()){
             System.out.println( s.calcularArea());
     }
 }   
}
