[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/fDvRanoc)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=23763300&assignment_repo_type=AssignmentRepo)
# 🚀 Práctica de Estructuras de Datos: Matrices y Vectores Multidimensionales 🌌

¡Bienvenido a la zona de desafíos! 🎯 Aquí daremos el salto de los arreglos lineales a las estructuras en múltiples dimensiones. Prepara tu lógica y domina las cuadrículas de datos. 💻✨

---

## 🟢 Nivel Principiante: Dando los Primeros Pasos 🚶‍♂️

### 🏫 Ejercicio 1: Registro de Calificaciones Escolares
> **Objetivo:** Creación e inicialización de matrices bidimensionales. 🛠️

* 📝 **Descripción:** Crea una matriz de `3x4` (3 filas por 4 columnas) que represente las calificaciones de 3 estudiantes en 4 materias diferentes.
* 🎯 **Tu Reto:**
    * ✅ Inicializa la matriz con valores numéricos (pueden ser fijos o aleatorios) entre **5 y 10**.
    * 🖥️ Muestra la matriz en la consola respetando un formato de tabla o cuadrícula para que sea fácilmente legible por el usuario final.

### 🏪 Ejercicio 2: Gestión de Inventario en Punto de Venta
> **Objetivo:** Acceso directo y modificación de elementos específicos. 🔍

* 📦 **Descripción:** Imagina que tienes una matriz de `4x4` que representa los estantes principales de una tienda. Cada celda contiene la cantidad de un producto disponible.
* 🎯 **Tu Reto:**
    * 📍 Escribe un programa que reciba las coordenadas `(fila, columna)` de un producto que acaba de ser vendido.
    * 📉 Reduce la cantidad de ese producto en `1`.
    * ⚠️ Si la cantidad en esa celda llega a `0` (o si ya era `0`), el programa debe lanzar una alerta visual: **"🚨 ¡Producto Agotado!"**.

---

## 🟡 Nivel Intermedio: Subiendo la Intensidad 🏃‍♂️

### 📊 Ejercicio 3: Análisis de Rendimiento Académico
> **Objetivo:** Operaciones iterativas y cálculos por fila/columna. 🧮

* 📈 **Descripción:** Reutilizando la matriz de calificaciones del *Ejercicio 1*, necesitamos calcular el rendimiento general de cada alumno para el ciclo escolar.
* 🎯 **Tu Reto:**
    * ➕ Crea un algoritmo que recorra y sume los valores de cada **fila** de la matriz.
    * ➗ Calcula el promedio correspondiente a cada estudiante.
    * 📥 Almacena el promedio de cada alumno en un **nuevo vector unidimensional** y muéstralo en pantalla de forma estructurada.

### 🗓️ Ejercicio 4: Transposición de Horarios de Clases
> **Objetivo:** Manipulación estructural avanzada de la matriz. 🔄

* ⏳ **Descripción:** Se te proporciona una matriz `N x M` que representa un horario escolar (por ejemplo: *filas = días de la semana*, *columnas = horas de clase*).
* 🎯 **Tu Reto:**
    * 🔀 Escribe un algoritmo que genere y devuelva la **matriz transpuesta**.
    * ✨ El resultado debe ser una nueva matriz `M x N` donde las filas originales ahora sean las columnas (*filas = horas de clase*, *columnas = días de la semana*).

---

## 🔴 Nivel Avanzado: Desafíos para Expertos 🦸‍♂️

### 💰 Ejercicio 5: Proyección de Costos (Álgebra Lineal)
> **Objetivo:** Multiplicación matemática de matrices. ✖️

* 🏢 **Descripción:** Tienes una matriz `A` de `3x2` que representa el volumen de compras de 3 departamentos a 2 proveedores distintos. También tienes una matriz `B` de `2x1` con los costos de envío base de cada proveedor.
* 🎯 **Tu Reto:**
    * 🧮 Realiza la multiplicación de la matriz `A` por la matriz `B`.
    * 🛒 Obtén una nueva matriz `C` de `3x1` que represente el **costo total de envío por cada departamento**.
    * 🛡️ **Regla de oro:** Tu código debe validar estrictamente que el número de columnas de `A` coincida con las filas de `B` antes de permitir la operación.

### 🗺️ Ejercicio 6: Asignación Inteligente de Asientos
> **Objetivo:** Recorridos condicionales complejos y búsqueda de patrones. 🕵️‍♂️

* 🪑 **Descripción:** Una matriz bidimensional de `5x5` representa la distribución de butacas en un aula virtual o auditorio. Un `0` representa un asiento libre y un `1` un asiento ocupado.
* 🎯 **Tu Reto:**
    * 🔎 Analiza la matriz para determinar si existen al menos **3 asientos libres contiguos en la misma fila**.
    * 🛑 El algoritmo debe detenerse exactamente al encontrar el primer bloque válido y devolver las coordenadas `(x, y)` de esos asientos.
    * ❌ Si el auditorio está muy lleno y no hay disponibilidad para un grupo de tres personas juntas, imprime un mensaje de error amigable.
