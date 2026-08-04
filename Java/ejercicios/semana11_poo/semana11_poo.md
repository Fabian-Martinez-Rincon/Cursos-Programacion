# Semana 11: Programación orientada a objetos

## Ejercicio 1: Clase Persona

```java
class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " anios");
    }
}
```

```java
Persona p1 = new Persona("Ana", 25);
p1.saludar();
```

## Ejercicio 2: Encapsulamiento con Cuenta bancaria

```java
class CuentaBancaria {
    private double saldo;

    CuentaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }

    void depositar(double monto) {
        saldo += monto;
    }

    boolean retirar(double monto) {
        if (monto > saldo) {
            return false;
        }
        saldo -= monto;
        return true;
    }

    double getSaldo() {
        return saldo;
    }
}
```

```java
CuentaBancaria cuenta = new CuentaBancaria(1000);
cuenta.depositar(500);
boolean pudoRetirar = cuenta.retirar(2000);
System.out.println("Retiro de 2000 exitoso? " + pudoRetirar);
System.out.println("Saldo actual: " + cuenta.getSaldo());
```

## Ejercicio 3: Herencia

```java
class Animal {
    String nombre;

    Animal(String nombre) {
        this.nombre = nombre;
    }

    void hacerSonido() {
        System.out.println(nombre + " hace un sonido");
    }
}

class Perro extends Animal {
    Perro(String nombre) {
        super(nombre);
    }

    @Override
    void hacerSonido() {
        System.out.println(nombre + " dice guau");
    }
}
```

```java
Animal animal = new Animal("Animal generico");
Perro perro = new Perro("Rex");
animal.hacerSonido(); // Animal generico hace un sonido
perro.hacerSonido();  // Rex dice guau
```

## Ejercicio 4: Polimorfismo

```java
Animal[] animales = { new Animal("Animal generico"), new Perro("Rex"), new Perro("Toby") };
for (Animal a : animales) {
    a.hacerSonido();
}
```

## Ejercicio 5: Método `toString`

```java
class Producto {
    String nombre;
    double precio;

    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}
```

```java
Producto producto = new Producto("Cuaderno", 500);
System.out.println(producto); // Cuaderno - $500.0 (gracias a toString)
```
