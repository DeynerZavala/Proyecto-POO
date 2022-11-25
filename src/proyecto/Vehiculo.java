/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author USUARIO
 */
public abstract class Vehiculo {
    protected String CodigoPlaca;
    protected String Marca;
    protected int Precio;
    protected String Modelo;

    public Vehiculo(String CodigoPlaca, String Marca, int Precio, String Modelo) {
        this.CodigoPlaca = CodigoPlaca;
        this.Marca = Marca;
        this.Precio = Precio;
        this.Modelo = Modelo;
    }
    
     public abstract void MostrarCaracteristicas();


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
