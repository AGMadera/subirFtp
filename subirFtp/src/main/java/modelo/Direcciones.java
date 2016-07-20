package modelo;

import java.io.File;

/**
 * Created by alfonsogalvanmadera on 15/07/16.
 */
public class Direcciones {
    private File[] direccionOrigen;
    private String direccionDestino;

    public File[] getDireccionOrigen() {
        return direccionOrigen;
    }

    public void setDireccionOrigen(File[] direccionOrigen) {
        this.direccionOrigen = direccionOrigen;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }
}
