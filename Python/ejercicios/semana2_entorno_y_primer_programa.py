"""
Semana 2: Entorno y primer programa

Antes de programar: instalar Python y un editor (VS Code), y aprender a
ejecutar un archivo .py desde la terminal (`python nombre_archivo.py`).

Ejercicio 1: Mostrar un mensaje fijo en pantalla (primer programa).
Ejercicio 2: Pedir el nombre de la persona y saludarla (entrada -> salida).
Ejercicio 3: Pedir nombre y edad, mostrar un mensaje personalizado.
Ejercicio 4: Mostrar el tipo de dato de distintas variables con type().
Ejercicio 5: Un programa con instrucciones desordenadas para que las ordene.
"""

# ---------------------------------------------------------
# Ejercicio 1: primer programa
# ---------------------------------------------------------
print("Este es mi primer programa")

# ---------------------------------------------------------
# Ejercicio 2: entrada y salida
# ---------------------------------------------------------
nombre = input("Como te llamas? ")
print("Hola,", nombre)

# ---------------------------------------------------------
# Ejercicio 3: mensaje personalizado
# ---------------------------------------------------------
nombre = input("Como te llamas? ")
edad = input("Cuantos anios tenes? ")
print(f"Hola {nombre}, el proximo anio vas a tener {int(edad) + 1} anios")

# ---------------------------------------------------------
# Ejercicio 4: tipos de datos
# ---------------------------------------------------------
numero_entero = 10
numero_decimal = 3.5
print(type(numero_entero))   # <class 'int'>
print(type(numero_decimal))  # <class 'float'>

# ---------------------------------------------------------
# Ejercicio 5: ordenar un programa
#
# Ejercicio para el profesor: dar estas 4 lineas desordenadas
# en un papel o archivo aparte, y que la persona las ordene
# para que el programa tenga sentido:
#
#   print("El resultado es:", resultado)
#   resultado = a + b
#   a = int(input("Primer numero: "))
#   b = int(input("Segundo numero: "))
#
# Orden correcto:
# ---------------------------------------------------------
a = int(input("Primer numero: "))
b = int(input("Segundo numero: "))
resultado = a + b
print("El resultado es:", resultado)
