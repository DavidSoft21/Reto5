/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.dao.RequerimientoDao_1;
import modelo.dao.RequerimientoDao_2;
import modelo.dao.RequerimientoDao_3;
import modelo.vo.Requerimiento_1;
import modelo.vo.Requerimiento_2;
import modelo.vo.Requerimiento_3;

/**
 *
 * @author david
 */
public class ControllerRequerimientos {
    
    private final RequerimientoDao_1 requerimientoDao_1 = new RequerimientoDao_1();
    private final RequerimientoDao_2 requerimientoDao_2 = new RequerimientoDao_2();
    private final RequerimientoDao_3 requerimientoDao_3 = new RequerimientoDao_3();
    
    
    public ArrayList<Requerimiento_1> consultaRequerimiento_1() throws SQLException{
        
        return this.requerimientoDao_1.requerimiento1();
        
    }
    
    public ArrayList<Requerimiento_2> consultaRequerimiento_2() throws SQLException{
        
        return this.requerimientoDao_2.requerimiento2();
        
    }
    
    public ArrayList<Requerimiento_3> consultaRequerimiento_3() throws SQLException{
        
        return this.requerimientoDao_3.requerimiento3();
        
    }
    
    
}
