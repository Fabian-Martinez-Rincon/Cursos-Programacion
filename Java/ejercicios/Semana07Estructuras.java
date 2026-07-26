import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Semana 7: Arrays, ArrayList y HashMap
 *
 * Ejercicio 1: Lista de compras: agregar elementos y mostrarlos todos (ArrayList).
 * Ejercicio 2: Buscar si un producto esta en la lista de compras.
 * Ejercicio 3: Mapa de contactos: agregar y buscar por nombre (HashMap).
 * Ejercicio 4: Contar cuantas veces aparece cada palabra en una lista de palabras.
 * Ejercicio 5: Usando un array fijo, calcular la suma de sus elementos.
 * Ejercicio 6: Usando un HashSet, eliminar los elementos duplicados de una lista.
 */
public class Semana07Estructuras {

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
    }

    // ---------------------------------------------------------
    // Ejercicio 1: lista de compras
    // ---------------------------------------------------------
    static List<String> listaCompras = new ArrayList<>();

    static void ejercicio1() {
        listaCompras.add("pan");
        listaCompras.add("leche");
        listaCompras.add("huevos");

        System.out.println("Lista de compras:");
        for (String producto : listaCompras) {
            System.out.println("- " + producto);
        }
    }

    // ---------------------------------------------------------
    // Ejercicio 2: buscar en la lista
    // ---------------------------------------------------------
    static void ejercicio2() {
        String productoBuscado = "leche";
        if (listaCompras.contains(productoBuscado)) {
            System.out.println(productoBuscado + " esta en la lista");
        } else {
            System.out.println(productoBuscado + " no esta en la lista");
        }
    }

    // ---------------------------------------------------------
    // Ejercicio 3: mapa de contactos
    // ---------------------------------------------------------
    static void ejercicio3() {
        Map<String, String> contactos = new HashMap<>();
        contactos.put("Ana", "11-2222-3333");
        contactos.put("Beto", "11-4444-5555");
        contactos.put("Carla", "11-6666-7777");

        String nombre = "Beto";
        if (contactos.containsKey(nombre)) {
            System.out.println("El telefono de " + nombre + " es " + contactos.get(nombre));
        } else {
            System.out.println(nombre + " no esta en la agenda");
        }
    }

    // ---------------------------------------------------------
    // Ejercicio 4: contar apariciones
    // ---------------------------------------------------------
    static void ejercicio4() {
        String[] palabras = {"sol", "luna", "sol", "estrella", "luna", "sol"};
        Map<String, Integer> conteo = new HashMap<>();

        for (String palabra : palabras) {
            if (conteo.containsKey(palabra)) {
                conteo.put(palabra, conteo.get(palabra) + 1);
            } else {
                conteo.put(palabra, 1);
            }
        }

        System.out.println(conteo); // {sol=3, luna=2, estrella=1} (orden puede variar)
    }

    // ---------------------------------------------------------
    // Ejercicio 5: suma de un array
    // ---------------------------------------------------------
    static void ejercicio5() {
        int[] numeros = {2, 4, 6, 8, 10};
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        System.out.println("La suma es " + suma);
    }

    // ---------------------------------------------------------
    // Ejercicio 6: eliminar duplicados con HashSet
    // ---------------------------------------------------------
    static void ejercicio6() {
        List<Integer> numerosConRepetidos = new ArrayList<>();
        numerosConRepetidos.add(1);
        numerosConRepetidos.add(2);
        numerosConRepetidos.add(2);
        numerosConRepetidos.add(3);
        numerosConRepetidos.add(4);
        numerosConRepetidos.add(4);

        Set<Integer> numerosSinRepetidos = new HashSet<>(numerosConRepetidos);
        System.out.println(numerosSinRepetidos);
    }
}
