import java.util.Scanner;

/**
 * Semana 4: Condicionales
 *
 * Ejercicio 1: Determinar si una persona es mayor de edad.
 * Ejercicio 2: Determinar si un estudiante aprobo una materia (nota >= 6).
 * Ejercicio 3: Determinar el mayor de dos numeros.
 * Ejercicio 4: Condiciones anidadas: clasificar una nota en Excelente/Aprobado/Desaprobado.
 * Ejercicio 5: Operadores &&/||: verificar si alguien puede votar (mayor de edad y con DNI).
 */
public class Semana04Condicionales {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }

    // ---------------------------------------------------------
    // Ejercicio 1: mayor de edad
    // ---------------------------------------------------------
    static void ejercicio1() {
        System.out.print("Cuantos anios tenes? ");
        int edad = Integer.parseInt(sc.nextLine());
        if (edad >= 18) {
            System.out.println("Sos mayor de edad");
        } else {
            System.out.println("Sos menor de edad");
        }
    }

    // ---------------------------------------------------------
    // Ejercicio 2: aprobo la materia
    // ---------------------------------------------------------
    static void ejercicio2() {
        System.out.print("Ingresa tu nota: ");
        double nota = Double.parseDouble(sc.nextLine());
        if (nota >= 6) {
            System.out.println("Aprobaste la materia");
        } else {
            System.out.println("No aprobaste la materia");
        }
    }

    // ---------------------------------------------------------
    // Ejercicio 3: mayor de dos numeros
    // ---------------------------------------------------------
    static void ejercicio3() {
        System.out.print("Primer numero: ");
        double numero1 = Double.parseDouble(sc.nextLine());
        System.out.print("Segundo numero: ");
        double numero2 = Double.parseDouble(sc.nextLine());

        if (numero1 > numero2) {
            System.out.println("El mayor es " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("El mayor es " + numero2);
        } else {
            System.out.println("Son iguales");
        }
    }

    // ---------------------------------------------------------
    // Ejercicio 4: condiciones anidadas
    // ---------------------------------------------------------
    static void ejercicio4() {
        System.out.print("Ingresa tu nota: ");
        double nota = Double.parseDouble(sc.nextLine());

        if (nota >= 9) {
            System.out.println("Excelente");
        } else {
            if (nota >= 6) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Desaprobado");
            }
        }
    }

    // ---------------------------------------------------------
    // Ejercicio 5: && / ||
    // ---------------------------------------------------------
    static void ejercicio5() {
        System.out.print("Cuantos anios tenes? ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.print("Tenes DNI? (si/no) ");
        boolean tieneDni = sc.nextLine().equals("si");

        if (edad >= 16 && tieneDni) {
            System.out.println("Podes votar");
        } else {
            System.out.println("Todavia no podes votar");
        }
    }
}
