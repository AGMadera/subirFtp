package controlador;

import modelo.DatosUsuario;
import modelo.Direcciones;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

/**
 * Created by alfonsogalvanmadera on 15/07/16.
 */
public class Guardar {
    public void guardarArchivo(DatosUsuario dat, Direcciones dir) {
        try {
            FTPClient ftp = new FTPClient();
            ftp.connect(dat.getDominio());
            if (!FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
                ftp.disconnect();
            }
            ftp.login(dat.getUsuario(), dat.getPassword());
            ftp.changeWorkingDirectory(dir.getDireccionDestino());
            ftp.setFileType(FTP.BINARY_FILE_TYPE);

            for (File d : dir.getDireccionOrigen()) {
                System.out.println("Carpeta encontrada: " + d);
                subir(d, ftp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void subir(File src, FTPClient ftp)  {
        try {
            if (src.isDirectory()) {
                ftp.makeDirectory(src.getName());
                ftp.changeWorkingDirectory(src.getName());
                for (File file : src.listFiles()) {
                    subir(file, ftp);
                    System.out.println("La carpeta contiene el archivo -> " + file.getName() + " ha sido guardada en el ftp");
                }
                ftp.changeToParentDirectory();
            }else {
                InputStream srcStream = src.toURI().toURL().openStream();
                ftp.storeFile(src.getName(), srcStream);
                System.out.println("Archivo Cargado: " + src.getName());
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //ftp.disconnect();

        }
    }
}