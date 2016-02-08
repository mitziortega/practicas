/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo4.herencia2;
import java.util.*;

public class GenerarSuperficies {
    public static   ArrayList<Superficies> obtenerFiguras()throws Exception{
       ArrayList<Superficies> figuritas=new ArrayList<Superficies>();
       //Primero creamos cuadrados
       Cuadrado cu1=new Cuadrado(12);
       Cuadrado cu2=new Cuadrado(14);
       Cuadrado cu3=new Cuadrado(13);
       //Crear 1 rectangulos
       Rectangulo r1=new Rectangulo(12,4);
       //CRear  2 traingulos
       Triangulo tri1=new Triangulo(14,5);
       Triangulo tri2=new Triangulo(6,3);
       //Crear  2 circulos
       Circulo c1=new Circulo(45);
       Circulo c2=new Circulo(12);
       
       //Agregarlos al ArrayList
       figuritas.add(cu1);
       figuritas.add(cu2);
       figuritas.add(cu3);
       figuritas.add(r1);
       figuritas.add(tri1);
       figuritas.add(tri2);
       figuritas.add(c1);
       figuritas.add(c2);
       return figuritas;
       
    }
    
    
}
