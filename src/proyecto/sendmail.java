/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;


/**
 *
 * @author USUARIO
 */
public class sendmail {

    private String destinatario;
    private String asunto;
    private String mensaje;
    private MimeMessage mCorreo;

    public sendmail(String destinatario, String asunto, String mensaje) {
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    public void mail(){
        String correoEnvia = "pruebagrupo32022@gmail.com";
        String contrasena = "veybezyqmvugukao";
        String destinatario = this.destinatario;
        String asunto = this.asunto;
        String mensaje = this.mensaje;
        
        
        Properties  propiedad = new Properties();
        propiedad.put("mail.smtp.host", "smtp.gmail.com");
        propiedad.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.user",correoEnvia);
        propiedad.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        propiedad.setProperty("mail.smtp.auth", "true");
        Session sesion = Session.getDefaultInstance(propiedad);
        
        
       
        
        try {
            mCorreo = new MimeMessage(sesion);
            mCorreo.setFrom(new InternetAddress(correoEnvia));
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mCorreo.setSubject(asunto);
            mCorreo.setText(mensaje, "ISO-8859-1", "html");
                     
            
        } catch (AddressException ex) {
            Logger.getLogger(sendmail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(sendmail.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Transport mTransport = sesion.getTransport("smtp");
            mTransport.connect(correoEnvia, contrasena);
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();
            
            JOptionPane.showMessageDialog(null, "Correo enviado");
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(sendmail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(sendmail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    


    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
  
}
