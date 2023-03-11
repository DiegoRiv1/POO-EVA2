package eva2_4_formatoo_apa;
/**
 * @author Diego
 */
public class Articulo extends Documento{
    private int pagina;
    private String tituloPublicante;

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public String getTituloPublicante() {
        return tituloPublicante;
    }

    public void setTituloPublicante(String tituloPublicante) {
        this.tituloPublicante = tituloPublicante;
    }
    
}
