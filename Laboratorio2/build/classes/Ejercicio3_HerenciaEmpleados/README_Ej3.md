# Ejercicio 3 – Herencia de Empleados 👔  

Este ejercicio amplía el sistema de empleados implementando una **jerarquía completa de clases**. Se introduce una clase base `Empleado` que contiene datos generales, de la cual heredan los empleados con comisión y con salario base más comisión.  

## 📂 Archivos
- `Empleado.java` → Clase base con atributos comunes a todos los empleados (`nombre`, `apellido`, `número de cédula`). Incluye getters y `toString()`.  
- `EmpleadoPorComision.java` → Subclase que extiende `Empleado`. Representa empleados cuyos ingresos dependen de ventas brutas y una tarifa de comisión. Incluye validaciones y cálculo de ingresos.  
- `EmpleadoBaseMasComision.java` → Subclase que extiende `EmpleadoPorComision`. Agrega un salario base mensual, redefine `ingresos()` y sobreescribe `toString()`.  
- `PruebaEmpleadoPorComision.java` → Clase de prueba que instancia un empleado por comisión, imprime su información y calcula ingresos.  
- `PruebaEmpleadoBaseMasComision.java` → Clase de prueba que instancia un empleado con salario base más comisión y muestra toda la información.  

## 🎯 Objetivos del ejercicio
- Aplicar **herencia multinivel** (`Empleado` → `EmpleadoPorComision` → `EmpleadoBaseMasComision`).  
- Reutilizar atributos y métodos de la clase base.  
- Practicar **sobrescritura de métodos** (`ingresos()`, `toString()`).  
- Diferenciar entre información general de un empleado y la específica de cada tipo de contrato.  

## ▶️ Ejecución
Compilar y ejecutar las clases de prueba:  
```bash
javac *.java
java PruebaEmpleadoPorComision
java PruebaEmpleadoBaseMasComision
