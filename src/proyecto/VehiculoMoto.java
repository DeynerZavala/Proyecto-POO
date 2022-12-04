/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author USUARIO
 */
public class VehiculoMoto extends VehiculoDeTransporte{
    private int NCascos;

    public VehiculoMoto(int NCascos, String color, String CodigoPlaca, String Marca, String AñodeFabricacion, String Transmicion, String Combustible, int PrecioDeAlquilerxdia, String Seguro, int Precio, String Modelo) {
        super(color, CodigoPlaca, Marca, AñodeFabricacion, Transmicion, Combustible, PrecioDeAlquilerxdia, Seguro, Precio, Modelo);
        this.NCascos = NCascos;
    }

    public int getNCascos() {
        return NCascos;
    }

    public void setNCascos(int NCascos) {
        this.NCascos = NCascos;
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
