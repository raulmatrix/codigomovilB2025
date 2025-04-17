
package clase10pdm2025b;


public class Figura {
    private int x;
    private int y;
    protected String tipoFigura;

    public Figura(int x, int y, String tipoFigura) {
        this.x = x;
        this.y = y;
        this.tipoFigura = tipoFigura;
    }

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void calcularArea(){
        System.out.println("Sobreescribir este metodo");
    }
    
    
}
