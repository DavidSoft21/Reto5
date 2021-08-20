/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.vo.Requerimiento_3;
import util.JDBCUtilities;

/**
 *
 * @author david
 */
public class RequerimientoDao_3 {
    
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException{
        ArrayList<Requerimiento_3> respuesta = new ArrayList<>();
        Connection conexion = JDBCUtilities.getConnection();
        
        try {
            String consulta = "SELECT SUBSTR(Lider.Nombre,1,3)  || "
                    + "SUBSTR(Lider.Primer_Apellido,1,3) || "
                    + "SUBSTR(Lider.Segundo_Apellido,1,3) 'Abrev' "
                    + "FROM Lider";
            
            PreparedStatement Statement = conexion.prepareStatement(consulta);
            ResultSet resultset = Statement.executeQuery();
            
            while(resultset.next()){
                
                Requerimiento_3 requerimiento_3 = new Requerimiento_3(); 
                requerimiento_3.setAbre(resultset.getString("Abrev"));
                respuesta.add(requerimiento_3);
                
            }
            
            resultset.close();
            Statement.close();
            
        } catch (SQLException e) {
            System.err.println("Error de consulta SQL Requerimiento 3 -> "+e);
        }finally{
            if(conexion != null){
                conexion.close();
            }
        }
        
        
        return respuesta;
    }
    
}
