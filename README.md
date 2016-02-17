# Prácticas correspondientes a la materia de Lenguajes de programación Orientados a objetos
Este repositorio contiene las prácticas correspondientes al curso impartido en unitec Campus Ecatepec.

## Práctica 1. Introducción a la orientación a objetos, Uso de constructores para la creación de objetos.

**Objetivo:Distinguir los miembros de clase**: El objetivo de esta práctica es distinguir los miembros de una clase: Los atributoso camposy los métodos o comportamientos.

**Instrucciones**
1. Con ayuda del profesor y el  **NetBeans* codifica la clase Usuario que contiene los atributos nombre y edad de tipo String e int respectivamente, así como los métodos accesorios y mutadores como se muestra en el siguiente código. 1 punto.

```java
public class Alumno {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
```

2. Indentifica los atributos. Investiga el papel de los modificadores de acceso **private** 1 punto
3. Identifica los métodos que contiene este código. Investigar la diferencia entre los métodos de tipo get y los de tipo set. 1 punto.
4. Se desea cambiar el valor de la edad de un alumno, ¿Cual de los métodos deberás utiliza?. Escribe el código para un alumno de 19 años de  edad. 1 punto
5. Se desea obtener el  valor del alumno anterior. Escribe el método que se debe de utilizar para obtenerlo. 1 punto
6.  Se desea que todos los alumnos tenga de nombre "Juan" cuando se cree un objeto de dicho alumno. Escribe el constructor que utilizarías para lograr dicho objetivo. 1 punto
7.  Escribe el constructor que se debe utilizar para que puedas crear un alumno que siemrpe tenga una edad de 18 años. 2 puntos
8.  Implementa un nuevo constructor que haga al mismo tiempo los puntos 6 y 7. 2 puntos.


##Práctica No 2. Introducción a los contenedores de aplicación: caso clase JFrame**
**Objetivo: Generar una inerfaz visual con al clase JFrame**

1. Con ayuda del Netbeans crear una interfaz gráfica que contenga dos campos de texto, uno para introducir el peso y otro para introducir la altura. Vamosd a desarrollar una aplicación simple para calcular el indice de masa corporal con base a peso y altura mediante la formula

 ```java
 float peso;
 float altura;
  float imc= peso/(altura*altura);
 ```
 Valor 2 puntos
2. En la interfaz de usuario darle  nombres a los objetos de campos de texto para poder  reconocerlos en el campo de texto. VALOR 2 PUNTOS.
3. Agrerar un boton para realizar el calculo y una etiqueta (Label) para utilizarlo para mostrar el resulatdo del cálculo. Valor 2 puntos
4. En el manejo de evento del boton. pedirle a los campos de etxto los valores ingresados en la interfaz de usuario. Convertirlos mediante las clases wrapper a flotantes. Valor 2 puntos
5. Aplicar la formula del imc y mostrar el resultado en la etiqueta "resultado. VALOR 2 PUNTOS.


##Práctica No. 3

###Objetivo: Conocer y aplicar las excepciones de tipo **unchecked** en un caso de uso pŕactivo

###Introducción
Las excepciones de tipo unchecked son estructuras que se evalúan en el examen de certificación de JAVA. Tienen mucha controversia, ya que son estructuras que son muy verbales, el término verbal en Java hace referencia a que se necesita mucho código para expresar algo relativamente simple.




Las excepciones de tipo unchecked todas heredan de la clase Throwable como se  muestra en la página de oficial de orcale
[En esta página está la información](http://docs.oracle.com/javase/8/docs/api/index.html)

De esta clase se heredan las clases Exception  y Error. El método más importante que heredan es el método  ```java getMessage() ``` , este método tiene como objetivo obtener un mensaje acercad e la excepción que se haya lanzado, lo usaremos sobre todo para comunicar mensajesd e error al cliente

1. Crear una clase que se llame Cliente, va a tener como atributos email y edad, el primero de tipo String y el segundo de tipo int. Encapsular la clase y agregar el constructor que inicialize los atributos. 2 PUNTOS
2. Crear una clase que se llame ValorNoNegativoException que herede la clase  Exception, invocar el constructor que recibe un String. ¿Para que sirve este constructor?. VALOR 2 PUNTOS
3. Crear una clase que se llame ValidarEdad que contenga un metodo que sellame checharEdadNegativa(int edad) que lance la excepcion en caso de que se tenga una edad menor de 0. VALOR 2 PUNTOS
4. Generar otra clase que se llame ValorMenorDeEdadException, como en el punto 2 implementar el mismo constructor. VALOR 2 PUNTOS.
5. Crear una interfaz de usuario con dos campos de texto, uno para cada valor del cliente. Agregar un boton que al orpimirlo valide el valor ingresado en la caja de texto de la edad. VALOR 2 PUNTOS.

##Practica No. 4 
Esta practica consta de varias partes, pues cmprende la realziacion del prpyecto final, en esta primera parte vamos a aprender a usar el paquete java.io y java.net para conectarnos a una pagina web estatica.

1. Crear un paquete que se llame capitulo8.inputoutput, en el Crear una clase que se llame MiPrimeraConexion que contenga el método main.      2 PUNTOS.
2. Introducir el siguiente codigo en el metodo main
```java
 String informacion="nada";
        URL url=new URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
        HttpURLConnection con= (HttpURLConnection) url.openConnection();
         InputStreamReader in= new InputStreamReader(con.getInputStream());
        BufferedReader reader=new BufferedReader(in);


        StringBuilder builder=new StringBuilder();
        int ch;
        int lineas=0;
        while (reader.readLine()!=null){
            lineas++;
        }
        informacion="Lineas:"+lineas;
        System.out.println(informacion);
    }
 ```

ejecuta el código, y verifica que no lance excepciones. VALOR 2 PUNTOS.
3. Identifica la linea que contiene la temperatura actual  e imprimela. VALOR 2 PUNTO.
4. 4. Una vez identificada la linea de temperatura vasa colocar en un arreglo las temepraturas maáximas, minima y horas de máxima y minima. VALOR 2 PUNTOS.
5. Construir una ventana JFRame y en ella mostrar los valores anteriores en campos de texto. VALOR 2 PUNTOS.


##Práctica No. 5.
**Objetivo: Crear una tarea programada para que en la práctica anterior se refresque la temperatura automáticamente**

1. Crear un Thread como con la técnica de clases interas anónimas dentro de la clase JFRam de ejercicio anterior. VALOR 2 PUNTOS
2. Una vez creado el Thread vas a implementar el código del método **run()** correspondiente. VALOR 2 PUNTOS
3. Generar un ciclo while infinito y dentro del él implementar el bloque try/catch correspondiente y poner al dormir el thread pro 1000 milisegundos. VALOR 2 PUNTOS
4. Dentro del ciclo anterior crear un objeto de la clase **Calendar** y crear instancias de la hora, minuto y segundo. VALOR 2 PUNTOS.
5. Asignar a las componentes de las etiquetas de la ventana del ejercicio anterior los valores del paso numero 4. VALOR 2 PUNTOS.


##Práctica No. 6
**Objetivo: Introducción a los collections en JAVA**
En esta práctica se aplicará el uso de los ArrayList genéricos y se aplicará a un caslo pŕactico.

1. Crear la clase siguiente en un nuevo proyecto JAVA. VALOR 2 PUNTOS.

1. 
```java
public class Galeria {
    private String titulo;
    private String descripcion;
    private String url;

    public Galeria(String titulo, String descripcion, String url) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}

```

2. Crear una clase que se llame GenerarGalería que contenga un atributo de tipo ArrayList<Galeria>. VALOR 2 PUNTOS
3. En la clase anterior generar un método de tipo static cuyo tipo de retorno sea una referencia del atributo del punto anterior. VALOR 2 PUNTOS.
4. En la implementación del método anterior crear un ArrayList de tipo galeria y agregar 5 objetos de tipo Galeria, añadirlos uno a uno al ArrayList . VALOR 2 PUNTOS.
5.  Generar una clase main que se llame MostrarGalerías y en la implementación de método main agregar las galerias de ejercicio anterior. Iterarlas y mostrarlas en linea de comandos. VALOR 2 PUNTOS.

##Práctica No. 7
**Objetivo: Usar clases internas anónimas para construir un Thread de fondo y aplciarlo a una interfaz de usuario**

1. Del ejercicio anterior verificar que se tenga implementado el código de GenerarGaleriás siguiente. VALOR 2 PUNTOS
```java
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
```
2. Crear una clase de tipo JFRame que tenga 3 JLabels, al primero asignarle el nombre de url, al segundo de titulo y al tercero de descripción. VALOR 2 PUNTOS.
3. Crear una **clase interna anónima** en el constructor de la clase anterior de tipo JFrame, que implemente a la interface **Runnable**. VALOR 2 PUNTOS.
4. En el interior del metodo **run()** del ejercicio anterior vas a invocar el arreglo de método generarGaleria. VALOR 2 PUNTOS.
5. Mostrar en las etiquetas respectivas los valores del titulo, la imagen y la descripción de un objeto de tipo Galeria de forma continua. Cada objeto debe mostrarse por 10 segundos, de manera iterativa. VALOR 2 PUNTOS.

##Práctica No. 8 Clases Wrapper
**Objetivo: Introduccion al paquete input/output y lectura y escritura de archivos en JAVA**
1. Generar el código de la siguiente clase. VALOR 2 PUTNOS.
```java
public class Imc {
  
    private float peso;
    private float estatura;
    
    public void setPeso(float peso){
        this.peso=peso;
    }
    
    public void setEstatura(float estatura){
        this.estatura=estatura;
    }


    public float calcular(){
        
        return peso/(estatura*estatura);
        
        
        
    }
           
    
}
```

2. Crear una ventana de tipo JFrame. Agregar las componentes que se muestran en la clase anterior, es decir dos campos de  texto, uno para introducir el peso y otro para introducir la altura. VALOR 2 PUNTOS.
3. Implementar un boton y agregarle un método para el manejo del click dl evento de boton. Usar una clase interna anónima. VALOR 2 PUNTOS.
4. En la implementación del método anterior pedirle los valores de peso y altura a los campos de texto anteriores. Usar la clase wrapper **Float** para convertir los valores dados a valores de tipo float. VALOR 2 PUNTOS.
5. Implementar la lógica de cálculo del imc=peso/(altura*altura) sobre los valores anteriores y aplicarlo a los resultados del los valores ingresados en las etiquetas.VALOR 2 PUNTOS.


##Práctica No. 9.  Uso de JAVA **Enums** para generar datos abstractos
**Objetivo: Aplicar en un caso pŕáctico la creacion de una clase de Enumerados en Java para asignar estados de unsa máquina**
1. Generar la siguiente clase en JAVA: Maquina.java. VALOR 2 PUNTOS.
```java
public class Maquina {
    private EstadoDeLaMaquina estadoDeLaMaquina;

    public EstadoDeLaMaquina getEstadoDeLaMaquina() {
        return estadoDeLaMaquina;
    }

    public void setEstadoDeLaMaquina(EstadoDeLaMaquina estadoDeLaMaquina) {
        this.estadoDeLaMaquina = estadoDeLaMaquina;
    }
    
}

```
2. Generar una clase de tipo JFRame que se llame VentanaMaquina y en ella agregar un boton y un Jlabel, hacer las inicializaciones de objeto correspondientes. VALOR 2 PUNTOS.
3. Generar un enumerado en java, tal como se muestra en el código siguiente. VALOR 2 PUNTOS
```java
public enum EstadoDeLaMaquina {
    OCUPADA, BLOQUEDA, DISPONIBLE
}
```
4.  Implementar la clase TestMaquina como sigue. VALOR 2 PUNTOS.
public class TestMaquina {
```java
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
```

5. En la ventana de tipo JFrame del ejercicio númeor 3 asignar al manejo de evento de boton una clase interna anónima donde al hacer click se intercambien los estados de la máquina de manera cíclica. VALOR 2 PUNTOS.


##Práctica No. 10. Creación y uso de threads
**Objetivo: En esta práctica se aplicará el uso de thread heredando la clase thread e implementando la interfaz Runnable.

1. Generar el siguiente thread heredando la clase Thread. VALOR 2 PUNTOS.
```java
package capitulo6.threads;

/**
 *
 * @author campitos
 */
public class Facil extends Thread{
    
    public void run(){
        System.out.println("SOY UN THEAD FELIZ");
    }
    
}
```
2. Genera el siguiente Thread implementando la interface Runnable. VALOR 2 PUNTOS.
```java
package capitulo6.threads;

/**
 *
 * @author campitos
 */
public class Medio implements Runnable {

    @Override
    public void run() {
        System.out.println("Mas o menos puedo hacer varias cosas");
    }
    
}
```
3. Genera una clase main en el interior de método main crear un Thread de ejercicio No. 1 , asignale un nombre a dicho thread, probarlo e imprimir en pantalla su resultado. VALOR 2 PUNTOS
4. En el mismo método main generar un Thread dl ejercicio no. 2 y asignarle un nombre, imprimir su nombre en pantalla. VALOR 2 PUNTOS.
5. Generar un ciclo for en el metodo main anterior con un número de iteraciones=10, para las primeras 5 iteraciones invocar al primer thread y para las ultimas 5 invocar el segundo thread. Observar que las salidas no son ordenadas. VALOR 2 PUNTOS.

##Práctica no. 11. Uso de serializados para crear persistencia en aplicaciones JAVA(primera parte)
**Objetivo: En esta práctica se hará uso de la serialización para crear persistencia.**

1. Generar una clase que se llame Imagen, en ella agregar los siguientes atributos: datoImagen de tipo arreglo de bytes, titulo de tipo String y descripción de tipo String. Agregar el constructor que inicializa los atributos. VALOR 2 PUNTOS.
2. Por cada uno de los atributos generar un par de método de tipo get y set. VALOR 2 PUNTOS.
3. Sobre-escribir el método toString() de la clase anterior. VALOR 2 PUNTOS.
4. Agregar el código necesario para encapsular la clase anterior. VALOR 2 PUNTOS.
5. Generar en ese mismo proyecto una clase que se llame PersistenciaImagen, que contenga dos métodos de tipo static, el primero se debe llamar guardarImagen y el segundo leerImagen. VALOR 2 PUNTOS.

##Práctica No. 12. Uso de serializados para crear persistencia.(segunda parte: generación del modelo)

1. Verificar que se tenga la clase Imagen como se muestra en el código siguiente. VALOR 2 PUNTOS.
```java
package com.campitos.autenticar.maven.java.patos;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author campitos
 */
public class Imagen implements Serializable{
    
   private byte[] datosImage;
   private String  titulo;
   private String descripcion;

    public Imagen(byte[] datosImage, String titulo, String descripcion) {
        this.datosImage = datosImage;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public Imagen() {
    }

    public byte[] getDatosImage() {
        return datosImage;
    }

    public void setDatosImage(byte[] datosImage) {
        this.datosImage = datosImage;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
```
2. Implementar el método para guardar la imagen en un archivo serializado que se llame guardarImagen. VALOR 2 PUNTOS
3. Implementar el método para leer la imagen, usar el mismo archivo donde se guardo la imagen para leerla a partir  de ese archivo. VALOR 2 PUNTOS.
4. Generar una clase que se llame MisImagenes, en ella agregar un JFIleChooser y un boton, con el JFileChooser se deberá de poder buscar un archivo de imagen en el sistema de archivos de la PC. VALOR 2 PUNTOS.
5. Implementar la lógica del manejo de evento de botón para que al hacer click se guarde la imagen que se tenga seleccionada del ejercicio numero 4. VALOR 2 PUNTOS.
