"""
Semana 5: Repeticiones

Ejercicio 1: Mostrar los numeros del 1 al 10 con while.
Ejercicio 2: Solicitar numeros hasta ingresar cero e informar cuantos se ingresaron (proyecto de la semana).
Ejercicio 3: Pedir una contrasenia hasta que sea la correcta.
Ejercicio 4: Ejemplo comentado de bucle infinito, para que vean el error y entiendan por que pasa.
Ejercicio 5: Mostrar los numeros del 1 al 20 usando for (en vez de while).
Ejercicio 6: FizzBuzz del 1 al 30 (multiplos de 3 -> "Fizz", de 5 -> "Buzz", de ambos -> "FizzBuzz").
"""

# ---------------------------------------------------------
# Ejercicio 1: contar del 1 al 10
# ---------------------------------------------------------
numero = 1
while numero <= 10:
    print(numero)
    numero += 1  # actualizar la variable es lo que evita el bucle infinito

# ---------------------------------------------------------
# Ejercicio 2: proyecto de la semana
# ---------------------------------------------------------
cantidad_ingresados = 0
numero = int(input("Ingresa un numero (0 para terminar): "))
while numero != 0:
    cantidad_ingresados += 1
    numero = int(input("Ingresa un numero (0 para terminar): "))

print("Ingresaste", cantidad_ingresados, "numeros distintos de cero")

# ---------------------------------------------------------
# Ejercicio 3: pedir contrasenia hasta acertar
# ---------------------------------------------------------
contrasenia_correcta = "python123"
intento = input("Ingresa la contrasenia: ")
while intento != contrasenia_correcta:
    print("Incorrecta, intenta de nuevo")
    intento = input("Ingresa la contrasenia: ")
print("Acceso concedido")

# ---------------------------------------------------------
# Ejercicio 4: bucle infinito (NO ejecutar tal cual)
#
# Mostrar este bloque comentado y preguntar: "por que este
# programa nunca termina?" (respuesta: la variable "contador"
# nunca cambia, entonces la condicion siempre es verdadera).
#
# contador = 0
# while contador < 5:
#     print("Este mensaje se repite para siempre")
# ---------------------------------------------------------

# ---------------------------------------------------------
# Ejercicio 5: for en vez de while
# ---------------------------------------------------------
for i in range(1, 21):
    print(i)

# ---------------------------------------------------------
# Ejercicio 6: FizzBuzz
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
