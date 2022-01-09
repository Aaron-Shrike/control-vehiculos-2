/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_datos;

import cap_logica.Auto;
import cap_logica.Camion;
import cap_logica.MarcaAuto;
import cap_logica.MarcaCamion;
import cap_logica.Vehiculo;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sh
 */
public class ListaVehiculos {
    private static ArrayList<Vehiculo> datos = new ArrayList<>();
    
    public static void agregar(Vehiculo obj){
        datos.add(obj);
    }
    
    public static ArrayList<Vehiculo> obtener(){
        return datos;
    }
    
    public static Auto buscarAuto(String placa){
        Iterator<Vehiculo> it;
        
        it = datos.iterator();
        while(it.hasNext()){
            Vehiculo v = it.next();
            
            if(v instanceof Auto){
                if(v.getPlaca().equalsIgnoreCase(placa)){
                    return (Auto) v;
                }
            }
        }
        return null;
    } 
    
    public static Camion buscarCamion(String placa){
        Iterator<Vehiculo> it;
        
        it = datos.iterator();
        while(it.hasNext()){
            Vehiculo v = it.next();
            
            if(v instanceof Camion){
                if(v.getPlaca().equalsIgnoreCase(placa)){
                    return (Camion) v;
                }
            }
        }
        return null;
    } 
    
    public static int[] contadorAutosSegunMarca(){
        int contador[] = new int[5];
        Iterator<Vehiculo> it;
        
        it = datos.iterator();
        while(it.hasNext()){
            Vehiculo v = it.next();
            
            if(v instanceof Auto){
                if(((Auto) v).getMarca() == MarcaAuto.FORD){
                    contador[0]++;
                }
                if(((Auto) v).getMarca() == MarcaAuto.TOYOTA){
                    contador[1]++;
                }
                if(((Auto) v).getMarca() == MarcaAuto.NISSAN){
                    contador[2]++;
                }
                if(((Auto) v).getMarca() == MarcaAuto.KIA){
                    contador[3]++;
                }
                if(((Auto) v).getMarca() == MarcaAuto.HYUNDAI){
                    contador[4]++;
                }
            }
        }
        
        return contador;
    }
    
    public static ArrayList<Camion> listaCamionesMenor35mts(){
        ArrayList<Camion> lista = new ArrayList<>();
        Iterator<Vehiculo> it;
        
        it = datos.iterator();
        while(it.hasNext()){
            Vehiculo v = it.next();
            
            if(v instanceof Camion){
                if(((Camion) v).getAltura() < 3.5){
                    lista.add((Camion) v);
                }
            }
        }
        
        return lista;
    }
    
    public static ArrayList<Auto> listaAutosMarca(MarcaAuto marca){
        ArrayList<Auto> lista = new ArrayList<>();
        Iterator<Vehiculo> it;
        
        it = datos.iterator();
        while(it.hasNext()){
            Vehiculo v = it.next();
            
            if(v instanceof Auto){
                if(((Auto) v).getMarca() == marca){
                    lista.add((Auto) v);
                }
            }
        }
        
        return lista;
    }
    
    public static ArrayList<Camion> listaCamionesHynoVolvoMas8(){
        ArrayList<Camion> lista = new ArrayList<>();
        Iterator<Vehiculo> it;
        
        it = datos.iterator();
        while(it.hasNext()){
            Vehiculo v = it.next();
            
            if(v instanceof Camion){
                if(((Camion) v).getMarca() == MarcaCamion.HINO || ((Camion) v).getMarca() == MarcaCamion.VOLVO && ((Camion) v).getCargaMax() > 8){
                    lista.add((Camion) v);
                }
            }
        }
        
        return lista;
    }
    
    public static ArrayList<Vehiculo> listaVehiculosAñoSuperior2017(){
        ArrayList<Vehiculo> lista = new ArrayList<>();
        Iterator<Vehiculo> it;
        
        it = datos.iterator();
        while(it.hasNext()){
            Vehiculo v = it.next();
            
            if(v.getAñoFabricacion() > 2017){
               lista.add(v);
            }
            
        }
        
        return lista;
    }
}
