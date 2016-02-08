
package capitulo4.herencia2;

public class TestAreas {

 
    public static void main(String[] args) {
        // TODO code application logic here
         try{
             
             for(Superficies s: GenerarFiguras.generarSuperficies()){
                System.out.println( s.calcularArea());  
             }
   
        System.out.println("Si se lanza la excepcion nunca veras esta linea");
         }catch(Exception  e){
             System.out.println(e.getMessage());
         }

    }
    
}
