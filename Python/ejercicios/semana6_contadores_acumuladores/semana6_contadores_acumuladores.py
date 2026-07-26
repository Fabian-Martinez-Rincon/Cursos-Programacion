"""
Semana 6: Contadores y acumuladores

Ejercicio 1: Contar cuantos numeros positivos y negativos se ingresan.
Ejercicio 2: Sumar (acumular) una serie de numeros ingresados hasta que se ingrese -1.
Ejercicio 3: Encontrar el numero mas alto y mas bajo de una serie.
Ejercicio 4: Calcular que porcentaje de una serie de numeros son pares.
Ejercicio 5: Proyecto de la semana: registrar notas de varios estudiantes e informar
            cantidad de estudiantes, promedio general, nota mas alta y cantidad de aprobados.
"""

# ---------------------------------------------------------
# Ejercicio 1: contar positivos y negativos
# ---------------------------------------------------------
positivos = 0
negativos = 0
numero = int(input("Ingresa un numero (999 para terminar): "))
while numero != 999:
    if numero > 0:
        positivos += 1
    elif numero < 0:
        negativos += 1
    numero = int(input("Ingresa un numero (999 para terminar): "))

print("Positivos:", positivos, "- Negativos:", negativos)

# ---------------------------------------------------------
# Ejercicio 2: acumular una suma
# ---------------------------------------------------------
suma = 0
numero = int(input("Ingresa un numero (-1 para terminar): "))
while numero != -1:
    suma += numero
    numero = int(input("Ingresa un numero (-1 para terminar): "))

print("La suma total es", suma)

# ---------------------------------------------------------
# Ejercicio 3: maximo y minimo
# ---------------------------------------------------------
maximo = None
minimo = None
numero = int(input("Ingresa un numero (999 para terminar): "))
while numero != 999:
    if maximo is None or numero > maximo:
        maximo = numero
    if minimo is None or numero < minimo:
        minimo = numero
    numero = int(input("Ingresa un numero (999 para terminar): "))

print("Maximo:", maximo, "- Minimo:", minimo)

# ---------------------------------------------------------
# Ejercicio 4: porcentaje de pares
# ---------------------------------------------------------
cantidad_total = 0
cantidad_pares = 0
numero = int(input("Ingresa un numero (999 para terminar): "))
while numero != 999:
    cantidad_total += 1
    if numero % 2 == 0:
        cantidad_pares += 1
    numero = int(input("Ingresa un numero (999 para terminar): "))

if cantidad_total > 0:
    porcentaje = cantidad_pares / cantidad_total * 100
    print(f"El {porcentaje}% de los numeros ingresados son pares")

# ---------------------------------------------------------
# Ejercicio 5: proyecto de la semana - notas de estudiantes
# ---------------------------------------------------------
cantidad_estudiantes = 0
suma_notas = 0
nota_mas_alta = None
cantidad_aprobados = 0

nota = float(input("Ingresa una nota (-1 para terminar): "))
while nota != -1:
    cantidad_estudiantes += 1
    suma_notas += nota
    if nota_mas_alta is None or nota > nota_mas_alta:
        nota_mas_alta = nota
    if nota >= 6:
        cantidad_aprobados += 1
    nota = float(input("Ingresa una nota (-1 para terminar): "))

if cantidad_estudiantes > 0:
    promedio_general = suma_notas / cantidad_estudiantes
    print("Cantidad de estudiantes:", cantidad_estudiantes)
    print("Promedio general:", promedio_general)
    print("Nota mas alta:", nota_mas_alta)
    print("Cantidad de aprobados:", cantidad_aprobados)
