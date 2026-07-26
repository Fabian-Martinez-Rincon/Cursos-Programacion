# Semana 7: Estructuras de datos

## Ejercicio 1: Lista de compras

```python
lista_compras = []
lista_compras.append("pan")
lista_compras.append("leche")
lista_compras.append("huevos")
print("Lista de compras:")
for producto in lista_compras:
    print(f"- {producto}")
```

## Ejercicio 2: Buscar un producto en la lista

```python
producto_buscado = "leche"
if producto_buscado in lista_compras:
    print(f"{producto_buscado} esta en la lista")
else:
    print(f"{producto_buscado} no esta en la lista")
```

## Ejercicio 3: Diccionario de contactos

```python
contactos = {
    "Ana": "11-2222-3333",
    "Beto": "11-4444-5555",
}
contactos["Carla"] = "11-6666-7777"  # agregar

nombre = "Beto"
if nombre in contactos:
    print(f"El telefono de {nombre} es {contactos[nombre]}")
else:
    print(f"{nombre} no esta en la agenda")
```

## Ejercicio 4: Contar palabras repetidas

```python
palabras = ["sol", "luna", "sol", "estrella", "luna", "sol"]
conteo = {}
for palabra in palabras:
    if palabra in conteo:
        conteo[palabra] += 1
    else:
        conteo[palabra] = 1
print(conteo)  # {'sol': 3, 'luna': 2, 'estrella': 1}
```

## Ejercicio 5: List comprehension

```python
cuadrados = [n ** 2 for n in range(1, 11)]
print(cuadrados)
```

## Ejercicio 6: Eliminar duplicados con un set

```python
numeros_con_repetidos = [1, 2, 2, 3, 4, 4, 4, 5]
numeros_sin_repetidos = list(set(numeros_con_repetidos))
print(numeros_sin_repetidos)
```
