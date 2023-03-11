package eva2_5_herencia;
/**
 * @author Diego
 */
public class EVA2_5_HERENCIA {
    
    
    public static void main(String[] args) {
        subClase sub = new subClase();
        sub.mensaje();
        sub.texto();
    }
    
}
class superClase{
    public void mensaje(){
        System.out.println("Hola");
    }
}

class subClase extends superClase{
    public void texto(){
        System.out.println("UN TEXTOTE");
    }
}