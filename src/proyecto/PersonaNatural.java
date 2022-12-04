/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.JSONObject;


/**
 *
 * @author USUARIO
 */
public class PersonaNatural implements Serializable{
    private String dni;
    private String c_verificador;
    private String Nombre;
    private String Apellidos;
    private String Correo;
    //private Date Nacimiento;
    

    public PersonaNatural(int dni) {
        this.dni = Integer.toString(dni);
        this.c_verificador=null;
        this.Nombre=null;
        this.Apellidos=null;
        this.Correo=null;
        //this.Nacimiento=null;
    }
    public void Hallar_datos(){
        String enlace="http://sdv.midis.gob.pe/Sis_IDM_Admin/Persona/GetRENIEC";
        try{
            String datos="iCodAplicacion=27&iIdTipDocumento=1&vNroDocumento=" + this.dni;
            URL url =new URL(enlace);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("POST");
            conexion.setRequestProperty("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
            conexion.setRequestProperty("X-Requested-With", "XMLHttpRequest");
            conexion.setDoOutput(true);
            OutputStream output = conexion.getOutputStream();
            output.write(datos.getBytes());
            output.flush();
            output.close();
           // System.out.println(conexion.getResponseCode()); //comprobar si hay conexcion
            //System.out.println(conexion.getResponseMessage()); //comprobar si hay conexcion
            Reader in =new BufferedReader(new InputStreamReader(conexion.getInputStream(),"UTF-8"));
            StringBuilder sb =new StringBuilder();
            for(int c;(c=in.read())>=0;){
                sb.append((char)c);
            }
            String response=sb.toString();
            //System.out.println(response); // la respuesta del servidor
            JSONObject myresponse = new JSONObject(response.toString());
            //luego de usar json
            if(0==myresponse.getInt("biIdPersona")){
                JOptionPane.showMessageDialog(null,"Dni invalido",
                    "ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{
                //System.out.println("Nombre: "+myresponse.getString("vNombres"));
                //System.out.println("Apellido Paterno: "+myresponse.getString("vApePaterno"));
                //System.out.println("Apellido Materno: " +myresponse.getString("vApeMaterno"));
                this.Nombre=myresponse.getString("vNombres");
                this.Apellidos=myresponse.getString("vApePaterno")+" "+myresponse.getString("vApeMaterno");
            }
            
        }
        catch(MalformedURLException ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void Hallarcodigoverificador(){
        int suma,resto,complemento;
        suma= 5 + Character.getNumericValue(this.dni.charAt(0))*3 + Character.getNumericValue(this.dni.charAt(1))*2
               +Character.getNumericValue(this.dni.charAt(2))*7+Character.getNumericValue(this.dni.charAt(3))*6
               +Character.getNumericValue(this.dni.charAt(4))*5+Character.getNumericValue(this.dni.charAt(5))*4
               +Character.getNumericValue(this.dni.charAt(6))*3+Character.getNumericValue(this.dni.charAt(7))*2; 
        resto= suma%11;
        if(resto==1){
            complemento =0;
        }
        else{
            complemento=11-resto;
        }
        this.c_verificador="";
        this.c_verificador=Integer.toString(complemento);
        this.c_verificador=String.valueOf(this.c_verificador.charAt(0));
        //System.out.println(this.c_verificador);
    }
    
    public void mostrar(){
        System.out.println(this.dni);
        System.out.println(this.c_verificador);
        System.out.println(this.Nombre);
        System.out.println(this.Apellidos);
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getC_verificador() {
        return c_verificador;
    }

    public void setC_verificador(String c_verificador) {
        this.c_verificador = c_verificador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    
/*
   public Date getNacimiento() {
        return Nacimiento;
    } 

    public void setNacimiento(Date Nacimiento) {
        this.Nacimiento = Nacimiento;
    }
    
    */

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
}
