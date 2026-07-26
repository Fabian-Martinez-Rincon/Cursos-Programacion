import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

/**
 * Semana 10: Archivos y formatos de datos
 *
 * Ejercicio 1: Escribir una lista de nombres en un archivo .txt, uno por linea.
 * Ejercicio 2: Leer ese archivo y mostrar su contenido.
 * Ejercicio 3: Guardar una lista de personas en un archivo CSV (a mano, separado por comas).
 * Ejercicio 4: Leer el CSV y mostrar cada fila.
 * Ejercicio 5: Guardar configuracion clave=valor con Properties y volver a cargarla
 *             (Java no tiene una libreria de JSON incorporada como Python; para
 *             JSON real se usaria una libreria externa como Gson o Jackson).
 *
 * Nota: estos ejemplos crean archivos dentro de la carpeta "datos/" para no
 * ensuciar el resto del proyecto.
 */
public class Semana10Archivos {

    public static void main(String[] args) throws IOException {
        Files.createDirectories(Paths.get("datos"));
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }

    // ---------------------------------------------------------
    // Ejercicio 1
    // ---------------------------------------------------------
    static void ejercicio1() throws IOException {
        try (PrintWriter escritor = new PrintWriter(new FileWriter("datos/nombres.txt"))) {
            escritor.println("Ana");
            escritor.println("Beto");
            escritor.println("Carla");
        }
    }

    // ---------------------------------------------------------
    // Ejercicio 2
    // ---------------------------------------------------------
    static void ejercicio2() throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get("datos/nombres.txt"));
        for (String linea : lineas) {
            System.out.println(linea);
        }
    }

    // ---------------------------------------------------------
    // Ejercicio 3
    // ---------------------------------------------------------
    static void ejercicio3() throws IOException {
        try (PrintWriter escritor = new PrintWriter(new FileWriter("datos/personas.csv"))) {
            escritor.println("nombre,edad");
            escritor.println("Ana,25");
            escritor.println("Beto,30");
        }
    }

    // ---------------------------------------------------------
    // Ejercicio 4
    // ---------------------------------------------------------
    static void ejercicio4() throws IOException {
        List<String> filas = Files.readAllLines(Paths.get("datos/personas.csv"));
        // filas.get(0) es el encabezado "nombre,edad", se salta al recorrer

        for (int i = 1; i < filas.size(); i++) {
            String[] columnas = filas.get(i).split(",");
            String nombre = columnas[0];
            String edad = columnas[1];
            System.out.println(nombre + " tiene " + edad + " anios");
        }
    }

    // ---------------------------------------------------------
    // Ejercicio 5
    // ---------------------------------------------------------
    static void ejercicio5() throws IOException {
        Properties configuracion = new Properties();
        configuracion.setProperty("tema", "oscuro");
        configuracion.setProperty("idioma", "es");
        configuracion.setProperty("notificaciones", "true");

        try (FileWriter escritor = new FileWriter("datos/config.properties")) {
            configuracion.store(escritor, "Configuracion de la aplicacion");
        }

        Properties configuracionCargada = new Properties();
        Path archivo = Paths.get("datos/config.properties");
        try (BufferedReader lector = Files.newBufferedReader(archivo)) {
            configuracionCargada.load(lector);
        }
        System.out.println(configuracionCargada);
    }
}
