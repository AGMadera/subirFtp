package modelo;

/**
 * Created by alfonsogalvanmadera on 15/07/16.
 */
public class DatosUsuario {
    private String usuario;
    private String password;
    private String dominio;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }
}
