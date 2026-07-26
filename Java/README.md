# Plan de estudio: Java orientado a objetos

Camino completo desde cero: no requiere haber programado antes en otro lenguaje. El eje
del camino es la **Programación Orientada a Objetos (semana 11)**: las semanas 1-10 son
la base de lógica y sintaxis necesaria para aprovecharla de verdad, y la especialización
(Spring Boot) es POO aplicada a un framework real. 13 semanas de base (4hs/semana) +
especialización Backend con Spring Boot.

## Semanas

1. **Conocer la computadora** — [Ejercicios](ejercicios/semana1_conocer_la_computadora.md)
2. **Entorno y primer programa** — [Ejercicios](ejercicios/Semana02Entorno.java)
3. **Variables y tipos de datos** — [Ejercicios](ejercicios/Semana03Variables.java)
4. **Condicionales** — [Ejercicios](ejercicios/Semana04Condicionales.java)
5. **Repeticiones (while y for)** — [Ejercicios](ejercicios/Semana05Repeticiones.java)
6. **Contadores y acumuladores** — [Ejercicios](ejercicios/Semana06Contadores.java)
7. **Arrays, ArrayList y HashMap** — [Ejercicios](ejercicios/Semana07Estructuras.java)
8. **Métodos y manejo de excepciones** — [Ejercicios](ejercicios/Semana08Funciones.java)
9. **Proyecto integrador** — [Ejercicios](ejercicios/Semana09ProyectoIntegrador.java)
10. **Archivos (txt, CSV, Properties)** — [Ejercicios](ejercicios/Semana10Archivos.java)
11. **Programación orientada a objetos (eje del camino)** — no es una sola semana: es su propio curso completo, con teoría en PDF y ejercicios, en [POO/readme.md](../POO/readme.md)
12. **Maven y control de versiones (Git)** — [Ejercicios](ejercicios/semana12_git_y_dependencias.md)
13. **Consumo de APIs** — [Ejercicios](ejercicios/Semana13Apis.java)

Cada semana 2-10 y 13 es un único archivo `.java` con un método `main` que ejecuta
todos los ejercicios de esa semana en orden (compilar con `javac NombreDelArchivo.java`
y ejecutar con `java NombreDelArchivo`, sin el `.java` al final). La semana 11 (POO) es
la excepción: se sigue [POO/readme.md](../POO/readme.md) en vez de un archivo de ejercicios
de esta carpeta, y puede tomar varias semanas en la práctica — las semanas 1-10 existen
para llegar a esta con la lógica y la sintaxis ya resueltas, no como un fin en sí mismas.

## Especialización: Backend con Spring Boot

<a id="especializacion"></a>

Después de la semana 13, para orientarse a desarrollo backend profesional. Spring Boot
está construido enteramente sobre POO (cada endpoint, cada capa de acceso a datos, es una
clase con una responsabilidad), así que esta especialización es la semana 11 aplicada a
un framework real, no un tema nuevo:

* Crear un proyecto con Spring Initializr (start.spring.io).
* Controladores REST (`@RestController`, `@GetMapping`, `@PostMapping`) — clases y objetos.
* Persistencia con Spring Data JPA + Hibernate — entidades como clases, herencia y relaciones.
* Base de datos (H2 para practicar, luego PostgreSQL/MySQL).
* Validación de datos de entrada.
* Endpoints tipo CRUD completos.

**Proyecto final:** una API REST simple (por ejemplo, retomar el Sistema de notas
de la semana 9 y exponerlo como API en vez de programa de consola, esta vez modelando
`Estudiante` y `Nota` como clases con sus relaciones en vez de una lista suelta).

## Seguimiento

Usar el checklist de [resumen_seguimiento.md](../resumen_seguimiento.md) todas las semanas.

## Recursos

* Documentación oficial: https://docs.oracle.com/en/java/javase/17/docs/api/index.html
* Ejercicios extra: https://exercism.org/tracks/java
