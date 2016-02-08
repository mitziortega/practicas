package capitulo3.herencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author campitos
 */
public class Transformador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String a="Hola";
     byte[]arreglo=   a.getBytes();
     StringBuilder builder=new StringBuilder();
     for(byte b:arreglo){
        builder.append(b);
     }
     System.out.println(builder.toString());
     builder=new StringBuilder();
    String dos= builder.toString();
  for(byte b2:arreglo){
      builder.append((char)b2);
      
  }
  System.out.println(builder.toString());
     
    }
    
}
