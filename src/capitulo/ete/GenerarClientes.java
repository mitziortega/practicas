/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.ete;

/**
 *
 * @author campitos
 */
public class GenerarClientes {
    
  public static Cliente[] obtenerClientes(){
         Cliente clientes[] =new Cliente[3];
clientes[0]=new Cliente("Ana","Lopez", 20, 20000, 
        new Direccion("sur 11", 20, "Ecatepunk"));

clientes[1]=new Cliente("Pedo","Matinez", 45, 14000, 
        new Direccion("Mexico", 122, "Nezayork"));

clientes[2]=new Cliente("Laura","Gomez", 30, 70000, 
        new Direccion("R-1", 43, "Cloacalco"));
                
         return clientes;
     }
    
}
