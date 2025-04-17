
package clase10pdm2025b;

public class Circulo extends Figura {
    
    double radio;

    public Circulo(double radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public void calcularArea(){
        //double pi = 3.1416;
        System.out.println("El area del circulo es: "
                +(Math.PI*(radio*radio)));
    }
    
    
    
}
