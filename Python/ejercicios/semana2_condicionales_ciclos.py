"""
Semana 2: Condicionales, ciclos y control de flujo

Ejercicio 1: Determinar si un numero es par o impar.
Ejercicio 2: Determinar si una persona es mayor de edad.
Ejercicio 3: Mostrar los numeros del 1 al 20 con un for.
Ejercicio 4: Sumar los numeros del 1 al 100 con un while.
Ejercicio 5: Pedir numeros hasta que se ingrese un 0 y contar cuantos se ingresaron.
Ejercicio 6: FizzBuzz del 1 al 30 (multiplos de 3 -> "Fizz", de 5 -> "Buzz", de ambos -> "FizzBuzz").
"""

# ---------------------------------------------------------
# Ejercicio 1
# ---------------------------------------------------------
numero = int(input("Ingresa un numero: "))
if numero % 2 == 0:
    print("Es par")
else:
    print("Es impar")

# ---------------------------------------------------------
# Ejercicio 2
# ---------------------------------------------------------
edad = int(input("Ingresa tu edad: "))
if edad >= 18:
    print("Sos mayor de edad")
else:
    print("Sos menor de edad")

# ---------------------------------------------------------
# Ejercicio 3
# ---------------------------------------------------------
for i in range(1, 21):
    print(i)

# ---------------------------------------------------------
# Ejercicio 4
# ---------------------------------------------------------
suma = 0
n = 1
while n <= 100:
    suma += n
    n += 1
print(f"La suma del 1 al 100 es {suma}")

# ---------------------------------------------------------
# Ejercicio 5
# ---------------------------------------------------------
cantidad = 0
while True:
    numero = int(input("Ingresa un numero (0 para terminar): "))
    if numero == 0:
        break
    cantidad += 1
print(f"Ingresaste {cantidad} numeros distintos de 0")

# ---------------------------------------------------------
# Ejercicio 6
# ---------------------------------------------------------
for i in range(1, 31):
    if i % 3 == 0 and i % 5 == 0:
        print("FizzBuzz")
    elif i % 3 == 0:
        print("Fizz")
    elif i % 5 == 0:
        print("Buzz")
    else:
        print(i)
