
package clase8pdm2025b;

import java.util.ArrayList;
import java.util.Scanner;


public class Clase8PDM2025B {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        int opcion;
        
        do{
            System.out.println("\n Menu de opciones");
            System.out.println("1. Insertar nuevo registro");
            System.out.println("0. Terminar proceso y mostrar");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch(opcion){
            case 1: System.out.println("Insertar Datos");
            System.out.print("Ingrese su nombre: ");
            String nombre = teclado.nextLine();
            System.out.print("Ingrese su apellido: ");
            String apellido = teclado.nextLine();
            System.out.print("Ingrese la carrera en la que estudia: ");
            String carrera = teclado.nextLine();
            System.out.print("Ingrese su codigo: ");
            int codEst = teclado.nextInt();

            estudiantes.add(new Estudiante(nombre, apellido,carrera,codEst));
            System.out.println("Estudiante registrado!!!");
            break;
            
            case 0:
                    System.out.println("Salida de programa...");
                    for(int i=0;i<estudiantes.size();i++){
                        estudiantes.get(i).mostrarDatos();
                    }
                    break;
            default:
                    System.out.println("Opcion no valida");
          }
            
        }while(opcion!=0);
    
        
        
    }
    
}
