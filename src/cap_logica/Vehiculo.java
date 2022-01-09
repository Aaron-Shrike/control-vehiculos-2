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
public abstract class Vehiculo implements Presentable{
    private String placa;
    private int añoFabricacion;

    public Vehiculo() {
        this.placa = "";
        this.añoFabricacion = 0;
    }
    
    public Vehiculo(String placa, int añoFabricacion) {
        this.placa = placa;
        this.añoFabricacion = añoFabricacion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
     
}
