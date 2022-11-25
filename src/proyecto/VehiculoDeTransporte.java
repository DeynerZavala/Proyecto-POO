/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author USUARIO
 */
public class VehiculoDeTransporte extends Vehiculo{
    protected String color;

    public VehiculoDeTransporte(String CodigoPlaca, String Marca, int Precio, String Modelo,String color) {
        super(CodigoPlaca, Marca,  Precio, Modelo);
        this.color = color;
    }
    
    @Override
    public void MostrarCaracteristicas(){
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCodigoPlaca() {
        return CodigoPlaca;
    }

    public void setCodigoPlaca(String CodigoPlaca) {
        this.CodigoPlaca = CodigoPlaca;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
}
