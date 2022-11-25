/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author USUARIO
 */
public class VehiculoDeCarga extends Vehiculo{
    protected float CapacidadDeCarga;
    protected int Ejes;

    public VehiculoDeCarga(String CodigoPlaca, String Marca, int Precio, String Modelo, float CapacidadDeCarga, int Ejes) {
        super(CodigoPlaca, Marca,  Precio, Modelo);
        this.CapacidadDeCarga = CapacidadDeCarga;
        this.Ejes = Ejes;
    }
    
    @Override
    public void MostrarCaracteristicas(){
        
    }

    public float getCapacidadDeCarga() {
        return CapacidadDeCarga;
    }

    public void setCapacidadDeCarga(float CapacidadDeCarga) {
        this.CapacidadDeCarga = CapacidadDeCarga;
    }

    public int getEjes() {
        return Ejes;
    }

    public void setEjes(int Ejes) {
        this.Ejes = Ejes;
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
