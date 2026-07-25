"""
Semana 6: Programacion orientada a objetos en Python

Ejercicio 1: Clase Persona con nombre y edad, y un metodo saludar().
Ejercicio 2: Clase Contacto y clase Agenda (lista de contactos) con agregar/buscar.
Ejercicio 3: Herencia: clase Animal y subclase Perro que sobreescribe un metodo.
Ejercicio 4: Metodo __str__ para mostrar un objeto de forma legible.
"""


# ---------------------------------------------------------
# Ejercicio 1
# ---------------------------------------------------------
class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def saludar(self):
        print(f"Hola, soy {self.nombre} y tengo {self.edad} anios")


p1 = Persona("Ana", 25)
p1.saludar()


# ---------------------------------------------------------
# Ejercicio 2
# ---------------------------------------------------------
class Contacto:
    def __init__(self, nombre, telefono):
        self.nombre = nombre
        self.telefono = telefono


class Agenda:
    def __init__(self):
        self.contactos = []

    def agregar(self, contacto):
        self.contactos.append(contacto)

    def buscar(self, nombre):
        for contacto in self.contactos:
            if contacto.nombre == nombre:
                return contacto
        return None


agenda = Agenda()
agenda.agregar(Contacto("Beto", "11-2222-3333"))
encontrado = agenda.buscar("Beto")
if encontrado:
    print(f"{encontrado.nombre}: {encontrado.telefono}")


# ---------------------------------------------------------
# Ejercicio 3
# ---------------------------------------------------------
class Animal:
    def __init__(self, nombre):
        self.nombre = nombre

    def hacer_sonido(self):
        print(f"{self.nombre} hace un sonido")


class Perro(Animal):
    def hacer_sonido(self):
        print(f"{self.nombre} dice guau")


animal = Animal("Animal generico")
perro = Perro("Rex")
animal.hacer_sonido()  # Animal generico hace un sonido
perro.hacer_sonido()   # Rex dice guau


# ---------------------------------------------------------
# Ejercicio 4
# ---------------------------------------------------------
class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def __str__(self):
        return f"{self.nombre} - ${self.precio}"


producto = Producto("Cuaderno", 500)
print(producto)  # Cuaderno - $500 (gracias a __str__)
