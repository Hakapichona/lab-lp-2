# Ejercicio 2 – Empleados 💼  

Este ejercicio implementa un sistema de empleados que trabajan por comisión, con una versión que además incluye un **salario base**. Se aplica el concepto de **herencia** en Java.  

## 📂 Archivos
- `EmpleadoPorComision.java` → Clase que representa a un empleado cuyos ingresos dependen de sus ventas brutas y una tarifa de comisión. Incluye validaciones, getters/setters y cálculo de ingresos.  
- `EmpleadoBaseMasComision.java` → Subclase que extiende `EmpleadoPorComision`. Agrega un **salario base fijo mensual** a los ingresos por comisión. Sobrescribe el método `ingresos()` y redefine `toString()`.  
- `PruebaEmpleadoPorComision.java` → Clase de prueba para crear un empleado por comisión, actualizar sus datos y mostrar resultados en consola.  
- `PruebaEmpleadoBaseMasComision.java` → Clase de prueba para crear un empleado con salario base y comisión, actualizar su salario, ventas y comisión, y mostrar la salida.  

## 🎯 Objetivos del ejercicio
- Practicar **herencia simple** (`EmpleadoBaseMasComision` hereda de `EmpleadoPorComision`).  
- Sobrescribir métodos (`ingresos()` y `toString()`).  
- Implementar **validaciones** en constructores y setters.  
- Diferenciar entre empleados que trabajan solo por comisión y los que tienen un salario base adicional.  

## ▶️ Ejecución
Compilar y ejecutar los programas de prueba:  
```bash
javac *.java
java PruebaEmpleadoPorComision
java PruebaEmpleadoBaseMasComision
