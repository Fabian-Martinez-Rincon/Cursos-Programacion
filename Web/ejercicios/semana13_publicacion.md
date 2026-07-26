# Semana 13: Publicación de una página

Última semana del plan: tomar el proyecto integrador (semana 10) y publicarlo en
internet con una URL real que se pueda compartir.

## Ejercicio 1: Preparar el proyecto para publicar

1. Renombrar el archivo principal a `index.html` (GitHub Pages busca ese nombre).
2. Confirmar que todos los links a imágenes, CSS y JS sean relativos (por ejemplo
   `estilos.css`, no `C:\Usuarios\...\estilos.css`), para que funcionen en cualquier
   servidor.
3. Subir el proyecto final a GitHub (ver [semana 12](semana12_git_y_github.md)).

## Ejercicio 2: Publicar con GitHub Pages

1. En el repositorio de GitHub, ir a **Settings → Pages**.
2. En "Source", elegir la rama `main` y la carpeta `/ (root)`.
3. Guardar y esperar 1-2 minutos.

**Verificar:** GitHub muestra una URL como
`https://usuario.github.io/nombre-repositorio/`. Abrirla y confirmar que la página
carga igual que en local.

## Ejercicio 3: Revisar en el celular

1. Abrir la URL publicada desde un celular (o simular un celular con las herramientas
   de desarrollador del navegador, F12 → ícono de dispositivo móvil).
2. Confirmar que el diseño se adapta bien (sin scroll horizontal, texto legible, botones
   fáciles de tocar).

**Si algo se ve mal:** revisar la semana 5 (diseño adaptable) y ajustar los media queries.

## Ejercicio 4: Compartir el enlace

1. Compartir la URL publicada con otra persona (compañero, profesor, familiar).
2. Pedirle feedback: ¿algo no se entiende? ¿algún link roto? ¿algo se ve mal en su
   dispositivo?
3. Corregir lo que haga falta, confirmar el cambio con Git y volver a subirlo (GitHub
   Pages se actualiza solo con cada `git push`).

## Checklist para el profesor

- [ ] El proyecto está publicado con una URL de GitHub Pages funcionando.
- [ ] La página se ve bien tanto en escritorio como en celular.
- [ ] Recibió feedback de otra persona y aplicó al menos una corrección.
- [ ] Sabe que para actualizar la página publicada alcanza con hacer `git push`.
