# Semana 5: Repeticiones

## Ejercicio 1: Contar del 1 al 10

```java
int numero = 1;
while (numero <= 10) {
    System.out.println(numero);
    numero += 1; // actualizar la variable es lo que evita el bucle infinito
}
```

## Ejercicio 2: Contar numeros hasta el 0

```java
int cantidadIngresados = 0;
System.out.print("Ingresa un numero (0 para terminar): ");
int numero = Integer.parseInt(sc.nextLine());
while (numero != 0) {
    cantidadIngresados += 1;
    System.out.print("Ingresa un numero (0 para terminar): ");
    numero = Integer.parseInt(sc.nextLine());
}
System.out.println("Ingresaste " + cantidadIngresados + " numeros distintos de cero");
```

## Ejercicio 3: Pedir contrasenia hasta acertar

```java
String contraseniaCorrecta = "java123";
System.out.print("Ingresa la contrasenia: ");
String intento = sc.nextLine();
while (!intento.equals(contraseniaCorrecta)) {
    System.out.println("Incorrecta, intenta de nuevo");
    System.out.print("Ingresa la contrasenia: ");
    intento = sc.nextLine();
}
System.out.println("Acceso concedido");
```

## Ejercicio 4: Bucle infinito (no ejecutar tal cual)

Mostrar este bloque comentado y preguntar: "por que este programa nunca
termina?" (respuesta: la variable `contador` nunca cambia, entonces la
condicion siempre es verdadera).

```java
int contador = 0;
while (contador < 5) {
    System.out.println("Este mensaje se repite para siempre");
}
```

## Ejercicio 5: For en vez de while

```java
for (int i = 1; i <= 20; i++) {
    System.out.println(i);
}
```

## Ejercicio 6: FizzBuzz

```java
for (int i = 1; i <= 30; i++) {
    if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
    } else if (i % 3 == 0) {
        System.out.println("Fizz");
    } else if (i % 5 == 0) {
        System.out.println("Buzz");
    } else {
        System.out.println(i);
    }
}
```
