
package clase7pdm2025b;

import java.util.Scanner; //adicionar el paquete que corresponde


public class Clase7PDM2025B {

    
    public static void main(String[] args) {
        /*Estudiante pedroLopez = 
                new Estudiante("Pedro", "Lopez Rojas", "Sistemas", 1);
        
        pedroLopez.setCarrera("Contaduria");*/
        
        Scanner teclado = new Scanner(System.in);
        
        /*System.out.println("Que edad tienes?");
        int edad = teclado.nextInt(); //obtencion del teclado
        
        if(edad<18){
            System.out.println("Menor de edad");
        }else{
            System.out.println("Es mayor de edad, puede ingresar");
        }*/
        
        System.out.println("Ingrese su nombre");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = teclado.nextLine();
        System.out.println("Ingrese la carrera en la que estudia");
        String carrera = teclado.nextLine();
        System.out.println("Ingrese su codigo");
        int codEst = teclado.nextInt();
        
        Estudiante nuevoEst = 
                new Estudiante(nombre, apellido, carrera, codEst);
        nuevoEst.mostrarDatos();
        
        teclado.close();
    }
    
}
