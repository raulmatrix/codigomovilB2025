
package clase10pdm2025b;

public class Triangulo extends Figura{
    
    private int base;
    private int altura;
    
    public Triangulo(int x, int y,int base, int altura){
        super(x, y);//referencia padre
        this.base = base;
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    @Override
    public void calcularArea(){
        System.out.println("El area del triangulo es :"
                +(base*altura)/2);
        
    }
    
    public void mostrarTipoFigura(){
        System.out.println("Tipo Figura"+tipoFigura);
    }
    
    
}
