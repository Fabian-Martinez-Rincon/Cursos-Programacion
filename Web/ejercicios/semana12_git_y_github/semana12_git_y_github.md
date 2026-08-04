# Semana 12: Git y GitHub

Esta semana es mas practica/consola que de codigo. Los "ejercicios" son pasos a seguir y verificar.

## Ejercicio 1: Iniciar un repositorio Git

```bash
git init
git add .
git commit -m "Primer commit del proyecto"
```

Crear un archivo `.gitignore` con al menos:

```
.vscode/
*.log
```

## Ejercicio 2: Ver el estado y el historial

```bash
git status
git log --oneline
```

**Verificar:** puede explicar la diferencia entre un archivo "modificado", uno "staged"
(agregado con `git add`) y uno "committed".

## Ejercicio 3: Hacer un cambio y una segunda confirmacion

1. Editar el archivo del proyecto de la semana 10 (`semana10_proyecto_integrador.html`; cambiar algun texto). El renombre a `index.html` se hace recien en la semana 13, al publicar.
2. Confirmar el cambio:

```bash
git add .
git commit -m "Actualizar seccion sobre mi"
```

## Ejercicio 4: Crear el repositorio en GitHub y subir el proyecto

1. Crear un repositorio nuevo en GitHub (sin README, para no generar conflictos).
2. Conectarlo y subir el proyecto:

```bash
git remote add origin <URL-del-repositorio>
git branch -M main
git push -u origin main
```

**Verificar:** el codigo aparece en GitHub, incluyendo el historial de commits.

## Ejercicio 5: Ramas (branches)

```bash
git checkout -b nueva-seccion
```

1. Agregar una seccion nueva a la pagina (por ejemplo, "Habilidades").
2. Confirmar el cambio en la rama nueva.
3. Volver a `main` y fusionar (merge) la rama:

```bash
git checkout main
git merge nueva-seccion
```

**Verificar:** el cambio de la rama `nueva-seccion` aparece en `main`.
