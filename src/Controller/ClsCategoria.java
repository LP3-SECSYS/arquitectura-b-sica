/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.ConexionBD.con;
import static Controller.ConexionBD.stmt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Modell.Categoria;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ClsCategoria {
    ResultSet rs;
    ConexionBD cx;
    public ClsCategoria(){
        cx = new ConexionBD();
    }
    public ArrayList lista (){
        try {
            ArrayList lista = new ArrayList();
            rs = stmt.executeQuery("SELECT * FROM categoria");
            
            while (rs.next()){
                lista.add(new Categoria(rs.getString("id_categoria"),rs.getString("name")));
            }
            stmt.close();
            con.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ClsCategoria.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    } 
}
