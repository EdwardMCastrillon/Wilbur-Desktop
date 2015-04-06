/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Edward
 */
public class EnviarEmail {
    
    ImageIcon icoMensajeInfor = new ImageIcon("C:\\OriginalPorcicolaWilbur\\src\\Imagenes\\IconoInformacion.jpg");

    public EnviarEmail(String correo, String nombre, String usuario, String clave, String tipoMensaje, String mensaje) {

        if (enviarEmail(correo, nombre, usuario, clave, tipoMensaje)) {
            JOptionPane.showMessageDialog(null, mensaje,tipoMensaje, JOptionPane.OK_OPTION, icoMensajeInfor);
        } else {

            JOptionPane.showMessageDialog(null, "Error al  Enviar el Mensaje", "Informaci\u00f3n de Envio",
                    JOptionPane.OK_OPTION, icoMensajeInfor);
        }
    }

    private boolean enviarEmail(String correo, String nombre, String usuario, String clave, String tipoMensaje) {

        try {
            // Propiedades de la conexión
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

            // Preparamos la sesion
            Session session = Session.getDefaultInstance(props);

            String str_De = "porcicolawilbur@gmail.com";
            String str_PwRemitente = "admonwilbur";
            String str_Para = correo;
            String str_Asunto = tipoMensaje;
            String str_Mensaje = "Sistema de Administracion Granja Porcicola Wilbur G.A.P.\n\n"
                    + "Los Datos de Acceso de su cuenta son:\n"
                    + "\nNombre: " + nombre + "\n" + "Correo: " + correo + "\n" + "Usuario: " + usuario + "\n" + "Contraseña: " + clave
                    + "\n\nAtentamente," + "\n\nEquipo de Desarrollo G.A.P.";

            //Obtenemos los destinatarios
            String destinos[] = str_Para.split(",");

            // Construimos el mensaje
            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(str_De));

            Address[] receptores = new Address[destinos.length];
            int j = 0;

            while (j < destinos.length) {
                receptores[j] = new InternetAddress(destinos[j]);
                j++;
            }
            //receptores.
            message.addRecipients(Message.RecipientType.TO, receptores);
            message.setSubject(str_Asunto);
            message.setText(str_Mensaje);

            // Lo enviamos.
            Transport t = session.getTransport("smtp");
            t.connect(str_De, str_PwRemitente);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));

            // Cierre de la conexion.
            t.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
