# Semana 10: Archivos y formatos de datos

**Nota:** estos ejercicios crean archivos dentro de la carpeta `datos/` para no
ensuciar el resto del proyecto. La linea `os.makedirs` del Ejercicio 1 crea esa
carpeta si no existe.

## Ejercicio 1: Escribir nombres en un archivo .txt

```python
import csv
import json
import os

os.makedirs("datos", exist_ok=True)

nombres = ["Ana", "Beto", "Carla"]
with open("datos/nombres.txt", "w", encoding="utf-8") as archivo:
    for nombre in nombres:
        archivo.write(nombre + "\n")
```

## Ejercicio 2: Leer el archivo y mostrar su contenido

```python
with open("datos/nombres.txt", "r", encoding="utf-8") as archivo:
    contenido = archivo.read()
print(contenido)
```

## Ejercicio 3: Guardar una lista de personas en un CSV

```python
personas = [
    {"nombre": "Ana", "edad": 25},
    {"nombre": "Beto", "edad": 30},
]
with open("datos/personas.csv", "w", newline="", encoding="utf-8") as archivo:
    escritor = csv.DictWriter(archivo, fieldnames=["nombre", "edad"])
    escritor.writeheader()
    escritor.writerows(personas)
```

## Ejercicio 4: Leer el CSV y mostrar cada fila

```python
with open("datos/personas.csv", "r", encoding="utf-8") as archivo:
    lector = csv.DictReader(archivo)
    for fila in lector:
        print(f"{fila['nombre']} tiene {fila['edad']} anios")
```

## Ejercicio 5: Guardar y cargar un diccionario en JSON

```python
configuracion = {"tema": "oscuro", "idioma": "es", "notificaciones": True}
with open("datos/config.json", "w", encoding="utf-8") as archivo:
    json.dump(configuracion, archivo)

with open("datos/config.json", "r", encoding="utf-8") as archivo:
    configuracion_cargada = json.load(archivo)
print(configuracion_cargada)
```
