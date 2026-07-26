"""
Semana 3: Variables y tipos de datos

Ejercicio 1: Guardar datos de distintos tipos en variables y mostrarlos.
Ejercicio 2: Calculadora de edad (a partir del anio de nacimiento).
Ejercicio 3: Calculadora de promedio de 3 notas.
Ejercicio 4: Conversor de temperaturas (Celsius a Fahrenheit).
Ejercicio 5: Intercambiar el valor de dos variables.
"""

# ---------------------------------------------------------
# Ejercicio 1: tipos de datos
# ---------------------------------------------------------
edad = 20              # int (numero entero)
altura = 1.75           # float (numero real)
nombre = "Fabian"       # str (texto)
le_gusta_programar = True  # bool (verdadero/falso)

print(edad, altura, nombre, le_gusta_programar)

# ---------------------------------------------------------
# Ejercicio 2: calculadora de edad
# ---------------------------------------------------------
anio_actual = 2026
anio_nacimiento = int(input("En que anio naciste? "))
edad = anio_actual - anio_nacimiento
print("Tenes", edad, "anios")

# ---------------------------------------------------------
# Ejercicio 3: promedio de 3 notas
# ---------------------------------------------------------
nota1 = float(input("Primera nota: "))
nota2 = float(input("Segunda nota: "))
nota3 = float(input("Tercera nota: "))
promedio = (nota1 + nota2 + nota3) / 3
print("El promedio es", promedio)

# ---------------------------------------------------------
# Ejercicio 4: conversor de temperaturas
# ---------------------------------------------------------
celsius = float(input("Grados Celsius: "))
fahrenheit = celsius * 9 / 5 + 32
print(celsius, "C equivalen a", fahrenheit, "F")

# ---------------------------------------------------------
# Ejercicio 5: intercambiar variables
# ---------------------------------------------------------
x = 5
y = 10
print("Antes: x =", x, " y =", y)

temporal = x
x = y
y = temporal

print("Despues: x =", x, " y =", y)
