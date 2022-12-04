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
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;


/**
 *
 * @author USUARIO
 */
public class Dni {
    private String dni;
    private String c_verificador;
    public Dni(String dni) {
        this.dni = dni;
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
            System.out.println("Nombre: "+myresponse.getString("vNombres"));
            System.out.println("Apellido Paterno: "+myresponse.getString("vApePaterno"));
            System.out.println("Apellido Materno: " +myresponse.getString("vApeMaterno"));
            System.out.println("DNI: " +myresponse.getString("vNroDocumento"));
            System.out.println("Fecha de nacimiento:" +myresponse.getString("dtFecNacimiento"));
            /*
            System.out.println("Departamento: "+Departamento(myresponse.getString("vCodDepartamento")));
            System.out.println("Provincia: "+myresponse.getString("vCodProvincia"));
            System.out.println("Distrito: "+Departamento(myresponse.getString("vCodDistrito")));
            System.out.println("Direccion: "+myresponse.getString("vDireccion"));
            
            System.out.println("Telefono: "+myresponse.getString("vTelefono"));
            System.out.println("Celular: "+myresponse.getString("vCelular"));
            System.out.println("Correo Electronico: "+myresponse.getString("vCorreoElectronico"));
            */
            
            
            
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
        this.c_verificador=Integer.toString(complemento);
        this.c_verificador=String.valueOf(this.c_verificador.charAt(0));
        System.out.println(this.c_verificador);
    }
    
    public String Departamento(String i){
        switch(i){
            case "01": return "Amazonas";
            case "02": return "Ancash";
            case "03": return "Apurímac";
            case "04": return "Arequipa";
            case "05": return "Ayacucho";
            case "06": return "Cajamarca";
            case "07": return "Cusco";
            case "08": return "Huancavelica";
            case "09": return "Huánuco";
            case "10": return "Ica";
            case "11": return "Junín";
            case "12": return "La Libertad";
            case "13": return "Lambayeque";
            case "14": return "Lima";
            case "15": return "Loreto";
            case "16": return "Madre de Dios";
            case "17": return "Moquegua";
            case "18": return "Pasco";
            case "19": return "Piura";
            case "20": return "Puno";
            case "21": return "San Martín";
            case "22": return "Tacna";
            case "23": return "Tumbes";
            case "24": return "Ucayali";
            case "25": return "n";
            default: return null;
        }
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
    
}
