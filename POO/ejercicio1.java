// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class Persona {
   private Scanner teclado;
   private String nombre;
   private int edad;

   public Persona() {
   }

   public void inicializar() {
      this.teclado = new Scanner(System.in);
      System.out.println("Ingrese nombre:");
      this.nombre = this.teclado.next();
      System.out.println("Ingrese edad:");
      this.edad = this.teclado.nextInt();
   }

   public void imprimir() {
      System.out.println("Nombre:" + this.nombre);
      System.out.println("Edad:" + this.edad);
   }

   public void esMayorEdad() {
      if (this.edad >= 18) {
         System.out.println(this.nombre + "es mayor de edad.");
      } else {
         System.out.println(this.nombre + "no es mayor de edad.");
      }

   }

   public static void main(String[] var0) throws Exception {
      Persona var1 = new Persona();
      var1.inicializar();
      var1.imprimir();
      var1.esMayorEdad();
   }
}