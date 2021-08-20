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
import java.sql.Statement;
import java.util.ArrayList;
import modelo.vo.Requerimiento_2;
import util.JDBCUtilities;

/**
 *
 * @author david
 */
public class RequerimientoDao_2 {
    
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException{
        //Class.forName("org.sqlite.JDBC");
        Connection conexion = JDBCUtilities.getConnection();
        ArrayList<Requerimiento_2> respuesta = new ArrayList<>();
        
        try {
            String consulta = "SELECT P.Fecha_Inicio AS 'Fec Inicio',P.Constructora AS "
                    + "'Nombre Constructora', P.Ciudad AS 'Nombre Ciudad' ,"
                    + "Lider.Nombre || ' ' || Lider.Segundo_Apellido AS 'Nombre Lider',\n" +
                    "Tipo.Codigo_Tipo AS 'Cod. Tipo', Tipo.Estrato\n" +
                    "from Lider INNER JOIN Proyecto P\n" +
                    "ON Lider.ID_Lider = P.ID_Lider \n" +
                    "INNER JOIN Tipo\n" +
                    "on P.ID_Tipo = Tipo.ID_Tipo \n" +
                    "where P.Fecha_Inicio BETWEEN '2019-09-01' and '2019-09-09' AND "
                    + "P.Ciudad like 'Pereira'";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                Requerimiento_2 requerimiento_2 = new Requerimiento_2();
                
                requerimiento_2.setFechaIni(resultSet.getString("Fec Inicio"));
                requerimiento_2.setConstructora(resultSet.getString("Nombre Constructora"));
                requerimiento_2.setNombreCiudad(resultSet.getString("Nombre Ciudad"));
                requerimiento_2.setNombrelider(resultSet.getString("Nombre Lider"));
                requerimiento_2.setCodigoTipo(resultSet.getInt("Cod. Tipo"));
                requerimiento_2.setEstrato(resultSet.getInt("Estrato"));
                
                respuesta.add(requerimiento_2);
                
            }
            resultSet.close();
            statement.close();
            
            
            
        } catch (SQLException e) {
            
            System.err.println("Error de consulta SQL Requerimiento 2 -> "+e);
            
        }finally{
            if(conexion != null){
                conexion.close();
            }
        }
        
        
        return respuesta;
    }
    
}
