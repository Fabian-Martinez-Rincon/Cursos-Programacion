"""
Semana 5: Archivos y formatos de datos

Ejercicio 1: Escribir una lista de nombres en un archivo .txt, uno por linea.
Ejercicio 2: Leer ese archivo y mostrar su contenido.
Ejercicio 3: Guardar una lista de personas (dicts) en un archivo CSV.
Ejercicio 4: Leer el CSV y mostrar cada fila.
Ejercicio 5: Guardar un diccionario en un archivo JSON y volver a cargarlo.

Nota: estos scripts crean archivos dentro de la carpeta "datos/" para no
ensuciar el resto del proyecto. Crear esa carpeta antes de ejecutar,
o descomentar la linea os.makedirs de abajo.
"""

import csv
import json
import os

os.makedirs("datos", exist_ok=True)

# ---------------------------------------------------------
# Ejercicio 1
# ---------------------------------------------------------
nombres = ["Ana", "Beto", "Carla"]
with open("datos/nombres.txt", "w", encoding="utf-8") as archivo:
    for nombre in nombres:
        archivo.write(nombre + "\n")

# ---------------------------------------------------------
# Ejercicio 2
# ---------------------------------------------------------
with open("datos/nombres.txt", "r", encoding="utf-8") as archivo:
    contenido = archivo.read()
print(contenido)

# ---------------------------------------------------------
# Ejercicio 3
# ---------------------------------------------------------
personas = [
    {"nombre": "Ana", "edad": 25},
    {"nombre": "Beto", "edad": 30},
]
with open("datos/personas.csv", "w", newline="", encoding="utf-8") as archivo:
    escritor = csv.DictWriter(archivo, fieldnames=["nombre", "edad"])
    escritor.writeheader()
    escritor.writerows(personas)

# ---------------------------------------------------------
# Ejercicio 4
# ---------------------------------------------------------
with open("datos/personas.csv", "r", encoding="utf-8") as archivo:
    lector = csv.DictReader(archivo)
    for fila in lector:
        print(f"{fila['nombre']} tiene {fila['edad']} anios")

# ---------------------------------------------------------
# Ejercicio 5
# ---------------------------------------------------------
configuracion = {"tema": "oscuro", "idioma": "es", "notificaciones": True}
with open("datos/config.json", "w", encoding="utf-8") as archivo:
    json.dump(configuracion, archivo)

with open("datos/config.json", "r", encoding="utf-8") as archivo:
    configuracion_cargada = json.load(archivo)
print(configuracion_cargada)
