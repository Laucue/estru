
package busrbuja;

public class Busrbuja {

    public static void main(String[] args) {
       
        int [] numeros = {8, 10, 6, 2, 4};
        
        for (int i = 0; i < numeros.length - 1; i++){
            for (int j=0; j< numeros.length - i-1;j++){
            
             if (numeros[j]< numeros[j+1]){
                    
                  //Intercambio de elementos
                     int temp = numeros[j];
                     numeros[j]=numeros[j+1];
                     numeros[j+1]= temp;
          
            }
       
        }
            
        }
        System.out.println("Arreglo ordenado: ");
        for (int numero : numeros){
            System.out.println(numero+" ");
        
        
        }
    
}
}
