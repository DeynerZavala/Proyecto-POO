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
    protected float Dimensiones;
    protected float Toneladas;

    public VehiculoDeCarga(float CapacidadDeCarga, float Dimensiones, float Toneladas, String CodigoPlaca, String Marca, String AñodeFabricacion, String Transmicion, String Combustible, int PrecioDeAlquilerxdia, String Seguro, int Precio, String Modelo) {
        super(CodigoPlaca, Marca, AñodeFabricacion, Transmicion, Combustible, PrecioDeAlquilerxdia, Seguro, Precio, Modelo);
        this.CapacidadDeCarga = CapacidadDeCarga;
        this.Dimensiones = Dimensiones;
        this.Toneladas = Toneladas;
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

    public float getDimensiones() {
        return Dimensiones;
    }

    public void setDimensiones(float Dimensiones) {
        this.Dimensiones = Dimensiones;
    }

    public float getToneladas() {
        return Toneladas;
    }

    public void setToneladas(float Toneladas) {
        this.Toneladas = Toneladas;
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

    public String getAñodeFabricacion() {
        return AñodeFabricacion;
    }

    public void setAñodeFabricacion(String AñodeFabricacion) {
        this.AñodeFabricacion = AñodeFabricacion;
    }

    public String getTransmicion() {
        return Transmicion;
    }

    public void setTransmicion(String Transmicion) {
        this.Transmicion = Transmicion;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }

    public int getPrecioDeAlquilerxdia() {
        return PrecioDeAlquilerxdia;
    }

    public void setPrecioDeAlquilerxdia(int PrecioDeAlquilerxdia) {
        this.PrecioDeAlquilerxdia = PrecioDeAlquilerxdia;
    }

    public String getSeguro() {
        return Seguro;
    }

    public void setSeguro(String Seguro) {
        this.Seguro = Seguro;
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
