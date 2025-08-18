package Ejercicio4_EmpleadoPorHora;
/**
 * @author Iset
 * @version 18/08/2025
 */

// Primero la clase Empleado (del ejercicio 3)
class Empleado {
    private String primerNombre;
    private String segundoNombre;
    private String apellidoPaterno;
    private String numeroCedula;
    
    // Constructor
    public Empleado(String primerNombre, String segundoNombre, String apellidoPaterno, String numeroCedula) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroCedula = numeroCedula;
    }
    
    // Metodos get
    public String obtenerPrimerNombre() {
        return primerNombre;
    }
    
    public String obtenerSegundoNombre() {
        return segundoNombre;
    }
    
    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }
    
    public String obtenerNumeroCedula() {
        return numeroCedula;
    }
    
    // toString
    public String toString() {
        return "Nombre: " + primerNombre + " " + segundoNombre + 
               "\nApellido: " + apellidoPaterno + 
               "\nN° de cédula: " + numeroCedula;
    }
}

// Clase EmpleadoPorHoras que hereda de Empleado
public class EmpleadoPorHoras extends Empleado {
    private double horas;  // horas trabajadas
    private double sueldo; // sueldo por hora
    
    // Constructor
    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, 
                           String numeroCedula, double sueldo, double horas) {
        // Llamar al constructor de la clase padre
        super(primerNombre, "", apellidoPaterno, numeroCedula);
        
        // Usar los metodos set para validar
        establecerSueldo(sueldo);
        establecerHoras(horas);
    }
    
    // Metodo para establecer sueldo
    public void establecerSueldo(double sueldo) {
        if (sueldo >= 0) {
            this.sueldo = sueldo;
        } else {
            System.out.println("Error: El sueldo no puede ser negativo");
            this.sueldo = 0;
        }
    }
    
    // Metodo para obtener sueldo
    public double obtenerSueldo() {
        return sueldo;
    }
    
    // Metodo para establecer horas
    public void establecerHoras(double horas) {
        if (horas >= 0 && horas <= 168) {
            this.horas = horas;
        } else {
            System.out.println("Error: Las horas deben estar entre 0 y 168");
            this.horas = 0;
        }
    }
    
    // Metodo para obtener horas
    public double obtenerHoras() {
        return horas;
    }
    
    // Metodo para calcular ingresos
    public double ingresos() {
        if (horas <= 30) {
            // Si trabaja 30 horas o menos, pago normal
            return sueldo * horas;
        } else {
            // Si trabaja mas de 30 horas, las extras van a tiempo y medio (2.5)
            double horasNormales = 30;
            double horasExtras = horas - 30;
            double pagoNormal = horasNormales * sueldo;
            double pagoExtras = horasExtras * sueldo * 2.5;
            return pagoNormal + pagoExtras;
        }
    }
    
    // toString sobrescrito
    public String toString() {
        return super.toString() + 
               "\nSueldo por hora: " + sueldo + 
               "\nHoras trabajadas: " + horas + 
               "\nIngresos totales: " + ingresos();
    }
}