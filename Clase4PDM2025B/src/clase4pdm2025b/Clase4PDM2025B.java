
package clase4pdm2025b;

import java.util.ArrayList;


public class Clase4PDM2025B {

    
    public static void main(String[] args) {
        
        String [] datosCompra = {
                                "Lacteo-Leche-2-6",
                                "Lacteo-Yogurt-1-8",
                                "Lacteo-Queso-1-10",
                                "Verdura-Lechuga-2-5",
                                "Verdura-Tomate-1-6",
                                "Verdura-Pimenton-2-2",
       
                                };
        
        
        
        //ArrayList
        /*ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(15);
        lista.add(10);
        lista.add(25);
        //
        System.out.println(""+lista.isEmpty());
        System.out.println("Tamaño: "+lista.size());
        lista.remove(1);
        
        /*int [] datos = new int[3];
        datos[0] = 15;
        datos[1] = 10;
        datos[2] = 25;*/
        
        /*System.out.println("Valor en la posicion 1: "
                +lista.get(1));
        System.out.println("Tamaño: "+lista.size());
        lista.add(1, 100);
        System.out.println("Tamaño: "+lista.size());
        System.out.println("Valor en la posicion 1: "
                +lista.get(1));
        System.out.println("Valor en la posicion 1: "
                +lista.get(2));
        
        System.out.println("Esta dentro la lista? "
                +lista.contains(101));
        
        System.out.println("POsicion de valor 100 "
                +lista.indexOf(100));
        
        // 10 20 25 45 50 60 100 120 130
        */
        
        //ejercicio
        
        /*String datos[] = {
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

    public static String generarCorreo(String nombreCompleto) {
        nombreCompleto = nombreCompleto.toLowerCase(); 
        String[] partes = nombreCompleto.split(" ");

        String inicialNombre = partes[0].substring(0, 1); 
        String primerApellido = partes[1];
        String inicialSegundoApellido = partes[2].substring(0, 1);

        return inicialNombre + primerApellido + inicialSegundoApellido;
    }
        */
    String datos[] = {
            "Jose Perez Sotelo",
            "Alicia Ampuero Gonzales",
            "Ana Salazar Contreras",
            "Sergio Veliz Zeballos",
            "Arnold Caceres Cembo"
        };

        for (int i = 0; i < datos.length; i++) {
            String nombreCompleto = datos[i].toLowerCase(); 
            String[] partes = nombreCompleto.split(" ");

            String inicialNombre = partes[0].substring(0, 1); 
            String primerApellido = partes[1];
            String inicialSegundoApellido = partes[2].substring(0, 1);

            String correo = inicialNombre + primerApellido + inicialSegundoApellido;
            System.out.println(correo + "@incos.edu");
        }  
        
    }
    
}
