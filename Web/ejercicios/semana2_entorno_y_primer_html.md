# Semana 2: Entorno y primer HTML

Esta semana es de instalación y configuración, no de código complejo: el objetivo es
dejar el entorno listo para trabajar cómodamente el resto del plan.

## Ejercicio 1: Instalar el editor

1. Instalar [VS Code](https://code.visualstudio.com/).
2. Instalar la extensión **Live Server** (Ritwick Dey) desde la pestaña de extensiones.

**Verificar:** al abrir un archivo `.html` y hacer clic en "Go Live" (abajo a la
derecha), el navegador debe abrir la página automáticamente.

## Ejercicio 2: Crear la primera página

1. Crear una carpeta `mi-primera-pagina`.
2. Dentro, crear un archivo `index.html` con este contenido:

```html
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Mi primera pagina</title>
</head>
<body>
  <h1>Hola, mundo!</h1>
  <p>Esta es mi primera pagina web.</p>
</body>
</html>
```

3. Abrirlo con Live Server y confirmar que se ve en el navegador.

## Ejercicio 3: Editar y ver el cambio en vivo

1. Cambiar el texto del `<h1>` por el propio nombre.
2. Agregar un segundo `<p>` con una frase cualquiera.
3. Guardar y confirmar que Live Server actualiza la página sola (sin recargar a mano).

## Ejercicio 4: Inspeccionar una página real

1. Entrar a cualquier sitio web conocido.
2. Abrir las herramientas de desarrollador (F12 o clic derecho → "Inspeccionar").
3. Ubicar la pestaña **Elements/Elementos** y encontrar la etiqueta `<h1>` de esa página.

**Objetivo:** perder el miedo a las herramientas de desarrollador, que se van a usar
todo el resto del curso.

## Checklist para el profesor

- [ ] VS Code y Live Server instalados y funcionando.
- [ ] Creó `index.html` desde cero y lo vio en el navegador.
- [ ] Editó el archivo y vio el cambio reflejado en vivo.
- [ ] Abrió las herramientas de desarrollador de un sitio real.
