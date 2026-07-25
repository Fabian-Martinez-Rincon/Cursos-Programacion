"""
Semana 12 - Ejercicio 3: Confirmar que el entorno virtual y pip funcionan.

Requiere haber instalado requests dentro del entorno virtual:
    pip install requests
"""

import requests

respuesta = requests.get("https://jsonplaceholder.typicode.com/todos/1")

if respuesta.status_code == 200:
    print("La instalacion funciona. Datos recibidos:")
    print(respuesta.json())
else:
    print(f"Hubo un problema, codigo de estado: {respuesta.status_code}")
