"""
Semana 9: Proyecto integrador

La persona elige uno de estos proyectos:
Sistema de notas, Agenda de contactos, Registro de gastos, Juego de
adivinanzas, Calculadora de precios, Encuesta de estudiantes, Control
de productos.

Este archivo es una implementacion de referencia de UNO de esos
proyectos (Sistema de notas), para que el profesor tenga un ejemplo
completo de que se espera: variables + condicionales + ciclos + funciones
combinados en un programa con menu.
"""


def pedir_nota():
    return float(input("Nota (0 a 10): "))


def calcular_promedio(notas):
    return sum(notas) / len(notas)


def contar_aprobados(notas):
    aprobados = 0
    for nota in notas:
        if nota >= 6:
            aprobados += 1
    return aprobados


def mostrar_resumen(notas):
    if not notas:
        print("Todavia no cargaste ninguna nota")
        return
    print(f"Cantidad de notas: {len(notas)}")
    print(f"Promedio: {calcular_promedio(notas)}")
    print(f"Nota mas alta: {max(notas)}")
    print(f"Nota mas baja: {min(notas)}")
    print(f"Aprobados: {contar_aprobados(notas)}")


def mostrar_menu():
    print("\n--- Sistema de notas ---")
    print("1. Cargar una nota")
    print("2. Ver resumen")
    print("3. Salir")


notas = []
opcion = ""

while opcion != "3":
    mostrar_menu()
    opcion = input("Elegi una opcion: ")

    if opcion == "1":
        notas.append(pedir_nota())
    elif opcion == "2":
        mostrar_resumen(notas)
    elif opcion == "3":
        print("Chau!")
    else:
        print("Opcion invalida")
