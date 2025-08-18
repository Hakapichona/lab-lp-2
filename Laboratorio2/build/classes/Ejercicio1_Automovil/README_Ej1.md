
# Ejercicio 1 – Automóvil 🚗  

Este ejercicio implementa un sistema orientado a objetos para modelar un **Automóvil**, utilizando **herencia** e **interfaces** en Java.  

## 📂 Archivos
- `Vehiculo.java` → Clase abstracta base con atributos generales (marca, modelo, año, velocidad máxima) y métodos comunes (encender, apagar, acelerar, frenar).  
- `IAutomovil.java` → Interfaz que define el comportamiento básico de un automóvil (abrir/cerrar puertas, encender/apagar luces).  
- `Transporte.java` → Interfaz para transporte de personas y carga.  
- `Comodidad.java` → Interfaz que define funciones de confort (aire acondicionado, ajuste de asientos).  
- `Automovil.java` → Clase concreta que extiende `Vehiculo` e implementa las tres interfaces. Incluye atributos adicionales (tipo de combustible, cantidad de puertas, tracción) y métodos propios como `abrirCapot()` y `tocarBocina()`.  
- `AppAuto.java` → Clase principal con `main` para crear un automóvil y ejecutar sus métodos como demostración.  

## 🎯 Objetivos del ejercicio
- Practicar **herencia** (clase abstracta `Vehiculo`).  
- Implementar **múltiples interfaces** en una misma clase (`IAutomovil`, `Transporte`, `Comodidad`).  
- Diferenciar entre comportamientos generales y específicos de un automóvil.  
- Ejecutar pruebas simples desde un `main`.  

## ▶️ Ejecución
Compilar y ejecutar la clase principal:  
```bash
javac *.java
java AppAuto
