
package proyecto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author BS
 */
public class SerializarObjeto {


    public static <E> boolean serializarObjeto(String direccionArchivo, Serializable objeto, Class<E> ClaseObjetivo) {
        boolean sw = false;
        
        Stack<E> st = deserializarObjeto(direccionArchivo,ClaseObjetivo);
        try {
            FileOutputStream fos = new FileOutputStream(direccionArchivo);
            ObjectOutputStream salida = new ObjectOutputStream(fos);
            if(st==null)  st= new Stack<E> ();
            st.push((E)objeto);
           // System.out.println(st.size());
            for(int i =0 ;i<st.size();i++){
                salida.writeObject(st);
            }
            sw = true;
            salida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sw;
    }

    public static <E> Stack<E> deserializarObjeto(String direccionArchivo, Class<E>  ClaseObjetivo) {
        //stack clase generica
        Stack<E> lista = new Stack<>();//clase genericay
        E objeto=null;
        try {
            FileInputStream fis =new FileInputStream(direccionArchivo);
            ObjectInputStream entrada = new ObjectInputStream(fis);
            //System.out.println(fis.available());
           // while(fis.available()>0){
                //lista.push((E)entrada.readObject());
           // }
           /*
           while((objeto=(E)entrada.readObject())!=null){
               lista.push(objeto);
           }*/
            lista=(Stack<E>)entrada.readObject();
            entrada.close();
            
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
            FileOutputStream fos;
            try {
                fos = new FileOutputStream(direccionArchivo);
                ObjectOutputStream salida = new ObjectOutputStream(fos);
                salida.writeObject(null);
                System.out.println("Archivo creado");
                salida.close();
                return null;
            } catch (FileNotFoundException ex) {
                //Logger.getLogger(SerializarObjeto.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
               // Logger.getLogger(SerializarObjeto.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){

            e.printStackTrace();
            //Mostrar mensaje de error si no se encuentra la clase
        }

        //Mostrar mensaje de error si no se puede leer el arcivo
        return lista;
    }
}


