# Semana 13: Consumo de APIs y HTTP

Se usa `HttpURLConnection` (incluida en el JDK desde siempre, sin instalar
nada) en vez de `HttpClient` para que funcione con cualquier version de
Java. Para parsear el JSON de verdad (en vez de solo imprimirlo) se
necesitaria una libreria como Gson o Jackson (ver semana 12, Maven).

```java
static final String URL_BASE = "https://jsonplaceholder.typicode.com";

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
```

## Ejercicio 1: GET simple

```java
try {
    String respuesta = hacerGet(URL_BASE + "/todos/1");
    System.out.println(respuesta);
} catch (IOException error) {
    System.out.println("Error al conectar con la API: " + error.getMessage());
}
```

## Ejercicio 2: Manejar errores de conexion

```java
try {
    String respuesta = hacerGet("https://url-que-no-existe.invalido/datos");
    System.out.println(respuesta);
} catch (IOException error) {
    System.out.println("No se pudo conectar (esto es lo esperado en este ejemplo)");
}
```

## Ejercicio 3: Codigo de estado

```java
try {
    URL url = new URL(URL_BASE + "/todos/1");
    HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
    conexion.setRequestMethod("GET");
    int codigo = conexion.getResponseCode();
    System.out.println("Codigo de estado: " + codigo);
} catch (IOException error) {
    System.out.println("Error al conectar: " + error.getMessage());
}
```
