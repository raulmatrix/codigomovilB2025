/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6pdm2025b;

/**
 *
 * @author Usuario
 */
public class Figura {
    
    //atributos
    int x;
    int y;
    String nombreFig;
    //metodo constructor
    //utilizando sobrecarga
    public Figura(int x,int y, String nombreFig){
        this.x = x;
        this.y = y;
        this.nombreFig = nombreFig;
    }
    
    public Figura(String nombreFig){
        this.nombreFig = nombreFig;
    }
    
    public void mostrarDatos(){
        System.out.println("Datos Figura: "
                +"Posicion en X: "+x
                +"Posiion en Y: "+y
                +"Nombre Figura"+nombreFig);
    }
}
