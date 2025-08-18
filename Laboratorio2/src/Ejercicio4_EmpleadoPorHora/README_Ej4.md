# Ejercicio 4 – Empleado por Horas  

En este ejercicio se amplía la jerarquía de empleados incorporando la clase `EmpleadoPorHoras`, que representa a los trabajadores cuyo salario depende de las horas trabajadas y de un sueldo por hora. Se manejan validaciones y se incluye un cálculo diferenciado para las horas extra.  

## 📂 Archivos
- `Empleado.java` → Clase base (reutilizada del ejercicio 3) con atributos comunes (`nombres`, `apellido`, `cédula`) y su representación en `toString()`.  
- `EmpleadoPorHoras.java` → Subclase de `Empleado` que incluye los atributos `horas` y `sueldo`. Implementa validaciones, cálculo de ingresos con horas normales y horas extras, además de un `toString` sobrescrito.  
- `PruebaEmpleadoPorHoras.java` → Clase de prueba con diferentes escenarios:  
  - Empleado con horas normales.  
  - Empleado con horas extras.  
  - Uso de métodos *get* y *set*.  
  - Validaciones de valores inválidos.  
  - Caso especial de 30 horas exactas.  

## 🎯 Objetivos del ejercicio
- Practicar **herencia simple** (`Empleado` → `EmpleadoPorHoras`).  
- Aplicar validaciones en métodos *set*.  
- Implementar cálculo de horas extras a **tiempo y medio (2.5)**.  
- Comprobar funcionamiento mediante diferentes casos de prueba.  

## ▶️ Ejecución
Compilar y ejecutar las clases de prueba:  
```bash
javac *.java
java PruebaEmpleadoPorHoras
