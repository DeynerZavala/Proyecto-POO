package proyecto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class VehiculoBus extends VehiculoDeTransporte{
    private int NroAsientos;
    private boolean AireAcondicionado;
    private boolean banio;

    public VehiculoBus(int NroAsientos, boolean AireAcondicionado, boolean banio, String color, String CodigoPlaca, String Marca, String AñodeFabricacion, String Transmicion, String Combustible, int PrecioDeAlquilerxdia, String Seguro, int Precio, String Modelo) {
        super(color, CodigoPlaca, Marca, AñodeFabricacion, Transmicion, Combustible, PrecioDeAlquilerxdia, Seguro, Precio, Modelo);
        this.NroAsientos = NroAsientos;
        this.AireAcondicionado = AireAcondicionado;
        this.banio = banio;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getCodigoPlaca() {
        return CodigoPlaca;
    }

    @Override
    public void setCodigoPlaca(String CodigoPlaca) {
        this.CodigoPlaca = CodigoPlaca;
    }

    @Override
    public String getMarca() {
        return Marca;
    }

    @Override
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public String getAñodeFabricacion() {
        return AñodeFabricacion;
    }

    @Override
    public void setAñodeFabricacion(String AñodeFabricacion) {
        this.AñodeFabricacion = AñodeFabricacion;
    }

    @Override
    public String getTransmicion() {
        return Transmicion;
    }

    @Override
    public void setTransmicion(String Transmicion) {
        this.Transmicion = Transmicion;
    }

    @Override
    public String getCombustible() {
        return Combustible;
    }

    @Override
    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }

    @Override
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

 

    public int getNroAsientos() {
        return NroAsientos;
    }

    public void setNroAsientos(int NroAsientos) {
        this.NroAsientos = NroAsientos;
    }

    public boolean isAireAcondicionado() {
        return AireAcondicionado;
    }

    public void setAireAcondicionado(boolean AireAcondicionado) {
        this.AireAcondicionado = AireAcondicionado;
    }

    public boolean isBanio() {
        return banio;
    }

    public void setBanio(boolean banio) {
        this.banio = banio;
    }
    
}
