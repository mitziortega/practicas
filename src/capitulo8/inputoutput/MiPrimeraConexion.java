/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo8.inputoutput;

import java.net.*;
import java.io.*;

public class MiPrimeraConexion {
    public static void main(String[] args)throws Exception{
        //Primero vamos a usar una clase que se llama URL
        URL url=new 
        URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
        HttpURLConnection con=(HttpURLConnection) url.openConnection();
        InputStream input=con.getInputStream();
        InputStreamReader isr=new InputStreamReader(input);
        BufferedReader reader=new BufferedReader(isr);
        int renglones=0;
        boolean encontrado=false;
        String temperaturas[]=new String[5];
         while(reader.readLine()!=null){
             String renglonActual=reader.readLine();
   if(renglonActual.contains("Outside Te")){
                encontrado=true;
                System.out.println("Si existe este renglon");
           }
           
         
            }
         
      
          }
         
              
          
          
    
        // System.out.println("Numero de renglones:"+renglones);
    
    }
   












