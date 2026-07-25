"""
Semana 1: Entorno y sintaxis

Ejercicio 1: Imprimir "Hola, mundo" y en otra linea tu nombre.
Ejercicio 2: Pedir nombre y edad, mostrar un mensaje personalizado.
Ejercicio 3: Pedir dos numeros y mostrar el tipo de dato de cada variable.
Ejercicio 4: Convertir grados Celsius a Fahrenheit.
Ejercicio 5: Calcular el area de un rectangulo (base x altura).
"""

# ---------------------------------------------------------
# Ejercicio 1
# ---------------------------------------------------------
print("Hola, mundo")
print("Fabian")

# ---------------------------------------------------------
# Ejercicio 2
# ---------------------------------------------------------
nombre = input("Como te llamas? ")
edad = input("Cuantos anios tenes? ")
print(f"Hola {nombre}, el proximo anio vas a tener {int(edad) + 1} anios")

# ---------------------------------------------------------
# Ejercicio 3
# ---------------------------------------------------------
numero_entero = 10
numero_decimal = 3.5
print(type(numero_entero))   # <class 'int'>
print(type(numero_decimal))  # <class 'float'>

# ---------------------------------------------------------
# Ejercicio 4
# ---------------------------------------------------------
celsius = float(input("Grados Celsius: "))
fahrenheit = celsius * 9 / 5 + 32
print(f"{celsius} C equivalen a {fahrenheit} F")

# ---------------------------------------------------------
# Ejercicio 5
# ---------------------------------------------------------
base = float(input("Base del rectangulo: "))
altura = float(input("Altura del rectangulo: "))
area = base * altura
print(f"El area es {area}")
