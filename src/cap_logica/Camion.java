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
public class Camion extends Vehiculo{
    //private String placa;
    private MarcaCamion marca;
    private float cargaMax;
    //private int añoFabricacion; 
    private float altura;
    private float largo;

    public Camion() {
        super();
        this.marca = null;
        this.cargaMax = 0;
        this.altura = 0;
        this.largo = 0;
    }

    public Camion(String placa, int añoFabricacion, MarcaCamion marca, float cargaMax, float altura, float largo) {
        super(placa, añoFabricacion);
        this.marca = marca;
        this.cargaMax = cargaMax;
        this.altura = altura;
        this.largo = largo;
    }

    public MarcaCamion getMarca() {
        return marca;
    }

    public void setMarca(MarcaCamion marca) {
        this.marca = marca;
    }

    public double getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(float cargaMax) {
        this.cargaMax = cargaMax;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    @Override
    public String presentarLineal() {
        return getPlaca() + "\t" + marca.name() + "\t" + cargaMax + "\t" + getAñoFabricacion() + "\t" + altura + "\t" + largo;
    }

    @Override
    public String presentarDetalle() {
        return "Placa: " + getPlaca() + 
                "\nMarca: " + marca.name() + 
                "\nCarga maxima: " + cargaMax +
                "\nAño de fabricacion:" + getAñoFabricacion() + 
                "\nAltura: " + altura + 
                "\nLargo: " + largo + "\n";
    }
    
}
