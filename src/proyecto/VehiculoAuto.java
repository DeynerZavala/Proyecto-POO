package proyecto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class VehiculoAuto extends VehiculoDeTransporte{
    private int NroAsientos;
    private String Categoria;

    public VehiculoAuto(int NroAsientos, String Categoria, String color, String CodigoPlaca, String Marca, String AñodeFabricacion, String Transmicion, String Combustible, int PrecioDeAlquilerxdia, String Seguro, int Precio, String Modelo) {
        super(color, CodigoPlaca, Marca, AñodeFabricacion, Transmicion, Combustible, PrecioDeAlquilerxdia, Seguro, Precio, Modelo);
        this.NroAsientos = NroAsientos;
        this.Categoria = Categoria;
    }
    
    @Override
    public void MostrarCaracteristicas(){
        
    }

    public int getNroAsientos() {
        return NroAsientos;
    }

    public void setNroAsientos(int NroAsientos) {
        this.NroAsientos = NroAsientos;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
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
