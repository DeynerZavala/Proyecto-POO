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
public class Mensaje {
    
    public static int Preguntar(String mensaje,String titulo){
        return JOptionPane.showOptionDialog(null, mensaje, titulo, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si","No"}, 0);
       
    }
}
