# Semana 8: Funciones y manejo de errores

## Ejercicio 1: Funcion sin parametros

```python
def saludar():
    print("Hola! Bienvenido al programa")


saludar()
```

## Ejercicio 2: Funcion con parametros

```python
def sumar(a, b):
    return a + b


resultado = sumar(4, 7)
print("La suma es", resultado)
```

## Ejercicio 3: Variables locales vs. globales

```python
mensaje_global = "Soy una variable global, se ve desde cualquier funcion"


def mostrar_variables():
    mensaje_local = "Soy una variable local, solo existo dentro de esta funcion"
    print(mensaje_global)
    print(mensaje_local)


mostrar_variables()
# print(mensaje_local)  # Esto daria error: mensaje_local no existe aca afuera
```

## Ejercicio 4: Dividir un problema en funciones

```python
def pedir_numero(mensaje):
    return float(input(mensaje))


def calcular_promedio(a, b, c):
    return (a + b + c) / 3


def mostrar_resultado(promedio):
    print("El promedio es", promedio)


nota1 = pedir_numero("Primera nota: ")
nota2 = pedir_numero("Segunda nota: ")
nota3 = pedir_numero("Tercera nota: ")
promedio = calcular_promedio(nota1, nota2, nota3)
mostrar_resultado(promedio)
```

## Ejercicio 5: Valor por defecto

```python
def saludar_en_idioma(nombre, idioma="es"):
    saludos = {"es": "Hola", "en": "Hello", "pt": "Ola"}
    saludo = saludos.get(idioma, "Hola")
    print(f"{saludo}, {nombre}!")


saludar_en_idioma("Fabian")           # Hola, Fabian!
saludar_en_idioma("John", "en")       # Hello, John!
```

## Ejercicio 6: Manejo de errores con try/except

```python
try:
    numero = int(input("Ingresa un numero: "))
    print(f"El doble es {numero * 2}")
except ValueError:
    print("Eso no es un numero valido")
```

## Ejercicio 7: Proyecto de la semana — calculadora con funciones

```python
def restar(a, b):
    return a - b


def multiplicar(a, b):
    return a * b


def dividir(a, b):
    try:
        return a / b
    except ZeroDivisionError:
        print("No se puede dividir por cero")
        return None


numero1 = float(input("Primer numero: "))
numero2 = float(input("Segundo numero: "))
operacion = input("Operacion (+, -, *, /): ")

if operacion == "+":
    print(sumar(numero1, numero2))
elif operacion == "-":
    print(restar(numero1, numero2))
elif operacion == "*":
    print(multiplicar(numero1, numero2))
elif operacion == "/":
    print(dividir(numero1, numero2))
else:
    print("Operacion invalida")
```
