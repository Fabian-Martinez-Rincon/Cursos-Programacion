import java.util.Scanner;

/**
 * Semana 2: Entorno y primer programa
 *
 * Antes de programar: instalar el JDK y un editor (IntelliJ IDEA Community o
 * VS Code con la extension de Java), y aprender a compilar y ejecutar un
 * archivo .java desde la terminal:
 *   javac Semana02Entorno.java
 *   java Semana02Entorno
 *
 * Ejercicio 1: Mostrar un mensaje fijo en pantalla (primer programa).
 * Ejercicio 2: Pedir el nombre de la persona y saludarla (entrada -> salida).
 * Ejercicio 3: Pedir nombre y edad, mostrar un mensaje personalizado.
 * Ejercicio 4: Mostrar el tipo de dos variables usando su declaracion.
 * Ejercicio 5: Un programa con instrucciones desordenadas para que las ordene.
 */
public class Semana02Entorno {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }

    // ---------------------------------------------------------
    // Ejercicio 1: primer programa
    // ---------------------------------------------------------
    static void ejercicio1() {
        System.out.println("Este es mi primer programa");
    }

    // ---------------------------------------------------------
    // Ejercicio 2: entrada y salida
    // ---------------------------------------------------------
    static void ejercicio2() {
        System.out.print("Como te llamas? ");
        String nombre = sc.nextLine();
        System.out.println("Hola, " + nombre);
    }

    // ---------------------------------------------------------
    // Ejercicio 3: mensaje personalizado
    // ---------------------------------------------------------
    static void ejercicio3() {
        System.out.print("Como te llamas? ");
        String nombre = sc.nextLine();
        System.out.print("Cuantos anios tenes? ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("Hola " + nombre + ", el proximo anio vas a tener " + (edad + 1) + " anios");
    }

    // ---------------------------------------------------------
    // Ejercicio 4: tipos de datos
    //
    // A diferencia de Python, en Java hay que declarar el tipo de cada
    // variable (Java es un lenguaje "fuertemente tipado").
    // ---------------------------------------------------------
    static void ejercicio4() {
        Integer numeroEntero = 10;
        Double numeroDecimal = 3.5;
        System.out.println(numeroEntero.getClass().getSimpleName()); // Integer
        System.out.println(numeroDecimal.getClass().getSimpleName()); // Double
    }

    // ---------------------------------------------------------
    // Ejercicio 5: ordenar un programa
    //
    // Ejercicio para el profesor: dar estas 4 lineas desordenadas
    // en un papel o archivo aparte, y que la persona las ordene
    // para que el programa tenga sentido:
    //
    //   System.out.println("El resultado es: " + resultado);
    //   int resultado = a + b;
    //   int a = Integer.parseInt(sc.nextLine());
    //   int b = Integer.parseInt(sc.nextLine());
    //
    // Orden correcto:
    // ---------------------------------------------------------
    static void ejercicio5() {
        System.out.print("Primer numero: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Segundo numero: ");
        int b = Integer.parseInt(sc.nextLine());
        int resultado = a + b;
        System.out.println("El resultado es: " + resultado);
    }
}
