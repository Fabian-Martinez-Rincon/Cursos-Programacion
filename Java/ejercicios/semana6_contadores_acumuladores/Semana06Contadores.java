import java.util.Scanner;

/**
 * Semana 6: Contadores y acumuladores
 *
 * Ejercicio 1: Contar cuantos numeros positivos y negativos se ingresan.
 * Ejercicio 2: Sumar (acumular) una serie de numeros ingresados hasta que se ingrese -1.
 * Ejercicio 3: Encontrar el numero mas alto y mas bajo de una serie.
 * Ejercicio 4: Calcular que porcentaje de una serie de numeros son pares.
 * Ejercicio 5: Proyecto de la semana: registrar notas de varios estudiantes e informar
 *             cantidad de estudiantes, promedio general, nota mas alta y cantidad de aprobados.
 */
public class Semana06Contadores {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }

    // ---------------------------------------------------------
    // Ejercicio 1: contar positivos y negativos
    // ---------------------------------------------------------
    static void ejercicio1() {
        int positivos = 0;
        int negativos = 0;
        System.out.print("Ingresa un numero (999 para terminar): ");
        int numero = Integer.parseInt(sc.nextLine());
        while (numero != 999) {
            if (numero > 0) {
                positivos += 1;
            } else if (numero < 0) {
                negativos += 1;
            }
            System.out.print("Ingresa un numero (999 para terminar): ");
            numero = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Positivos: " + positivos + " - Negativos: " + negativos);
    }

    // ---------------------------------------------------------
    // Ejercicio 2: acumular una suma
    // ---------------------------------------------------------
    static void ejercicio2() {
        int suma = 0;
        System.out.print("Ingresa un numero (-1 para terminar): ");
        int numero = Integer.parseInt(sc.nextLine());
        while (numero != -1) {
            suma += numero;
            System.out.print("Ingresa un numero (-1 para terminar): ");
            numero = Integer.parseInt(sc.nextLine());
        }
        System.out.println("La suma total es " + suma);
    }

    // ---------------------------------------------------------
    // Ejercicio 3: maximo y minimo
    // ---------------------------------------------------------
    static void ejercicio3() {
        Integer maximo = null;
        Integer minimo = null;
        System.out.print("Ingresa un numero (999 para terminar): ");
        int numero = Integer.parseInt(sc.nextLine());
        while (numero != 999) {
            if (maximo == null || numero > maximo) {
                maximo = numero;
            }
            if (minimo == null || numero < minimo) {
                minimo = numero;
            }
            System.out.print("Ingresa un numero (999 para terminar): ");
            numero = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Maximo: " + maximo + " - Minimo: " + minimo);
    }

    // ---------------------------------------------------------
    // Ejercicio 4: porcentaje de pares
    // ---------------------------------------------------------
    static void ejercicio4() {
        int cantidadTotal = 0;
        int cantidadPares = 0;
        System.out.print("Ingresa un numero (999 para terminar): ");
        int numero = Integer.parseInt(sc.nextLine());
        while (numero != 999) {
            cantidadTotal += 1;
            if (numero % 2 == 0) {
                cantidadPares += 1;
            }
            System.out.print("Ingresa un numero (999 para terminar): ");
            numero = Integer.parseInt(sc.nextLine());
        }
        if (cantidadTotal > 0) {
            double porcentaje = (double) cantidadPares / cantidadTotal * 100;
            System.out.println("El " + porcentaje + "% de los numeros ingresados son pares");
        }
    }

    // ---------------------------------------------------------
    // Ejercicio 5: proyecto de la semana - notas de estudiantes
    // ---------------------------------------------------------
    static void ejercicio5() {
        int cantidadEstudiantes = 0;
        double sumaNotas = 0;
        Double notaMasAlta = null;
        int cantidadAprobados = 0;

        System.out.print("Ingresa una nota (-1 para terminar): ");
        double nota = Double.parseDouble(sc.nextLine());
        while (nota != -1) {
            cantidadEstudiantes += 1;
            sumaNotas += nota;
            if (notaMasAlta == null || nota > notaMasAlta) {
                notaMasAlta = nota;
            }
            if (nota >= 6) {
                cantidadAprobados += 1;
            }
            System.out.print("Ingresa una nota (-1 para terminar): ");
            nota = Double.parseDouble(sc.nextLine());
        }

        if (cantidadEstudiantes > 0) {
            double promedioGeneral = sumaNotas / cantidadEstudiantes;
            System.out.println("Cantidad de estudiantes: " + cantidadEstudiantes);
            System.out.println("Promedio general: " + promedioGeneral);
            System.out.println("Nota mas alta: " + notaMasAlta);
            System.out.println("Cantidad de aprobados: " + cantidadAprobados);
        }
    }
}
