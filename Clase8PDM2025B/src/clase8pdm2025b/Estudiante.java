
package clase8pdm2025b;


public class Estudiante {
    //atributos
     private String nombre;
     private String apellido;
     private String carrera;
     private int codEst;
    
    //metodos constructores

    public Estudiante(String nombre, String apellido, int codEst) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codEst = codEst;
    }

    public Estudiante(String nombre, String apellido, String carrera, int codEst) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.codEst = codEst;
    }
    
    //metodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCodEst() {
        return codEst;
    }

    public void setCodEst(int codEst) {
        this.codEst = codEst;
    }
    
    public void mostrarDatos(){
        System.out.println("Datos Estudiante: "
                +"\n Nombre: "+nombre
                +"\n Apellido: "+apellido
                +"\n Carrera: "+carrera
                +"\n Cod Estudiante: "+codEst);
        System.out.println("-----------------");
    }
   
}
