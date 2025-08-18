package Ejercicio4_EmpleadoPorHora;
/**
 * Clase de prueba para EmpleadoPorHoras
 * @author Iset
 * @version 18/08/2025
 */
public class PruebaEmpleadoPorHoras {
    
    public static void main(String[] args) {
        System.out.println("PRUEBA DE EmpleadoPorHoras");
        System.out.println("==========================");
        
        // Crear un empleado con pocas horas (sin horas extras)
        System.out.println("\n1. Empleado con 25 horas:");
        EmpleadoPorHoras empleado1 = new EmpleadoPorHoras("Juan", "Perez", "1234567", 50000, 25);
        System.out.println(empleado1);
        
        System.out.println("\n" + "=".repeat(40));
        
        // Crear un empleado con muchas horas (con horas extras)
        System.out.println("\n2. Empleado con 45 horas (con horas extras):");
        EmpleadoPorHoras empleado2 = new EmpleadoPorHoras("Maria", "Lopez", "7654321", 40000, 45);
        System.out.println(empleado2);
        
        System.out.println("\n" + "=".repeat(40));
        
        // Probar los metodos get y set
        System.out.println("\n3. Probando metodos get y set:");
        System.out.println("Antes:");
        System.out.println("Horas: " + empleado1.obtenerHoras());
        System.out.println("Sueldo: " + empleado1.obtenerSueldo());
        
        // Cambiar valores
        empleado1.establecerHoras(40);
        empleado1.establecerSueldo(60000);
        
        System.out.println("Despues:");
        System.out.println("Horas: " + empleado1.obtenerHoras());
        System.out.println("Sueldo: " + empleado1.obtenerSueldo());
        System.out.println("Nuevos ingresos: " + empleado1.ingresos());
        
        System.out.println("\n" + "=".repeat(40));
        
        // Probar validaciones
        System.out.println("\n4. Probando validaciones:");
        
        System.out.println("Intentando poner sueldo negativo:");
        empleado1.establecerSueldo(-1000);
        
        System.out.println("Intentando poner 200 horas:");
        empleado1.establecerHoras(200);
        
        System.out.println("\n" + "=".repeat(40));
        
        // Caso especial: exactamente 30 horas
        System.out.println("\n5. Empleado con exactamente 30 horas:");
        EmpleadoPorHoras empleado3 = new EmpleadoPorHoras("Carlos", "Rodriguez", "9876543", 45000, 30);
        System.out.println(empleado3);
        
        System.out.println("\nFIN DE LAS PRUEBAS");
    }
}