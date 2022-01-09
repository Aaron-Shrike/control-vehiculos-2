/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_logica;

/**
 *
 * @author Sh
 */
public class Auto extends Vehiculo{
    //private String placa;
    private MarcaAuto marca;
    //private int añoFabricacion;
    private TipoCombustible combustible;

    public Auto() {
        super();
        this.marca = null;
        this.combustible = null;
    }

    public Auto(String placa, int añoFabricacion, MarcaAuto marca, TipoCombustible combustible) {
        super(placa, añoFabricacion);
        this.marca = marca;
        this.combustible = combustible;
    }

    public MarcaAuto getMarca() {
        return marca;
    }

    public void setMarca(MarcaAuto marca) {
        this.marca = marca;
    }

    public TipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TipoCombustible combustible) {
        this.combustible = combustible;
    }

    @Override
    public String presentarLineal() {
        return getPlaca() + "\t" + marca.name() + "\t" + getAñoFabricacion() + "\t" + combustible.name();
    }

    @Override
    public String presentarDetalle() {
        return "Placa: " + getPlaca() + 
                "\nMarca: " + marca.name() + 
                "\nAño de fabricacion:" + getAñoFabricacion() + 
                "\nCombustible: " + combustible.name() + "\n";
    }
    
}
