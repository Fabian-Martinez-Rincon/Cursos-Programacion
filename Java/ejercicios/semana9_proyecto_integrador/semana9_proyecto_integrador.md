# Semana 9: Proyecto integrador

La persona elige uno de estos proyectos: Sistema de notas, Agenda de
contactos, Registro de gastos, Juego de adivinanzas, Calculadora de precios,
Encuesta de estudiantes, Control de productos.

Este ejemplo es una implementacion de referencia de UNO de esos proyectos
(Sistema de notas), para que el profesor tenga un ejemplo completo de que se
espera: variables + condicionales + ciclos + metodos combinados en un
programa con menu.

```java
static List<Double> notas = new ArrayList<>();

static void mostrarMenu() {
    System.out.println("\n--- Sistema de notas ---");
    System.out.println("1. Cargar una nota");
    System.out.println("2. Ver resumen");
    System.out.println("3. Salir");
}

static double pedirNota() {
    System.out.print("Nota (0 a 10): ");
    return Double.parseDouble(sc.nextLine());
}

static double calcularPromedio() {
    double suma = 0;
    for (double nota : notas) {
        suma += nota;
    }
    return suma / notas.size();
}

static int contarAprobados() {
    int aprobados = 0;
    for (double nota : notas) {
        if (nota >= 6) {
            aprobados += 1;
        }
    }
    return aprobados;
}

static void mostrarResumen() {
    if (notas.isEmpty()) {
        System.out.println("Todavia no cargaste ninguna nota");
        return;
    }

    double maxima = notas.get(0);
    double minima = notas.get(0);
    for (double nota : notas) {
        if (nota > maxima) {
            maxima = nota;
        }
        if (nota < minima) {
            minima = nota;
        }
    }

    System.out.println("Cantidad de notas: " + notas.size());
    System.out.println("Promedio: " + calcularPromedio());
    System.out.println("Nota mas alta: " + maxima);
    System.out.println("Nota mas baja: " + minima);
    System.out.println("Aprobados: " + contarAprobados());
}

String opcion = "";
while (!opcion.equals("3")) {
    mostrarMenu();
    System.out.print("Elegi una opcion: ");
    opcion = sc.nextLine();

    switch (opcion) {
        case "1":
            notas.add(pedirNota());
            break;
        case "2":
            mostrarResumen();
            break;
        case "3":
            System.out.println("Chau!");
            break;
        default:
            System.out.println("Opcion invalida");
    }
}
```
