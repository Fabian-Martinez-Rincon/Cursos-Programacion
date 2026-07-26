# Semana 4: Condicionales

## Ejercicio 1: Mayor de edad

```python
edad = int(input("Cuantos anios tenes? "))
if edad >= 18:
    print("Sos mayor de edad")
else:
    print("Sos menor de edad")
```

## Ejercicio 2: Aprobo la materia

```python
nota = float(input("Ingresa tu nota: "))
if nota >= 6:
    print("Aprobaste la materia")
else:
    print("No aprobaste la materia")
```

## Ejercicio 3: Mayor de dos numeros

```python
numero1 = float(input("Primer numero: "))
numero2 = float(input("Segundo numero: "))
if numero1 > numero2:
    print("El mayor es", numero1)
elif numero2 > numero1:
    print("El mayor es", numero2)
else:
    print("Son iguales")
```

## Ejercicio 4: Condiciones anidadas

```python
nota = float(input("Ingresa tu nota: "))
if nota >= 9:
    print("Excelente")
else:
    if nota >= 6:
        print("Aprobado")
    else:
        print("Desaprobado")
```

## Ejercicio 5: Operadores and / or / not

```python
edad = int(input("Cuantos anios tenes? "))
tiene_dni = input("Tenes DNI? (si/no) ") == "si"

if edad >= 16 and tiene_dni:
    print("Podes votar")
else:
    print("Todavia no podes votar")
```
