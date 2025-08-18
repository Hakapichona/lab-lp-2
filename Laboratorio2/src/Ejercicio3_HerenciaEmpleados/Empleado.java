package Ejercicio3_HerenciaEmpleados;
/**
 *
 * @author Nelson
 * @version 18/08/2023
 */
public class Empleado {
    private final String primerNombre;
    private final String segundoNombre;
    private final String apellidoPaterno;
    private final String numeroCedula;

    // constructor con cuatro argumentos
    public Empleado(String primerNombre, String segundoNombre, 
                   String apellidoPaterno, String numeroCedula) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroCedula = numeroCedula;
    }

    // devuelve el primer nombre
    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    // devuelve el segundo nombre
    public String obtenerSegundoNombre() {
        return segundoNombre;
    }

    // devuelve el apellido paterno
    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    // devuelve el número de cédula
    public String obtenerNumeroCedula() {
        return numeroCedula;
    }

    // devuelve representación String de Empleado
    @Override
    public String toString() {
        return String.format("%s %s %s%n%s: %s", 
            obtenerPrimerNombre(), obtenerSegundoNombre(), obtenerApellidoPaterno(),
            "N° de cédula", obtenerNumeroCedula());
    }
}