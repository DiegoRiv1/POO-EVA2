package eva2_3_extends;

/**
 * @author Diego
 */
public class EVA2_3_EXTENDS {

    
    public static void main(String[] args) {
        Estudiante estu = new Estudiante();
        estu.setNombre("Diego");
        estu.setApellido("Rivera");
        estu.setEdad(18);
        estu.setNoControl("22550297");
        System.out.println("DATOS DEL ESTUDIANTE: ");
        System.out.println(estu.getNombre());
        System.out.println(estu.getApellido());
        System.out.println(estu.getEdad());
        System.out.println(estu.getNoControl());
    }
    
}
