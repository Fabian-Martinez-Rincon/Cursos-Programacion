/*
Semana 7: Funciones, arrays y objetos en JavaScript

Ejercicio 1: Funcion simple que calcula el promedio de un array de notas.
Ejercicio 2: Recorrer un array con forEach.
Ejercicio 3: Filtrar un array con filter (solo los aprobados).
Ejercicio 4: Transformar un array con map (agregar 1 punto a cada nota).
Ejercicio 5: Objetos: representar un estudiante y mostrar sus datos.

Se puede ejecutar con "node semana7_funciones_arrays.js" en la terminal,
o pegar el codigo en la consola del navegador (F12 > Console).
*/

// ---------------------------------------------------------
// Ejercicio 1: funcion que calcula el promedio
// ---------------------------------------------------------
function calcularPromedio(notas) {
  const suma = notas.reduce((acumulado, nota) => acumulado + nota, 0);
  return suma / notas.length;
}

const notas = [8, 6, 9, 5, 7];
console.log("Promedio:", calcularPromedio(notas));

// ---------------------------------------------------------
// Ejercicio 2: recorrer con forEach
// ---------------------------------------------------------
notas.forEach((nota, indice) => {
  console.log(`Nota ${indice + 1}: ${nota}`);
});

// ---------------------------------------------------------
// Ejercicio 3: filtrar con filter
// ---------------------------------------------------------
const aprobados = notas.filter((nota) => nota >= 6);
console.log("Aprobados:", aprobados);

// ---------------------------------------------------------
// Ejercicio 4: transformar con map
// ---------------------------------------------------------
const notasConBonus = notas.map((nota) => nota + 1);
console.log("Notas con 1 punto extra:", notasConBonus);

// ---------------------------------------------------------
// Ejercicio 5: objetos
// ---------------------------------------------------------
const estudiante = {
  nombre: "Lucia",
  edad: 20,
  notas: [8, 7, 9],
  mostrarResumen() {
    console.log(`${this.nombre} (${this.edad} anios) - promedio: ${calcularPromedio(this.notas)}`);
  },
};

estudiante.mostrarResumen();
