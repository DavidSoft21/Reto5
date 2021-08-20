/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.misiontic2022.c2.reto005;

import java.sql.SQLException;
import view.*;

/**
 *
 * @author david
 */
public class App {
    
    public static void main(String[] args) throws SQLException{
        
        
        Gui vista = new Gui();
        vista.setVisible(true);
       
        
        
        System.out.println("-- Inicio --");
        
        System.out.println("Requerimiento 1");
        ViewRequerimientos.requerimiento1();
        
        System.out.println("Requerimiento 2");
        ViewRequerimientos.requerimiento2();
        
        System.out.println("Requerimiento 3");
        ViewRequerimientos.requerimiento3();
        
        System.out.println("-- Final. --");
    }
}
