# Semana 13: Consumo de APIs y HTTP

Requiere: `pip install requests`

## Ejercicio 1: GET simple

```python
import requests

BASE_URL = "https://jsonplaceholder.typicode.com"

respuesta = requests.get(f"{BASE_URL}/todos/1")
datos = respuesta.json()
print(f"Tarea: {datos['title']} - Completada: {datos['completed']}")
```

## Ejercicio 2: Manejar errores de conexion

```python
try:
    respuesta = requests.get(f"{BASE_URL}/todos/1", timeout=5)
    respuesta.raise_for_status()
except requests.exceptions.RequestException as error:
    print(f"Error al conectar con la API: {error}")
```

## Ejercicio 3: Consultar varios recursos

```python
respuesta = requests.get(f"{BASE_URL}/todos", params={"userId": 1})
tareas = respuesta.json()
for tarea in tareas:
    estado = "OK" if tarea["completed"] else "pendiente"
    print(f"- {tarea['title']} ({estado})")
```

## Ejercicio 4: Filtrar resultados

```python
completadas = [tarea for tarea in tareas if tarea["completed"]]
print(f"\nTareas completadas: {len(completadas)} de {len(tareas)}")
```
