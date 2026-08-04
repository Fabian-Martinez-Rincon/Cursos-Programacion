/**
 * Semana 11: Programacion orientada a objetos
 *
 * Ejercicio 1: Clase Persona (atributos + constructor + metodo).
 * Ejercicio 2: Encapsulamiento con una clase CuentaBancaria (atributos privados).
 * Ejercicio 3: Herencia (Animal y Perro).
 * Ejercicio 4: Polimorfismo (tratar distintas subclases como su clase base).
 * Ejercicio 5: Sobrescribir toString().
 */
public class Semana11Poo {

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }

    // ---------------------------------------------------------
    // Ejercicio 1: clase Persona
    // ---------------------------------------------------------
    static void ejercicio1() {
        Persona p1 = new Persona("Ana", 25);
        p1.saludar();
    }

    // ---------------------------------------------------------
    // Ejercicio 2: encapsulamiento con cuenta bancaria
    // ---------------------------------------------------------
    static void ejercicio2() {
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        cuenta.depositar(500);
        boolean pudoRetirar = cuenta.retirar(2000);
        System.out.println("Retiro de 2000 exitoso? " + pudoRetirar);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }

    // ---------------------------------------------------------
    // Ejercicio 3: herencia
    // ---------------------------------------------------------
    static void ejercicio3() {
        Animal animal = new Animal("Animal generico");
        Perro perro = new Perro("Rex");
        animal.hacerSonido();
        perro.hacerSonido();
    }

    // ---------------------------------------------------------
    // Ejercicio 4: polimorfismo
    // ---------------------------------------------------------
    static void ejercicio4() {
        Animal[] animales = { new Animal("Animal generico"), new Perro("Rex"), new Perro("Toby") };
        for (Animal a : animales) {
            a.hacerSonido();
        }
    }

    // ---------------------------------------------------------
    // Ejercicio 5: metodo toString
    // ---------------------------------------------------------
    static void ejercicio5() {
        Producto producto = new Producto("Cuaderno", 500);
        System.out.println(producto);
    }
}

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
