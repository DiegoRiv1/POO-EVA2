package eva2_3_extends;
/**
 * @author Diego
 */
public class Docentes extends Persona{
    private String plaza;

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    public void imprimir(){
        System.out.println(plaza);
    }
}
