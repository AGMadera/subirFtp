package vista;

import modelo.DatosUsuario;
import modelo.Direcciones;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by alfonsogalvanmadera on 15/07/16.
 */
public class MenuSubir{

    public static void main(String[] args) {


        DatosUsuario datosUsuario=new DatosUsuario();
        datosUsuario.setUsuario("agmaderaInc");
        datosUsuario.setPassword("150293MAderA");
        datosUsuario.setDominio("http://agmadera.galeon.com");



        /*FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect("http://agmadera.galeon.com");

        ftpClient.login("agmaderaInc", "150293MAderA");

        int reply = ftpClient.getReplyCode();

        System.out.println("Respuesta recibida de conexión FTP:" + reply);


        if(FTPReply.isPositiveCompletion(reply))
        {
            System.out.println("Conectado Satisfactoriamente");
        }else{
            System.out.println("Imposible conectarse al servidor");
        }*/

        Direcciones direcciones=new Direcciones();
        direcciones.setDireccionDestino("/aqui es donde tiene que llegar");
        direcciones.setDireccionOrigen(new File("/Aqui es donde se encuentran los archivos").listFiles());

        //} catch (IOException e) {
        //    e.printStackTrace();
        //}

    }
}
