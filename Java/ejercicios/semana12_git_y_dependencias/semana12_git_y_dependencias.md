# Semana 12: Gestion de dependencias (Maven) y control de versiones

Esta semana es mas practica/consola que de codigo. Los "ejercicios" son pasos a seguir y verificar.

## Ejercicio 1: Crear un proyecto Maven

Maven es el gestor de dependencias y build mas comun en Java (equivalente a `pip` + `requirements.txt` en Python).

```bash
mvn archetype:generate -DgroupId=com.ejemplo -DartifactId=mi-proyecto -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Esto genera una carpeta `mi-proyecto/` con un `pom.xml` (donde se declaran las dependencias) y
`src/main/java/` (donde va el codigo).

**Verificar:** el proyecto se genero con esa estructura de carpetas.

## Ejercicio 2: Agregar una dependencia

Agregar esto dentro de `<dependencies>` en el `pom.xml` (una libreria simple para practicar,
por ejemplo Gson para JSON):

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>
```

```bash
mvn compile
```

**Verificar:** `mvn compile` descarga la dependencia sin errores.

## Ejercicio 3: Compilar y ejecutar sin Maven (repaso)

Para los ejercicios sueltos de las semanas anteriores (un solo archivo .java, sin dependencias)
alcanza con:

```bash
javac Semana02Entorno.java
java Semana02Entorno
```

## Ejercicio 4: Iniciar un repositorio Git

```bash
git init
git add .
git commit -m "Primer commit del proyecto"
```

Crear un archivo `.gitignore` con al menos:

```
target/
*.class
datos/
```

## Ejercicio 5: Subir el proyecto a GitHub

1. Crear un repositorio nuevo en GitHub (sin README, para no generar conflictos).
2. Conectarlo y subir el proyecto:

```bash
git remote add origin <URL-del-repositorio>
git branch -M main
git push -u origin main
```

**Verificar:** el codigo aparece en GitHub, con el `pom.xml` incluido pero sin `target/`.
