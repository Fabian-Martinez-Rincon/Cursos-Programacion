import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Semana 8: Metodos y manejo de excepciones
 *
 * Ejercicio 1: Metodo simple que saluda (sin parametros).
 * Ejercicio 2: Metodo con parametros que suma dos numeros.
 * Ejercicio 3: Variable de clase (equivalente a "global") vs variable local.
 * Ejercicio 4: Dividir un problema grande en metodos mas chicos.
 * Ejercicio 5: Sobrecarga de metodos (Java no tiene valores por defecto: se
 *             logra el mismo resultado con dos versiones del metodo).
 * Ejercicio 6: Pedir un numero por teclado y capturar el error si no es valido (try/catch).
 * Ejercicio 7: Proyecto de la semana: calculadora donde cada operacion es un metodo
 *             distinto, y la division maneja el error de dividir por cero.
 */
public class Semana08Funciones {

    static Scanner sc = new Scanner(System.in);
    static String mensajeDeClase = "Soy una variable de clase, se ve desde cualquier metodo";

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
    }

    // ---------------------------------------------------------
    // Ejercicio 1: metodo sin parametros
    // ---------------------------------------------------------
    static void saludar() {
        System.out.println("Hola! Bienvenido al programa");
    }

    static void ejercicio1() {
        saludar();
    }

    // ---------------------------------------------------------
    // Ejercicio 2: metodo con parametros
    // ---------------------------------------------------------
    static int sumar(int a, int b) {
        return a + b;
    }

    static void ejercicio2() {
        int resultado = sumar(4, 7);
        System.out.println("La suma es " + resultado);
    }

    // ---------------------------------------------------------
    // Ejercicio 3: variable de clase vs variable local
    // ---------------------------------------------------------
    static void mostrarVariables() {
        String mensajeLocal = "Soy una variable local, solo existo dentro de este metodo";
        System.out.println(mensajeDeClase);
        System.out.println(mensajeLocal);
    }

    static void ejercicio3() {
        mostrarVariables();
        // System.out.println(mensajeLocal); // Esto daria error: no existe aca afuera
    }

    // ---------------------------------------------------------
    // Ejercicio 4: dividir un problema en metodos
    // ---------------------------------------------------------
    static double pedirNumero(String mensaje) {
        System.out.print(mensaje);
        return Double.parseDouble(sc.nextLine());
    }

    static double calcularPromedio(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    static void mostrarResultado(double promedio) {
        System.out.println("El promedio es " + promedio);
    }

    static void ejercicio4() {
        double nota1 = pedirNumero("Primera nota: ");
        double nota2 = pedirNumero("Segunda nota: ");
        double nota3 = pedirNumero("Tercera nota: ");
        double promedio = calcularPromedio(nota1, nota2, nota3);
        mostrarResultado(promedio);
    }

    // ---------------------------------------------------------
    // Ejercicio 5: sobrecarga (equivalente a un valor por defecto)
    // ---------------------------------------------------------
    static void saludarEnIdioma(String nombre) {
        saludarEnIdioma(nombre, "es");
    }

    static void saludarEnIdioma(String nombre, String idioma) {
        Map<String, String> saludos = new HashMap<>();
        saludos.put("es", "Hola");
        saludos.put("en", "Hello");
        saludos.put("pt", "Ola");

        String saludo = saludos.getOrDefault(idioma, "Hola");
        System.out.println(saludo + ", " + nombre + "!");
    }

    static void ejercicio5() {
        saludarEnIdioma("Fabian");      // Hola, Fabian!
        saludarEnIdioma("John", "en");  // Hello, John!
    }

    // ---------------------------------------------------------
    // Ejercicio 6: manejo de errores con try/catch
    // ---------------------------------------------------------
    static void ejercicio6() {
        try {
            System.out.print("Ingresa un numero: ");
            int numero = Integer.parseInt(sc.nextLine());
            System.out.println("El doble es " + (numero * 2));
        } catch (NumberFormatException error) {
            System.out.println("Eso no es un numero valido");
        }
    }

    // ---------------------------------------------------------
    // Ejercicio 7: proyecto de la semana - calculadora con metodos
    // ---------------------------------------------------------
    static double sumar(double a, double b) {
        return a + b;
    }

    static double restar(double a, double b) {
        return a - b;
    }

    static double multiplicar(double a, double b) {
        return a * b;
    }

    static Double dividir(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("division por cero");
            }
            return a / b;
        } catch (ArithmeticException error) {
            System.out.println("No se puede dividir por cero");
            return null;
        }
    }

    static void ejercicio7() {
        double numero1 = pedirNumero("Primer numero: ");
        double numero2 = pedirNumero("Segundo numero: ");
        System.out.print("Operacion (+, -, *, /): ");
        String operacion = sc.nextLine();

        switch (operacion) {
            case "+":
                System.out.println(sumar(numero1, numero2));
                break;
            case "-":
                System.out.println(restar(numero1, numero2));
                break;
            case "*":
                System.out.println(multiplicar(numero1, numero2));
                break;
            case "/":
                Double resultadoDivision = dividir(numero1, numero2);
                if (resultadoDivision != null) {
                    System.out.println(resultadoDivision);
                }
                break;
            default:
                System.out.println("Operacion invalida");
        }
    }
}
