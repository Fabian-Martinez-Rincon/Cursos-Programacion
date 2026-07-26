# Semana 8: Metodos y manejo de excepciones

## Ejercicio 1: Metodo sin parametros

```java
static void saludar() {
    System.out.println("Hola! Bienvenido al programa");
}

saludar();
```

## Ejercicio 2: Metodo con parametros

```java
static int sumar(int a, int b) {
    return a + b;
}

int resultado = sumar(4, 7);
System.out.println("La suma es " + resultado);
```

## Ejercicio 3: Variable de clase vs. variable local

```java
static String mensajeDeClase = "Soy una variable de clase, se ve desde cualquier metodo";

static void mostrarVariables() {
    String mensajeLocal = "Soy una variable local, solo existo dentro de este metodo";
    System.out.println(mensajeDeClase);
    System.out.println(mensajeLocal);
}

mostrarVariables();
// System.out.println(mensajeLocal); // Esto daria error: no existe aca afuera
```

## Ejercicio 4: Dividir un problema en metodos

```java
static double pedirNumero(String mensaje) {
    System.out.print(mensaje);
    return Double.parseDouble(sc.nextLine());
}

static double calcularPromedio(double a, double b, double c) {
    return (a + b + c) / 3;
}

static void mostrarResultado(double promedio) {
    System.out.println("El promedio es " + promedio);
}

double nota1 = pedirNumero("Primera nota: ");
double nota2 = pedirNumero("Segunda nota: ");
double nota3 = pedirNumero("Tercera nota: ");
double promedio = calcularPromedio(nota1, nota2, nota3);
mostrarResultado(promedio);
```

## Ejercicio 5: Sobrecarga de metodos

Java no tiene valores por defecto para parametros: se logra el mismo
resultado con dos versiones del metodo (sobrecarga).

```java
static void saludarEnIdioma(String nombre) {
    saludarEnIdioma(nombre, "es");
}

static void saludarEnIdioma(String nombre, String idioma) {
    Map<String, String> saludos = new HashMap<>();
    saludos.put("es", "Hola");
    saludos.put("en", "Hello");
    saludos.put("pt", "Ola");

    String saludo = saludos.getOrDefault(idioma, "Hola");
    System.out.println(saludo + ", " + nombre + "!");
}

saludarEnIdioma("Fabian");      // Hola, Fabian!
saludarEnIdioma("John", "en");  // Hello, John!
```

## Ejercicio 6: Manejo de errores con try/catch

```java
try {
    System.out.print("Ingresa un numero: ");
    int numero = Integer.parseInt(sc.nextLine());
    System.out.println("El doble es " + (numero * 2));
} catch (NumberFormatException error) {
    System.out.println("Eso no es un numero valido");
}
```

## Ejercicio 7: Proyecto de la semana — calculadora con metodos

```java
static double restar(double a, double b) {
    return a - b;
}

static double multiplicar(double a, double b) {
    return a * b;
}

static Double dividir(double a, double b) {
    try {
        if (b == 0) {
            throw new ArithmeticException("division por cero");
        }
        return a / b;
    } catch (ArithmeticException error) {
        System.out.println("No se puede dividir por cero");
        return null;
    }
}

double numero1 = pedirNumero("Primer numero: ");
double numero2 = pedirNumero("Segundo numero: ");
System.out.print("Operacion (+, -, *, /): ");
String operacion = sc.nextLine();

switch (operacion) {
    case "+":
        System.out.println(sumar(numero1, numero2));
        break;
    case "-":
        System.out.println(restar(numero1, numero2));
        break;
    case "*":
        System.out.println(multiplicar(numero1, numero2));
        break;
    case "/":
        System.out.println(dividir(numero1, numero2));
        break;
    default:
        System.out.println("Operacion invalida");
}
```
