/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo10.clasesinternas;

import java.util.ArrayList;

/**
 *
 * @author campitos
 */
public class GenerarGaleria {
    public static ArrayList<Galeria> generarGaleria(){
        ArrayList galeria=new ArrayList<Galeria>();
        Galeria g1=new Galeria("Subiendo la sierra", "Camino al ascenso por la ladera norte","/proyecto/carrusel/uno.jpg");
        Galeria g2=new Galeria("Amanecer en la cumbre", "Observanbdo el amanecer en los bosques de cedro","/proyecto/carrusel/dos.jpg");
            Galeria g6=new Galeria("Vegetacion", "Zona de vegetación densa","/proyecto/carrusel/tres.jpg");
        Galeria g3=new Galeria("Zona de transición", "Zona de transicion entre vegetacion xerofita y templada a los 2500 msm","/proyecto/carrusel/cuatro.jpg");
        Galeria g4=new Galeria("Rocas", "Zona rocosa en la parte mas alta de la sierra a mas de 3000 metros","/proyecto/carrusel/cinco.jpg");
        Galeria g5=new Galeria("Palmeras", "Palmeras en las partes bajas, típicas de clima semi seco","/proyecto/carrusel/seis.jpg");
       galeria.add(g1);
       galeria.add(g2);
       galeria.add(g3);
       galeria.add(g4);
       galeria.add(g5);
       galeria.add(g6);
        
        return galeria;
    }
}
