import java.util.Scanner;

/**
 * Semana 5: Repeticiones
 *
 * Ejercicio 1: Mostrar los numeros del 1 al 10 con while.
 * Ejercicio 2: Solicitar numeros hasta ingresar cero e informar cuantos se ingresaron.
 * Ejercicio 3: Pedir una contrasenia hasta que sea la correcta.
 * Ejercicio 4: Ejemplo comentado de bucle infinito, para que vean el error y entiendan por que pasa.
 * Ejercicio 5: Mostrar los numeros del 1 al 20 usando for (en vez de while).
 * Ejercicio 6: FizzBuzz del 1 al 30 (multiplos de 3 -> "Fizz", de 5 -> "Buzz", de ambos -> "FizzBuzz").
 */
public class Semana05Repeticiones {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        // Ejercicio 4: ver el comentario en el metodo, no se ejecuta.
        ejercicio5();
        ejercicio6();
    }

    // ---------------------------------------------------------
    // Ejercicio 1: contar del 1 al 10
    // ---------------------------------------------------------
    static void ejercicio1() {
        int numero = 1;
        while (numero <= 10) {
            System.out.println(numero);
            numero += 1; // actualizar la variable es lo que evita el bucle infinito
        }
    }

    // ---------------------------------------------------------
    // Ejercicio 2: contar numeros hasta el 0
    // ---------------------------------------------------------
    static void ejercicio2() {
        int cantidadIngresados = 0;
        System.out.print("Ingresa un numero (0 para terminar): ");
        int numero = Integer.parseInt(sc.nextLine());
        while (numero != 0) {
            cantidadIngresados += 1;
            System.out.print("Ingresa un numero (0 para terminar): ");
            numero = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Ingresaste " + cantidadIngresados + " numeros distintos de cero");
    }

    // ---------------------------------------------------------
    // Ejercicio 3: pedir contrasenia hasta acertar
    // ---------------------------------------------------------
    static void ejercicio3() {
        String contraseniaCorrecta = "java123";
        System.out.print("Ingresa la contrasenia: ");
        String intento = sc.nextLine();
        while (!intento.equals(contraseniaCorrecta)) {
            System.out.println("Incorrecta, intenta de nuevo");
            System.out.print("Ingresa la contrasenia: ");
            intento = sc.nextLine();
        }
        System.out.println("Acceso concedido");
    }

    // ---------------------------------------------------------
    // Ejercicio 4: bucle infinito (NO ejecutar tal cual)
    //
    // Mostrar este bloque comentado y preguntar: "por que este
    // programa nunca termina?" (respuesta: la variable "contador"
    // nunca cambia, entonces la condicion siempre es verdadera).
    //
    // int contador = 0;
    // while (contador < 5) {
    //     System.out.println("Este mensaje se repite para siempre");
    // }
    // ---------------------------------------------------------

    // ---------------------------------------------------------
    // Ejercicio 5: for en vez de while
    // ---------------------------------------------------------
    static void ejercicio5() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }

    // ---------------------------------------------------------
    // Ejercicio 6: FizzBuzz
    // ---------------------------------------------------------
    static void ejercicio6() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
