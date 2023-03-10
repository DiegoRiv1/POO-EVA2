package eva2_8_super;
/**
 * @author Diego
 */
public class EVA2_8_SUPER {

    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal(100);
        Mamifero mamifero = new Mamifero("Amarillo", 150);
        Perro perro = new Perro();
    }
    
}
class Animal{
    private int weight;
    
    public Animal(){
        System.out.println("Animal: It's alive!!");
    }
    public Animal(int weight) {
        this.weight = weight;
        System.out.println("Animal2: It's alive!!");
    }

    public int getWeight() {return weight;}
    public void setWeight(int weight) {this.weight = weight;}
    public void eat(){System.out.println("I'm eating");}
    public void breath(){System.out.println("I'm breathing");}
    
}

class Mamifero extends Animal{
    private String hairColor;
    public Mamifero(){
        super();//Llamada al constructor de la super clase
        //En este caso llama a Animal()
        //Siempre debemos llamar primero al constructor de la
        //super clase
        System.out.println("I'm a mammal!");
    }

    public Mamifero(String hairColor, int weight) {
        super(weight); //SIEMPRE LLAMAMOS AL CONTRUCTOR DE LA SUPER CLASE
        this.hairColor = hairColor;
        System.out.println("I'm a mammal!");
    }
    
}
class Perro extends Mamifero{
    public Perro(){
        super();
        System.out.println("Soy Yeya y soy un perro");
    }
        
}