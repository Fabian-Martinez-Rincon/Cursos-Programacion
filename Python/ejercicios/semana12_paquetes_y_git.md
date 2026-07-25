# Semana 12: Paquetes del ecosistema y control de versiones

Esta semana es mas practica/consola que de codigo. Los "ejercicios" son pasos a seguir y verificar.

## Ejercicio 1: Crear un entorno virtual

```bash
python -m venv venv
```

Activar el entorno:

```bash
# Windows (PowerShell)
venv\Scripts\Activate.ps1

# Linux/Mac
source venv/bin/activate
```

**Verificar:** el prompt de la terminal debe mostrar `(venv)` al principio.

## Ejercicio 2: Instalar un paquete y congelar dependencias

```bash
pip install requests
pip freeze > requirements.txt
```

**Verificar:** el archivo `requirements.txt` debe contener una linea como `requests==2.x.x`.

## Ejercicio 3: Probar que el paquete instalado funciona

Ver [semana12_prueba_requests.py](semana12_prueba_requests.py) — un script minimo que usa `requests`
para confirmar que la instalacion funciono.

## Ejercicio 4: Iniciar un repositorio Git

```bash
git init
git add .
git commit -m "Primer commit del proyecto"
```

Crear un archivo `.gitignore` con al menos:

```
venv/
datos/
__pycache__/
*.pyc
```

## Ejercicio 5: Subir el proyecto a GitHub

1. Crear un repositorio nuevo en GitHub (sin README, para no generar conflictos).
2. Conectarlo y subir el proyecto:

```bash
git remote add origin <URL-del-repositorio>
git branch -M main
git push -u origin main
```

**Verificar:** el codigo aparece en GitHub y `requirements.txt` esta incluido (pero no `venv/`).
