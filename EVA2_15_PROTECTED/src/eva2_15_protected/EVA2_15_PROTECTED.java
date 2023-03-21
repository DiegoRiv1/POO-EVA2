package eva2_15_protected;

import Prueba.SuperClase;

/**
 * @author Diego
 */
public class EVA2_15_PROTECTED {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
class SubClase extends SuperClase{
    public void imprimirValor(){
        System.out.println("El valor es: "+ valor);
    }
}