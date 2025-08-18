package Ejercicio3_HerenciaEmpleados;
/**
 *
 * @author Nelson
 * @version 17/08/25
 */
public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas; // ventas totales por semana
    private double tarifaComision; // porcentaje de comisión
    
    // constructor con seis argumentos
    public EmpleadoPorComision(String primerNombre, String segundoNombre, 
            String apellidoPaterno, String numeroCedula, 
            double ventasBrutas, double tarifaComision) {
        super(primerNombre, segundoNombre, apellidoPaterno, numeroCedula);
        
        // validaciones
        if(ventasBrutas < 0.0)
            throw new IllegalArgumentException("Ventas brutas debe ser >= 0.0");
        if(tarifaComision <= 0.0 || tarifaComision >= 1.0)
            throw new IllegalArgumentException(
                    "La tarifa de comision debe ser > 0.0 y < 1.0");
        
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    // establece el valor de ventas brutas
    public void establecerVentasBrutas(double ventasBrutas) {
        if(ventasBrutas < 0.0)
            throw new IllegalArgumentException(
                    "Las ventas brutas deben ser >= 0.0");
        this.ventasBrutas = ventasBrutas;
    }
    
    // devuelve el monto de ventas brutas
    public double obtenerVentasBrutas() {
        return ventasBrutas;
    }

    // establece la tarifa de comisión
    public void establecerTarifaComision(double tarifaComision) {
        if(tarifaComision <= 0.0 || tarifaComision >= 1.0)
            throw new IllegalArgumentException( 
                    "La tarifa de comisión debe ser > 0.0 y < 1.0");
        this.tarifaComision = tarifaComision;
    }

    // devuelve la tarifa de comisión
    public double obtenerTarifaComision() {
        return tarifaComision;
    }

    // calcula los ingresos
    public double ingresos() {
        return obtenerTarifaComision() * obtenerVentasBrutas(); 
    }

    // devuelve representación String del objeto EmpleadoPorComision
    @Override
    public String toString() {
        return String.format("%s%n%s: %.2f%n%s: %.2f",
            super.toString(),
            "Las ventas brutas son", obtenerVentasBrutas(),
            "La comisión es", obtenerTarifaComision());
    }
}