# Semana 7: Arrays, ArrayList y HashMap

## Ejercicio 1: Lista de compras

```java
List<String> listaCompras = new ArrayList<>();
listaCompras.add("pan");
listaCompras.add("leche");
listaCompras.add("huevos");

System.out.println("Lista de compras:");
for (String producto : listaCompras) {
    System.out.println("- " + producto);
}
```

## Ejercicio 2: Buscar un producto en la lista

```java
String productoBuscado = "leche";
if (listaCompras.contains(productoBuscado)) {
    System.out.println(productoBuscado + " esta en la lista");
} else {
    System.out.println(productoBuscado + " no esta en la lista");
}
```

## Ejercicio 3: Mapa de contactos

```java
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
```

## Ejercicio 4: Contar apariciones

```java
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
```

## Ejercicio 5: Suma de un array

```java
int[] numeros = {2, 4, 6, 8, 10};
int suma = 0;
for (int numero : numeros) {
    suma += numero;
}
System.out.println("La suma es " + suma);
```

## Ejercicio 6: Eliminar duplicados con HashSet

```java
List<Integer> numerosConRepetidos = new ArrayList<>();
numerosConRepetidos.add(1);
numerosConRepetidos.add(2);
numerosConRepetidos.add(2);
numerosConRepetidos.add(3);
numerosConRepetidos.add(4);
numerosConRepetidos.add(4);

Set<Integer> numerosSinRepetidos = new HashSet<>(numerosConRepetidos);
System.out.println(numerosSinRepetidos);
```
