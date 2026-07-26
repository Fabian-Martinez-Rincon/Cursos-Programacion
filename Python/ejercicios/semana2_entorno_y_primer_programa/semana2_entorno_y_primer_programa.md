# Semana 2: Entorno y primer programa

Antes de programar: instalar Python y un editor (VS Code), y aprender a ejecutar un
archivo `.py` desde la terminal (`python nombre_archivo.py`).

## Ejercicio 1: Primer programa

```python
print("Este es mi primer programa")
```

## Ejercicio 2: Entrada y salida

```python
nombre = input("Como te llamas? ")
print("Hola,", nombre)
```

## Ejercicio 3: Mensaje personalizado

```python
nombre = input("Como te llamas? ")
edad = input("Cuantos anios tenes? ")
print(f"Hola {nombre}, el proximo anio vas a tener {int(edad) + 1} anios")
```

## Ejercicio 4: Tipos de datos

```python
numero_entero = 10
numero_decimal = 3.5
print(type(numero_entero))   # <class 'int'>
print(type(numero_decimal))  # <class 'float'>
```

## Ejercicio 5: Ordenar un programa

Ejercicio para el profesor: dar estas 4 lineas desordenadas en un papel o archivo
aparte, y que la persona las ordene para que el programa tenga sentido:

```python
print("El resultado es:", resultado)
resultado = a + b
a = int(input("Primer numero: "))
b = int(input("Segundo numero: "))
```

**Orden correcto:**

```python
a = int(input("Primer numero: "))
b = int(input("Segundo numero: "))
resultado = a + b
print("El resultado es:", resultado)
```
