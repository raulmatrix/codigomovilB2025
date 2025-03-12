
package clase2pdm2025b;

public class Clase2PDM2025B {

    
    public static void main(String[] args) {
        
        String frase = "Nunca dejes de aprender";
        System.out.println("Tamaño de la frase: "+frase.length());
        
        //System.out.println(""+frase.charAt(0));
        frase.toLowerCase();//convertir a minusculas
        int contVocal = 0; 
        int contCons = 0;
        for(int i=0;i<frase.length();i++){
            //System.out.println(""+frase.charAt(i));
            char letra = frase.charAt(i);
            if((letra =='a')||(letra =='e')||(letra =='i')||(letra =='o')||(letra =='u')){
               contVocal++;
            }else if(letra!=' '){
                contCons++;
            }
        }
        
        System.out.println("Vocales: "+contVocal);
        System.out.println("Consonantes: "+contCons);
        
        
    }
    
}
