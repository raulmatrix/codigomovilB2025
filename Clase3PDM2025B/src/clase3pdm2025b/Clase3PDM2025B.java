
package clase3pdm2025b;

public class Clase3PDM2025B {

    public static void main(String[] args) {
        /*System.out.println(""+Math.random());
        System.out.println(""+Math.sqrt(144));
        int numero = (int)(Math.random()*101);
        System.out.println(""+numero);
        
        //while y do while
        int x = 5;
        while(x<7){
            System.out.println(""+x);
            x++;
        }
        
        do{
            System.out.println("x de do-while: "+x);
            x++;
        }while(x<7);*/
        //ejercicio for
        /*int fila = 5;
        int col = 6;
        
        for(int x = 1; x<=fila; x++){
            for(int y=1; y<=col; y++){ //Imprimir la fila
                if(y==col){
                    System.out.print(x*y);
                }else{
                    System.out.print(x*y+"-"); 
                }
                               
            }
            System.out.println(" ");
        }*/
        
        //break
        /*for(int i=1; i<10; i++){
            if(i==4){
                break;
                //continue;
            }
            System.out.println("Indice "+(i-1)+": "+i);
            
        }*/
        
        //arreglos
        
        int [] valores  = new int[5];
        
        /*for(int z=0;z<valores.length;z++){
            valores[z] = z+1;
            System.out.println(valores[z]);
        }*/
        
        valores[0] = 1;
        valores[1] = 10;
        valores[2] = 5;
        valores[3] = 8;
        valores[4] = 9;
        //valores[5] = 10;
        
        
    }
    
}
