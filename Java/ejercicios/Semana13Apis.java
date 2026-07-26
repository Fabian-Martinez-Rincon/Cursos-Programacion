import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Semana 13: Consumo de APIs y HTTP
 *
 * Se usa HttpURLConnection (incluida en el JDK desde siempre, sin instalar
 * nada) en vez de HttpClient para que funcione con cualquier version de
 * Java. Para parsear el JSON de verdad (en vez de solo imprimirlo) se
 * necesitaria una libreria como Gson o Jackson (ver semana 12, Maven).
 *
 * Ejercicio 1: Hacer un GET simple a una API publica y mostrar la respuesta cruda.
 * Ejercicio 2: Manejar errores de conexion (por ejemplo, sin internet o URL mal escrita).
 * Ejercicio 3: Revisar el codigo de estado de la respuesta (200, 404, etc.).
 */
public class Semana13Apis {

    static final String URL_BASE = "https://jsonplaceholder.typicode.com";

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
    }

    static String hacerGet(String urlTexto) throws IOException {
        URL url = new URL(urlTexto);
        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");
        conexion.setConnectTimeout(5000);

        StringBuilder respuesta = new StringBuilder();
        try (BufferedReader lector = new BufferedReader(
                new InputStreamReader(conexion.getInputStream()))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                respuesta.append(linea);
            }
        }
        return respuesta.toString();
    }

    // ---------------------------------------------------------
    // Ejercicio 1: GET simple
    // ---------------------------------------------------------
    static void ejercicio1() {
        try {
            String respuesta = hacerGet(URL_BASE + "/todos/1");
            System.out.println(respuesta);
        } catch (IOException error) {
            System.out.println("Error al conectar con la API: " + error.getMessage());
        }
    }

    // ---------------------------------------------------------
    // Ejercicio 2: manejo de errores de conexion
    // ---------------------------------------------------------
    static void ejercicio2() {
        try {
            String respuesta = hacerGet("https://url-que-no-existe.invalido/datos");
            System.out.println(respuesta);
        } catch (IOException error) {
            System.out.println("No se pudo conectar (esto es lo esperado en este ejemplo)");
        }
    }

    // ---------------------------------------------------------
    // Ejercicio 3: codigo de estado
    // ---------------------------------------------------------
    static void ejercicio3() {
        try {
            URL url = new URL(URL_BASE + "/todos/1");
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            int codigo = conexion.getResponseCode();
            System.out.println("Codigo de estado: " + codigo);
        } catch (IOException error) {
            System.out.println("Error al conectar: " + error.getMessage());
        }
    }
}
