/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo9.enumerados;

/**
 *
 * @author campitos
 */
public class TestMaquina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Maquina maquina1=new Maquina();
        
        maquina1.setEstadoDeLaMaquina(EstadoDeLaMaquina.DISPONIBLE);
        System.out.println(maquina1.getEstadoDeLaMaquina());
    }
    
}
