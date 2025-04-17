
package clase10pdm2025b;


public class Clase10PDM2025B {

   
    public static void main(String[] args) {
       Figura fig = new Figura(5, 10);
       fig.calcularArea();
       
       Triangulo tri1 = new Triangulo(10, 15, 50, 30);
       tri1.calcularArea();
       
       Circulo cir1 = new Circulo(20, 5, 30);
       cir1.calcularArea();
    }
    
}
