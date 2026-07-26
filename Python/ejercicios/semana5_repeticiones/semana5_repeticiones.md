# Semana 5: Repeticiones

## Ejercicio 1: Contar del 1 al 10 con while

```python
numero = 1
while numero <= 10:
    print(numero)
    numero += 1  # actualizar la variable es lo que evita el bucle infinito
```

## Ejercicio 2: Proyecto de la semana — contar numeros ingresados

```python
cantidad_ingresados = 0
numero = int(input("Ingresa un numero (0 para terminar): "))
while numero != 0:
    cantidad_ingresados += 1
    numero = int(input("Ingresa un numero (0 para terminar): "))

print("Ingresaste", cantidad_ingresados, "numeros distintos de cero")
```

## Ejercicio 3: Pedir una contrasenia hasta acertar

```python
contrasenia_correcta = "python123"
intento = input("Ingresa la contrasenia: ")
while intento != contrasenia_correcta:
    print("Incorrecta, intenta de nuevo")
    intento = input("Ingresa la contrasenia: ")
print("Acceso concedido")
```

## Ejercicio 4: Bucle infinito (NO ejecutar tal cual)

Mostrar este bloque y preguntar: "por que este programa nunca termina?" (respuesta:
la variable `contador` nunca cambia, entonces la condicion siempre es verdadera).

```python
contador = 0
while contador < 5:
    print("Este mensaje se repite para siempre")
```

## Ejercicio 5: For en vez de while

```python
for i in range(1, 21):
    print(i)
```

## Ejercicio 6: FizzBuzz

```python
for i in range(1, 31):
    if i % 3 == 0 and i % 5 == 0:
        print("FizzBuzz")
    elif i % 3 == 0:
        print("Fizz")
    elif i % 5 == 0:
        print("Buzz")
    else:
        print(i)
```
