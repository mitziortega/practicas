/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo4.herencia2;

import java.util.ArrayList;

/**
 *
 * @author campitos
 */
public class GenerarFiguras {
    
    public static ArrayList<Superficies> generarSuperficies()throws Exception{
       ArrayList<Superficies> superficies=new ArrayList<Superficies>();
       //TRes cuadrados
       
       Cuadrado c1=new Cuadrado(12);
       Cuadrado c2=new Cuadrado(14);
       Cuadrado c3=new Cuadrado(15);
       
       //Dos circulos
       
       Circulo cir1=new Circulo(6);
       Circulo cir2=new Circulo(7);
       
       //Un rectangulo
       Rectangulo r1=new Rectangulo(12,6);
       Rectangulo r2=new Rectangulo(15,4);
       
       //Los agregamos todos
       superficies.add(c1);
       superficies.add(c2);
       superficies.add(c3);
       superficies.add(cir1);
       superficies.add(cir2);
       superficies.add(r1);
       superficies.add(r2);
       
       
       return superficies;
    }
    
}
