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

