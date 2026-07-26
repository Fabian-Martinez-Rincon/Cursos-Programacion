import java.util.Scanner;

/**
 * Semana 3: Variables y tipos de datos
 *
 * Ejercicio 1: Guardar datos de distintos tipos en variables y mostrarlos.
 * Ejercicio 2: Calculadora de edad (a partir del anio de nacimiento).
 * Ejercicio 3: Calculadora de promedio de 3 notas.
 * Ejercicio 4: Conversor de temperaturas (Celsius a Fahrenheit).
 * Ejercicio 5: Intercambiar el valor de dos variables.
 */
public class Semana03Variables {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }

    // ---------------------------------------------------------
    // Ejercicio 1: tipos de datos
    // ---------------------------------------------------------
    static void ejercicio1() {
        int edad = 20;                  // numero entero
        double altura = 1.75;           // numero real
        String nombre = "Fabian";       // texto
        boolean leGustaProgramar = true; // verdadero/falso

        System.out.println(edad + " " + altura + " " + nombre + " " + leGustaProgramar);
    }

    // ---------------------------------------------------------
    // Ejercicio 2: calculadora de edad
    // ---------------------------------------------------------
    static void ejercicio2() {
        int anioActual = 2026;
        System.out.print("En que anio naciste? ");
        int anioNacimiento = Integer.parseInt(sc.nextLine());
        int edad = anioActual - anioNacimiento;
        System.out.println("Tenes " + edad + " anios");
    }

    // ---------------------------------------------------------
    // Ejercicio 3: promedio de 3 notas
    // ---------------------------------------------------------
    static void ejercicio3() {
        System.out.print("Primera nota: ");
        double nota1 = Double.parseDouble(sc.nextLine());
        System.out.print("Segunda nota: ");
        double nota2 = Double.parseDouble(sc.nextLine());
        System.out.print("Tercera nota: ");
        double nota3 = Double.parseDouble(sc.nextLine());
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio es " + promedio);
    }

    // ---------------------------------------------------------
    // Ejercicio 4: conversor de temperaturas
    // ---------------------------------------------------------
    static void ejercicio4() {
        System.out.print("Grados Celsius: ");
        double celsius = Double.parseDouble(sc.nextLine());
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println(celsius + " C equivalen a " + fahrenheit + " F");
    }

    // ---------------------------------------------------------
    // Ejercicio 5: intercambiar variables
    // ---------------------------------------------------------
    static void ejercicio5() {
        int x = 5;
        int y = 10;
        System.out.println("Antes: x = " + x + " y = " + y);

        int temporal = x;
        x = y;
        y = temporal;

        System.out.println("Despues: x = " + x + " y = " + y);
    }
}
