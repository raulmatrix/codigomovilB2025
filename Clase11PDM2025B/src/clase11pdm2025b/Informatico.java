
package clase11pdm2025b;


public class Informatico extends Empleado{
    
    private String especialidad;

    public Informatico(String especialidad, String nombre, String apellidos, int carnet, int codEmpleado, int fechaIngreso, double pagoHora, int cantHoras) {
        super(nombre, apellidos, carnet, codEmpleado, fechaIngreso, pagoHora, cantHoras);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override
    public double calcularSueldo(){
        return super.calcularSueldo()+incrementoCargo();
    }
    
    public double incrementoCargo(){
        double incremento;
        if(especialidad=="developer"){
            incremento = 800;
        }else if(especialidad=="calidad"){
            incremento = 500;
        }else if(especialidad=="manager"){
            incremento = 1500;
        }else{
            incremento = 0;
        }
        
        return incremento;
    }
    
    
    
    
}
