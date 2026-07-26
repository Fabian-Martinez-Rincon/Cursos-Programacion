# Semana 2: Entorno y primer programa

Antes de programar: instalar el JDK y un editor (IntelliJ IDEA Community o VS
Code con la extension de Java), y aprender a compilar y ejecutar un archivo
`.java` desde la terminal:

```bash
javac Semana02Entorno.java
java Semana02Entorno
```

## Ejercicio 1: Primer programa

```java
System.out.println("Este es mi primer programa");
```

## Ejercicio 2: Entrada y salida

```java
Scanner sc = new Scanner(System.in);

System.out.print("Como te llamas? ");
String nombre = sc.nextLine();
System.out.println("Hola, " + nombre);
```

## Ejercicio 3: Mensaje personalizado

```java
System.out.print("Como te llamas? ");
String nombre = sc.nextLine();
System.out.print("Cuantos anios tenes? ");
int edad = Integer.parseInt(sc.nextLine());
System.out.println("Hola " + nombre + ", el proximo anio vas a tener " + (edad + 1) + " anios");
```

## Ejercicio 4: Tipos de datos

A diferencia de Python, en Java hay que declarar el tipo de cada variable
(Java es un lenguaje "fuertemente tipado").

```java
Integer numeroEntero = 10;
Double numeroDecimal = 3.5;
System.out.println(numeroEntero.getClass().getSimpleName()); // Integer
System.out.println(numeroDecimal.getClass().getSimpleName()); // Double
```

## Ejercicio 5: Ordenar un programa

Ejercicio para el profesor: dar estas 4 lineas desordenadas en un papel o
archivo aparte, y que la persona las ordene para que el programa tenga
sentido:

```java
System.out.println("El resultado es: " + resultado);
int resultado = a + b;
int a = Integer.parseInt(sc.nextLine());
int b = Integer.parseInt(sc.nextLine());
```

Orden correcto:

```java
System.out.print("Primer numero: ");
int a = Integer.parseInt(sc.nextLine());
System.out.print("Segundo numero: ");
int b = Integer.parseInt(sc.nextLine());
int resultado = a + b;
System.out.println("El resultado es: " + resultado);
```
