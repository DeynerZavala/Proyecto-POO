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

    public VehiculoDeTransporte(String color, String CodigoPlaca, String Marca, String AñodeFabricacion, String Transmicion, String Combustible, int PrecioDeAlquilerxdia, String Seguro, int Precio, String Modelo) {
        super(CodigoPlaca, Marca, AñodeFabricacion, Transmicion, Combustible, PrecioDeAlquilerxdia, Seguro, Precio, Modelo);
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

    @Override
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
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
    
}
