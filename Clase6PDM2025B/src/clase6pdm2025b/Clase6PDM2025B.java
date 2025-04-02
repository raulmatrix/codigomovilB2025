
package clase6pdm2025b;

public class Clase6PDM2025B {

    
    public static void main(String[] args) {
        
        //instancia de Figura
        Figura triangulo = new Figura(5, 5, "Triangulo");
        triangulo.mostrarDatos();
        
        /*System.out.println("Multiplicacion: "
                +multiplicar(10));*/
        
        String datos[] = {
            "Jose Perez Sotelo",
            "Alicia Ampuero Gonzales",
            "Ana Salazar Contreras",
            "Sergio Veliz Zeballos",
            "Arnold Caceres Cembo"
        };

       for (int i = 0; i < datos.length; i++) {
            String correo = generarCorreo(datos[i]);
            System.out.println(correo + "@incos.edu");
       }
    }
        
    
    
    //funcion multiplicar
    /*public static int multiplicar(int valor){
        return valor*50;
    }
    
    public void saludar(){
        System.out.println("Hola");
    }*/
    
    public static String generarCorreo(String nombreCompleto) {
        nombreCompleto = nombreCompleto.toLowerCase(); //minuscula
        String[] partes = nombreCompleto.split(" ");//particion

        String inicialNombre = partes[0].substring(0, 1); 
        String primerApellido = partes[1];
        String inicialSegundoApellido = partes[2].substring(0, 1);

        return inicialNombre + primerApellido + inicialSegundoApellido;
    }
    
    
    
}
