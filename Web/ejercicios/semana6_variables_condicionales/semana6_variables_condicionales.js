/*
Semana 6: Variables, condicionales y ciclos en JavaScript

Ejercicio 1: Declarar variables con let/const y mostrar su tipo.
Ejercicio 2: Determinar si una persona es mayor de edad (condicional).
Ejercicio 3: Clasificar una nota en Excelente/Aprobado/Desaprobado (if/else if).
Ejercicio 4: Ciclo for: mostrar la tabla del 5.
Ejercicio 5: Ciclo while: sumar numeros hasta que el total supere 50.

Se puede ejecutar con "node semana6_variables_condicionales.js" en la terminal,
o pegar el codigo en la consola del navegador (F12 > Console).
*/

// ---------------------------------------------------------
// Ejercicio 1: variables y tipos
// ---------------------------------------------------------
const nombre = "Ana";
let edad = 25;
const esEstudiante = true;

console.log(nombre, typeof nombre);
console.log(edad, typeof edad);
console.log(esEstudiante, typeof esEstudiante);

// ---------------------------------------------------------
// Ejercicio 2: mayor de edad
// ---------------------------------------------------------
edad = 16;
if (edad >= 18) {
  console.log("Es mayor de edad");
} else {
  console.log("Es menor de edad");
}

// ---------------------------------------------------------
// Ejercicio 3: clasificar una nota
// ---------------------------------------------------------
const nota = 7;
if (nota >= 9) {
  console.log("Excelente");
} else if (nota >= 6) {
  console.log("Aprobado");
} else {
  console.log("Desaprobado");
}

// ---------------------------------------------------------
// Ejercicio 4: tabla del 5 (ciclo for)
// ---------------------------------------------------------
for (let i = 1; i <= 10; i++) {
  console.log(`5 x ${i} = ${5 * i}`);
}

// ---------------------------------------------------------
// Ejercicio 5: sumar hasta superar 50 (ciclo while)
// ---------------------------------------------------------
let total = 0;
let numero = 1;
while (total <= 50) {
  total += numero;
  numero++;
}
console.log(`El total supero 50: ${total}`);
