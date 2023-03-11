package eva2_6_herencia_constructores;

/**
 *
 * @author Diego
 */
public class Mamifero extends Animal {

    public Mamifero() {
        System.out.println("Constructor mamifero");
    }
    
    public void tenerPelo(){
        System.out.println("Tengo pelo");
    }
}
