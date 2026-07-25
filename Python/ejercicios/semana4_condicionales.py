"""
Semana 4: Condicionales

Ejercicio 1: Determinar si una persona es mayor de edad.
Ejercicio 2: Determinar si un estudiante aprobo una materia (nota >= 6).
Ejercicio 3: Determinar el mayor de dos numeros.
Ejercicio 4: Condiciones anidadas: clasificar una nota en Excelente/Aprobado/Desaprobado.
Ejercicio 5: Operadores and/or/not: verificar si alguien puede votar (mayor de edad y con DNI).
"""

# ---------------------------------------------------------
# Ejercicio 1: mayor de edad
# ---------------------------------------------------------
edad = int(input("Cuantos anios tenes? "))
if edad >= 18:
    print("Sos mayor de edad")
else:
    print("Sos menor de edad")

# ---------------------------------------------------------
# Ejercicio 2: aprobo la materia
# ---------------------------------------------------------
nota = float(input("Ingresa tu nota: "))
if nota >= 6:
    print("Aprobaste la materia")
else:
    print("No aprobaste la materia")

# ---------------------------------------------------------
# Ejercicio 3: mayor de dos numeros
# ---------------------------------------------------------
numero1 = float(input("Primer numero: "))
numero2 = float(input("Segundo numero: "))
if numero1 > numero2:
    print("El mayor es", numero1)
elif numero2 > numero1:
    print("El mayor es", numero2)
else:
    print("Son iguales")

# ---------------------------------------------------------
# Ejercicio 4: condiciones anidadas
# ---------------------------------------------------------
nota = float(input("Ingresa tu nota: "))
if nota >= 9:
    print("Excelente")
else:
    if nota >= 6:
        print("Aprobado")
    else:
        print("Desaprobado")

# ---------------------------------------------------------
# Ejercicio 5: and / or / not
# ---------------------------------------------------------
edad = int(input("Cuantos anios tenes? "))
tiene_dni = input("Tenes DNI? (si/no) ") == "si"

if edad >= 16 and tiene_dni:
    print("Podes votar")
else:
    print("Todavia no podes votar")
