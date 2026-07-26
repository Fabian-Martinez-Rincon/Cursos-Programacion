# Semana 10: Archivos y formatos de datos

Nota: estos ejemplos crean archivos dentro de la carpeta `datos/` para no
ensuciar el resto del proyecto.

```java
Files.createDirectories(Paths.get("datos"));
```

## Ejercicio 1: Escribir un archivo de texto

```java
try (PrintWriter escritor = new PrintWriter(new FileWriter("datos/nombres.txt"))) {
    escritor.println("Ana");
    escritor.println("Beto");
    escritor.println("Carla");
}
```

## Ejercicio 2: Leer el archivo de texto

```java
List<String> lineas = Files.readAllLines(Paths.get("datos/nombres.txt"));
for (String linea : lineas) {
    System.out.println(linea);
}
```

## Ejercicio 3: Guardar una lista de personas en CSV

```java
try (PrintWriter escritor = new PrintWriter(new FileWriter("datos/personas.csv"))) {
    escritor.println("nombre,edad");
    escritor.println("Ana,25");
    escritor.println("Beto,30");
}
```

## Ejercicio 4: Leer el CSV

```java
List<String> filas = Files.readAllLines(Paths.get("datos/personas.csv"));
// filas.get(0) es el encabezado "nombre,edad", se salta al recorrer

for (int i = 1; i < filas.size(); i++) {
    String[] columnas = filas.get(i).split(",");
    String nombre = columnas[0];
    String edad = columnas[1];
    System.out.println(nombre + " tiene " + edad + " anios");
}
```

## Ejercicio 5: Configuracion con Properties

Java no tiene una libreria de JSON incorporada como Python; para JSON real se
usaria una libreria externa como Gson o Jackson (ver semana 12, Maven). Para
guardar configuracion simple de clave=valor alcanza con `Properties`.

```java
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
```
