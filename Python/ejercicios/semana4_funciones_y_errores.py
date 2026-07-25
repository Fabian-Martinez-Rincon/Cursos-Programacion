"""
Semana 4: Funciones y manejo de errores

Ejercicio 1: Funcion que reciba dos numeros y devuelva la suma.
Ejercicio 2: Funcion que reciba una lista de notas y devuelva el promedio.
Ejercicio 3: Funcion con valor por defecto: saludar(nombre, idioma="es").
Ejercicio 4: Pedir un numero por teclado y capturar el error si no es valido.
Ejercicio 5: Funcion que divida dos numeros y maneje la division por cero.
"""


# ---------------------------------------------------------
# Ejercicio 1
# ---------------------------------------------------------
def sumar(a, b):
    return a + b


print(sumar(3, 5))  # 8


# ---------------------------------------------------------
# Ejercicio 2
# ---------------------------------------------------------
def promedio(notas):
    return sum(notas) / len(notas)


print(promedio([7, 8, 9, 6]))  # 7.5


# ---------------------------------------------------------
# Ejercicio 3
# ---------------------------------------------------------
def saludar(nombre, idioma="es"):
    saludos = {"es": "Hola", "en": "Hello", "pt": "Ola"}
    saludo = saludos.get(idioma, "Hola")
    print(f"{saludo}, {nombre}!")


saludar("Fabian")           # Hola, Fabian!
saludar("John", "en")       # Hello, John!


# ---------------------------------------------------------
# Ejercicio 4
# ---------------------------------------------------------
try:
    numero = int(input("Ingresa un numero: "))
    print(f"El doble es {numero * 2}")
except ValueError:
    print("Eso no es un numero valido")


# ---------------------------------------------------------
# Ejercicio 5
# ---------------------------------------------------------
def dividir(a, b):
    try:
        return a / b
    except ZeroDivisionError:
        print("No se puede dividir por cero")
        return None


print(dividir(10, 2))  # 5.0
print(dividir(10, 0))  # None (y el mensaje de error)
