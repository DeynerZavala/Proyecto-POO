/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Seguridad {
    String res;
    
    public boolean validadUsuario(String usuarios[], String user, String pwd, int intentos){
        boolean encontrado=false;
        for(int i=0; i<usuarios.length;i++){
            if(usuarios[i].equalsIgnoreCase(user)&&usuarios[i+1].equals(pwd)){
                res="Bienvenido "+user;
                encontrado=true;
                JOptionPane.showMessageDialog(null,res,"Inicio de Sesion",JOptionPane.INFORMATION_MESSAGE);
                intentos=0;
                break;
            }
        }
        if(encontrado==false){
            res=" Clave y/o usuario erroneos; van "+intentos+" intentos fallidos";
            JOptionPane.showMessageDialog(null,res,"Inicio de Sesion",JOptionPane.ERROR_MESSAGE);
        }
        if(intentos>2){
            JOptionPane.showMessageDialog(null,"3 intentos fallidos, saliendo del programa","Inicio de Sesion",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        return encontrado;
    }
}
