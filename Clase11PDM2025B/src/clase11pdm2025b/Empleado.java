
package clase11pdm2025b;

import java.time.Year;
import java.util.Date;


public class Empleado {
    private String nombre;
    private String apellidos;
    private int carnet;
    private int codEmpleado;
    private int fechaIngreso;
    private double pagoHora;
    private int cantHoras;

    public Empleado(String nombre, String apellidos, int carnet, int codEmpleado, int fechaIngreso, double pagoHora, int cantHoras) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.carnet = carnet;
        this.codEmpleado = codEmpleado;
        this.fechaIngreso = fechaIngreso;
        this.pagoHora = pagoHora;
        this.cantHoras = cantHoras;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public int getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }
    
    public double calcularSueldo(){
        return (pagoHora*cantHoras)+antiguedad();
    }
    
    public int antiguedad(){
        int currentYear = Year.now().getValue();
        return currentYear - fechaIngreso;
    }
    
}
