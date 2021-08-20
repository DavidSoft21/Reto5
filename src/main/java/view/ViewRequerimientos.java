/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerRequerimientos;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.vo.Requerimiento_1;
import modelo.vo.Requerimiento_2;
import modelo.vo.Requerimiento_3;

/**
 *
 * @author david
 */
public class ViewRequerimientos {
    
    public static final ControllerRequerimientos controlador = new ControllerRequerimientos();
    
    public static void requerimiento1(){
        
        try {
            ArrayList<Requerimiento_1> listaRequerimiento_1;
            listaRequerimiento_1 = controlador.consultaRequerimiento_1();
            
            for(Requerimiento_1 requerimiento_1: listaRequerimiento_1){
                System.out.println(
                        requerimiento_1.getFechaCompra()+" "+
                        requerimiento_1.getCodCompra()+" "+
                        requerimiento_1.getNombreProveedor()+" "+
                        requerimiento_1.getPagado()
                );
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public static void requerimiento2(){
        
        try {
            ArrayList<Requerimiento_2> listaRequerimiento_2;
            listaRequerimiento_2 = controlador.consultaRequerimiento_2();
            
            for(Requerimiento_2 requerimiento_2: listaRequerimiento_2){
                System.out.println(
                        requerimiento_2.getFechaIni()+" "+
                        requerimiento_2.getNombreCiudad()+" "+
                        requerimiento_2.getConstructora()+" "+
                        requerimiento_2.getNombrelider()+" "+
                        requerimiento_2.getCodigoTipo()+" "+
                        requerimiento_2.getEstrato()
                );
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }
    
    
    public static void requerimiento3(){
        
        try {
            ArrayList<Requerimiento_3> listaRequerimiento_3;
            listaRequerimiento_3 = controlador.consultaRequerimiento_3();
            
            for(Requerimiento_3 requerimiento_3: listaRequerimiento_3){
                System.out.println(
                        
                        requerimiento_3.getAbre()
                        
                );
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }
    
}
