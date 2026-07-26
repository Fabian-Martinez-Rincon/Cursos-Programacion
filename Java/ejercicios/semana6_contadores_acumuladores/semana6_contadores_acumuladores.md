# Semana 6: Contadores y acumuladores

## Ejercicio 1: Contar positivos y negativos

```java
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
```

## Ejercicio 2: Acumular una suma

```java
int suma = 0;
System.out.print("Ingresa un numero (-1 para terminar): ");
int numero = Integer.parseInt(sc.nextLine());
while (numero != -1) {
    suma += numero;
    System.out.print("Ingresa un numero (-1 para terminar): ");
    numero = Integer.parseInt(sc.nextLine());
}
System.out.println("La suma total es " + suma);
```

## Ejercicio 3: Maximo y minimo

```java
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
```

## Ejercicio 4: Porcentaje de pares

```java
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
```

## Ejercicio 5: Proyecto de la semana — notas de estudiantes

```java
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
```
