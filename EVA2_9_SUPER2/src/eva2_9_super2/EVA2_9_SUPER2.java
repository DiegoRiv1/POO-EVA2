package eva2_9_super2;
/**
 * @author Diego
 */
public class EVA2_9_SUPER2 {

    public static void main(String[] args) {
        Estudiante student = new Estudiante(
                "22550297", "Diego", "Rivera", 18);
        student.imprimirDatos();
        System.out.println();
        
        Docentes profe = new Docentes(
                "9872479", "Julio", "Profe", 34);
        profe.imprimirDatos();
    }   
}
