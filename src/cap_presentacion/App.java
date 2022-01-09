/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_presentacion;

import basicas.Consola;
import cap_datos.ListaVehiculos;
import cap_logica.Auto;
import cap_logica.Camion;
import cap_logica.MarcaAuto;
import cap_logica.MarcaCamion;
import cap_logica.TipoCombustible;
import cap_logica.Vehiculo;
import java.util.ArrayList;
import java.util.Iterator;
import menu.Menu;
import menu.Opcion;

/**
 *
 * @author Rojas Vera Aaron
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Consola objConsola = new Consola();
        Menu objMenu = new Menu();
        
        int opcion;
        
        defineMenu(objMenu);
        
        do{
            opcion = objMenu.display();
            
            switch(opcion){
                case 11:
                        Auto objA = new Auto();
                        
                        objA.setPlaca(objConsola.leer("Ingrese placa : "));
                            int opcMarcaA;
                            MarcaAuto marcaA = null;
                            
                            System.out.println("[1] " + MarcaAuto.FORD.name());
                            System.out.println("[2] " + MarcaAuto.TOYOTA.name());
                            System.out.println("[3] " + MarcaAuto.NISSAN.name());
                            System.out.println("[4] " + MarcaAuto.KIA.name());
                            System.out.println("[5] " + MarcaAuto.HYUNDAI.name());
                            
                            opcMarcaA = objConsola.leer("Ingrese marca[1-5] : ", 1, 5);
                            
                            switch(opcMarcaA){
                                case 1: marcaA = MarcaAuto.FORD; break;
                                case 2: marcaA = MarcaAuto.TOYOTA; break;
                                case 3: marcaA = MarcaAuto.NISSAN; break;
                                case 4: marcaA = MarcaAuto.KIA; break;
                                case 5: marcaA = MarcaAuto.HYUNDAI; break;
                            }
                        objA.setMarca(marcaA);
                        objA.setAñoFabricacion(objConsola.leer("Ingrese año de fabricacion[1900-2019] : ", 1900, 2019));
                            int opcCombustible;
                            TipoCombustible combustible = null;
                            
                            System.out.println("[1] " + TipoCombustible.GAS.name());
                            System.out.println("[2] " + TipoCombustible.GASOLINA.name());
                            
                            opcCombustible = objConsola.leer("Ingrese combustible[1-2] : ", 1, 2);
                            
                            switch(opcCombustible){
                                case 1: combustible = TipoCombustible.GAS; break;
                                case 2: combustible = TipoCombustible.GASOLINA; break;
                            }
                        objA.setCombustible(combustible);
                        
                        ListaVehiculos.agregar(objA);
                        
                        System.out.println("\n\t* Auto registrado");
                    break;
                case 12:
                        Camion objC = new Camion();
                        
                        objC.setPlaca(objConsola.leer("Ingrese placa : "));
                            int opcMarcaC;
                            MarcaCamion marcaC = null;
                            
                            System.out.println("[1] " + MarcaCamion.HINO.name());
                            System.out.println("[2] " + MarcaCamion.ISUZU.name());
                            System.out.println("[3] " + MarcaCamion.VOLVO.name());
                            System.out.println("[4] " + MarcaCamion.JAC.name());
                            
                            opcMarcaC = objConsola.leer("Ingrese marca[1-4] : ", 1, 4);
                            
                            switch(opcMarcaC){
                                case 1: marcaC = MarcaCamion.HINO; break;
                                case 2: marcaC = MarcaCamion.ISUZU; break;
                                case 3: marcaC = MarcaCamion.VOLVO; break;
                                case 4: marcaC = MarcaCamion.JAC; break;
                            }
                        objC.setMarca(marcaC);
                        objC.setCargaMax(objConsola.leer("Ingrese carga maxima[1-100](toneladas) : ", 1, 100));
                        objC.setAñoFabricacion(objConsola.leer("Ingrese año de fabricacion[1900-2019] : ", 1900, 2019));
                        objC.setAltura(objConsola.leer("Ingrese altura[2-4.5](metros): ", 2.0f, 4.5f));
                        objC.setLargo(objConsola.leer("Ingrese largo[1-50](metros): ", 1, 50));
                        
                        ListaVehiculos.agregar(objC);
                        
                        System.out.println("\n\t* Camion registrado");
                    break;
                    
                case 21:
                        Auto objAux1;
                        String auxPlaca1;
                        int opc1;
                        
                        auxPlaca1 = objConsola.leer("Ingrese placa a buscar : ");
                        objAux1 = ListaVehiculos.buscarAuto(auxPlaca1);
                        
                        if(objAux1 != null){
                            System.out.println("[1] Placa");
                            System.out.println("[2] Marca");
                            System.out.println("[3] Año de fabricacion");
                            System.out.println("[4] Combustible");
                            System.out.println("[5] Cancelar");

                            opc1 = objConsola.leer("Ingrese opcion a editar : ", 1, 5);

                            switch(opc1){
                                case 1: 
                                        objAux1.setPlaca(objConsola.leer("Ingrese placa : "));
                                    break;
                                case 2:
                                            int opcAux;
                                            MarcaAuto marcaAux = null;

                                            System.out.println("[1] " + MarcaAuto.FORD.name());
                                            System.out.println("[2] " + MarcaAuto.TOYOTA.name());
                                            System.out.println("[3] " + MarcaAuto.NISSAN.name());
                                            System.out.println("[4] " + MarcaAuto.KIA.name());
                                            System.out.println("[5] " + MarcaAuto.HYUNDAI.name());

                                            opcAux = objConsola.leer("Ingrese marca[1-5] : ", 1, 5);

                                            switch(opcAux){
                                                case 1: marcaAux = MarcaAuto.FORD; break;
                                                case 2: marcaAux = MarcaAuto.TOYOTA; break;
                                                case 3: marcaAux = MarcaAuto.NISSAN; break;
                                                case 4: marcaAux = MarcaAuto.KIA; break;
                                                case 5: marcaAux = MarcaAuto.HYUNDAI; break;
                                            }
                                        objAux1.setMarca(marcaAux);
                                    break;
                                case 3:
                                        objAux1.setAñoFabricacion(objConsola.leer("Ingrese año de fabricacion[1900-2019] : ", 1900, 2019));
                                    break;
                                case 4:
                                            int opcAux1;
                                            TipoCombustible combustibleAux = null;

                                            System.out.println("[1] " + TipoCombustible.GAS.name());
                                            System.out.println("[2] " + TipoCombustible.GASOLINA.name());

                                            opcAux1 = objConsola.leer("Ingrese combustible[1-2] : ", 1, 2);

                                            switch(opcAux1){
                                                case 1: combustibleAux = TipoCombustible.GAS; break;
                                                case 2: combustibleAux = TipoCombustible.GASOLINA; break;
                                            }
                                        objAux1.setCombustible(combustibleAux);
                                    break;
                            }
                        }else{
                            System.out.println("\n\t* Auto no encontrado");
                        }
                    break;
                case 22:
                        Camion objAux2;
                        String auxPlaca2;
                        int opc2;
                        
                        auxPlaca2 = objConsola.leer("Ingrese placa a buscar : ");
                        objAux2 = ListaVehiculos.buscarCamion(auxPlaca2);
                        
                        if(objAux2 != null){
                            System.out.println("[1] Placa");
                            System.out.println("[2] Marca");
                            System.out.println("[3] Carga Maxima");
                            System.out.println("[4] Año de fabricacion");
                            System.out.println("[5] Altura");
                            System.out.println("[6] Largo");
                            System.out.println("[7] Cancelar");

                            opc2 = objConsola.leer("Ingrese opcion a editar : ", 1, 7);

                            switch(opc2){
                                case 1:
                                        objAux2.setPlaca(objConsola.leer("Ingrese placa : "));
                                    break;
                                case 2:
                                            int opc3;
                                            MarcaCamion auxC = null;

                                            System.out.println("[1] " + MarcaCamion.HINO.name());
                                            System.out.println("[2] " + MarcaCamion.ISUZU.name());
                                            System.out.println("[3] " + MarcaCamion.VOLVO.name());
                                            System.out.println("[4] " + MarcaCamion.JAC.name());

                                            opc3 = objConsola.leer("Ingrese marca[1-4] : ", 1, 4);

                                            switch(opc3){
                                                case 1: auxC = MarcaCamion.HINO; break;
                                                case 2: auxC = MarcaCamion.ISUZU; break;
                                                case 3: auxC = MarcaCamion.VOLVO; break;
                                                case 4: auxC = MarcaCamion.JAC; break;
                                            }
                                        objAux2.setMarca(auxC);
                                    break;
                                case 3:
                                        objAux2.setCargaMax(objConsola.leer("Ingrese carga maxima[1-100](toneladas): ", 1, 100));
                                    break;
                                case 4:
                                        objAux2.setAñoFabricacion(objConsola.leer("Ingrese año de fabricacion[1900-2019] : ", 1900, 2019));
                                    break;
                                case 5:
                                        objAux2.setAltura(objConsola.leer("Ingrese altura[2.0-4.5](metros) : ", 2.0f, 4.5f));
                                    break;
                                case 6:
                                        objAux2.setLargo(objConsola.leer("Ingrese largo[1-50](metros): ", 1, 50));
                                    break;
                            }
                        }else{
                            System.out.println("\n\t* Camion no encontrado");
                        }
                    break;
                    
                case 31:
                        int contadorA[] = ListaVehiculos.contadorAutosSegunMarca();                     
                        
                        System.out.println("CANTIDAD DE AUTOS SEGUN MARCA");
                        System.out.println(MarcaAuto.FORD.name() + ": " + contadorA[0]);
                        System.out.println(MarcaAuto.TOYOTA.name() + ": " + contadorA[1]);
                        System.out.println(MarcaAuto.NISSAN.name() + ": " + contadorA[2]);
                        System.out.println(MarcaAuto.KIA.name() + ": " + contadorA[3]);
                        System.out.println(MarcaAuto.HYUNDAI.name() + ": " + contadorA[4]);
                    break;
                case 32:
                        ArrayList<Camion> listaCamiones;
                        Iterator<Camion> itCamion;
                        
                        listaCamiones = ListaVehiculos.listaCamionesMenor35mts();
                        
                        System.out.println("LISTADO DE CAMIONES QUE NO SUPEREN 3.5MTS DE ALTURA");
                        
                        if(!listaCamiones.isEmpty()){
                            itCamion = listaCamiones.iterator();
                            while(itCamion.hasNext()){
                                Camion c = itCamion.next();
                                
                                System.out.println(c.presentarLineal());
                            }
                        }else{
                            System.out.println("\t* Lista vacia");
                        }
                    break;
                case 33:
                        ArrayList<Auto> listaAutos;
                        Iterator<Auto> itAuto;
                        
                        int opcionMarca;
                        MarcaAuto auxMarca = null;
                        
                        System.out.println("[1] " + MarcaAuto.FORD.name());
                        System.out.println("[2] " + MarcaAuto.TOYOTA.name());
                        System.out.println("[3] " + MarcaAuto.NISSAN.name());
                        System.out.println("[4] " + MarcaAuto.KIA.name());
                        System.out.println("[5] " + MarcaAuto.HYUNDAI.name());
                            
                        opcionMarca = objConsola.leer("Ingrese marca[1-5] : ", 1, 5);
                            
                        switch(opcionMarca){
                            case 1: auxMarca = MarcaAuto.FORD; break;
                            case 2: auxMarca = MarcaAuto.TOYOTA; break;
                            case 3: auxMarca = MarcaAuto.NISSAN; break;
                            case 4: auxMarca = MarcaAuto.KIA; break;
                            case 5: auxMarca = MarcaAuto.HYUNDAI; break;
                        }
                        
                        listaAutos = ListaVehiculos.listaAutosMarca(auxMarca);
                        
                        System.out.println("LISTADO DE AUTOS (" + auxMarca.name() + ")");
                        
                        if(!listaAutos.isEmpty()){
                            itAuto = listaAutos.iterator();
                            while(itAuto.hasNext()){
                                Auto a = itAuto.next();
                                
                                System.out.println(a.presentarLineal());
                            }
                        }else{
                            System.out.println("\t* Lista vacia");
                        }
                    break;
                case 34:
                        ArrayList<Camion> listaCamiones1;
                        Iterator<Camion> itCamion1;
                        
                        listaCamiones1 = ListaVehiculos.listaCamionesHynoVolvoMas8();
                        
                        System.out.println("LISTADO DE CAMIONES HYNO O VOLVO CON MAS DE 8 TONELADAS DE CARGA");
                        
                        if(!listaCamiones1.isEmpty()){
                            itCamion1 = listaCamiones1.iterator();
                            while(itCamion1.hasNext()){
                                Camion c = itCamion1.next();
                                
                                System.out.println(c.presentarLineal());
                            }
                        }else{
                            System.out.println("\t* Lista vacia");
                        }
                    break;
                case 35:
                        ArrayList<Vehiculo> lista;
                        Iterator<Vehiculo> it;
                        
                        lista = ListaVehiculos.listaVehiculosAñoSuperior2017();
                        
                        System.out.println("LISTADO DE VEHICULOS CON AÑO DE FABRICAION SUPERIOR A 2017");
                        
                        if(!lista.isEmpty()){
                            it = lista.iterator();
                            while(it.hasNext()){
                                Vehiculo v = it.next();
                                
                                System.out.println(v.presentarLineal());
                            }
                        }else{
                            System.out.println("\t* Lista vacia");
                        }
                    break;
            }
        }while(opcion != 99);
    }
    
    public static void defineMenu(Menu objMenu){
        objMenu.agregar(new Opcion(11,"Agregar Auto"));
        objMenu.agregar(new Opcion(12,"Agregar Camion"));
        
        objMenu.agregar(new Opcion(21,"Modificar Auto"));
        objMenu.agregar(new Opcion(22,"Modificar Camion"));
        
        objMenu.agregar(new Opcion(31,"Mostrar la cantidad de autos según marca"));
        objMenu.agregar(new Opcion(32,"Listado de camiones que no supere el 3.5 mts de altura"));
        objMenu.agregar(new Opcion(33,"Listado de autos de una marca específica"));
        objMenu.agregar(new Opcion(34,"Listado de camiones HINO o VOLVO con más de 8 toneladas de carga"));
        objMenu.agregar(new Opcion(35,"Listado de vehículos cuyo año de fabricación sea superior al año 2017"));
        
        objMenu.agregar(new Opcion(99,"Salir"));
    }
    
}
