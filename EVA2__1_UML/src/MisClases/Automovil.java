package MisClases;

/**
 * @author Diego
 */
public class Automovil {
    //Atributos
    private String marca;
    private String modelo;
    private int anio;
    
    //Metodos Get y Set
    public void setMarca(String brand){
        marca = brand;
    }
    public String getMarca(){
        return marca;
    }
    public void setModelo(String model){
        modelo = model;
    }
    public String getModelo(){
        return modelo;
    }
    public void setAnio(int year){
        anio = year;
    }
    public int getAnio(){
        return anio;
    }
    
    //Metodo imprimir
    public void imprimirDatos(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Anio: "+ anio);
    }
}
