package MisClases;

/**
 *
 * @author Diego
 */
public class Persona {
    //Atributos
    private String id;
    private String nombre;
    private int edad;
    
    //Metodos get y set
    public void setID(String ID){
        id = ID;
    }
    public String getID(){
        return id;
    }
    public void setNombre(String name){
        nombre = name;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int anios){
        edad = anios;
    }
    public int getEdad(){
        return edad;
    }
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Edad: " + edad);
    }
}
