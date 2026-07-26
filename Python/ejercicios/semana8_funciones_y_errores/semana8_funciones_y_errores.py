"""
Semana 8: Funciones y manejo de errores

Ejercicio 1: Funcion simple que saluda (sin parametros).
Ejercicio 2: Funcion con parametros que suma dos numeros.
Ejercicio 3: Variables locales vs. globales (mostrar la diferencia con un ejemplo).
Ejercicio 4: Dividir un problema grande en funciones mas chicas.
Ejercicio 5: Funcion con valor por defecto: saludar(nombre, idioma="es").
Ejercicio 6: Pedir un numero por teclado y capturar el error si no es valido (try/except).
Ejercicio 7: Proyecto de la semana: calculadora donde cada operacion es una funcion
            distinta, y la division maneja el error de dividir por cero.
"""


# ---------------------------------------------------------
# Ejercicio 1: funcion sin parametros
# ---------------------------------------------------------
def saludar():
    print("Hola! Bienvenido al programa")


saludar()


# ---------------------------------------------------------
# Ejercicio 2: funcion con parametros
# ---------------------------------------------------------
def sumar(a, b):
    return a + b


resultado = sumar(4, 7)
print("La suma es", resultado)


# ---------------------------------------------------------
# Ejercicio 3: variables locales vs globales
# ---------------------------------------------------------
mensaje_global = "Soy una variable global, se ve desde cualquier funcion"


def mostrar_variables():
    mensaje_local = "Soy una variable local, solo existo dentro de esta funcion"
    print(mensaje_global)
    print(mensaje_local)


mostrar_variables()
# print(mensaje_local)  # Esto daria error: mensaje_local no existe aca afuera


# ---------------------------------------------------------
# Ejercicio 4: dividir un problema en funciones
# ---------------------------------------------------------
def pedir_numero(mensaje):
    return float(input(mensaje))


def calcular_promedio(a, b, c):
    return (a + b + c) / 3


def mostrar_resultado(promedio):
    print("El promedio es", promedio)


nota1 = pedir_numero("Primera nota: ")
nota2 = pedir_numero("Segunda nota: ")
nota3 = pedir_numero("Tercera nota: ")
promedio = calcular_promedio(nota1, nota2, nota3)
mostrar_resultado(promedio)


# ---------------------------------------------------------
# Ejercicio 5: valor por defecto
# ---------------------------------------------------------
def saludar_en_idioma(nombre, idioma="es"):
    saludos = {"es": "Hola", "en": "Hello", "pt": "Ola"}
    saludo = saludos.get(idioma, "Hola")
    print(f"{saludo}, {nombre}!")


saludar_en_idioma("Fabian")           # Hola, Fabian!
saludar_en_idioma("John", "en")       # Hello, John!


# ---------------------------------------------------------
# Ejercicio 6: manejo de errores con try/except
# ---------------------------------------------------------
try:
    numero = int(input("Ingresa un numero: "))
    print(f"El doble es {numero * 2}")
except ValueError:
    print("Eso no es un numero valido")


# ---------------------------------------------------------
# Ejercicio 7: proyecto de la semana - calculadora con funciones
# ---------------------------------------------------------
def restar(a, b):
    return a - b


def multiplicar(a, b):
    return a * b


def dividir(a, b):
    try:
        return a / b
    except ZeroDivisionError:
        print("No se puede dividir por cero")
        return None


numero1 = float(input("Primer numero: "))
numero2 = float(input("Segundo numero: "))
operacion = input("Operacion (+, -, *, /): ")

if operacion == "+":
    print(sumar(numero1, numero2))
elif operacion == "-":
    print(restar(numero1, numero2))
elif operacion == "*":
    print(multiplicar(numero1, numero2))
elif operacion == "/":
    print(dividir(numero1, numero2))
else:
    print("Operacion invalida")
