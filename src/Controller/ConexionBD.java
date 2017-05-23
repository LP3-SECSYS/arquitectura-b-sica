/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author LAB05
 */
public class ConexionBD {

String driver = "org.postgresql.Driver";
String connectString = "jdbc:postgresql://localhost:5432/test01";
String user = "postgres";
String password = "123456";
static Connection con;
static Statement stmt;
public ConexionBD(){
        try{
            Class.forName(driver);
             con = DriverManager.getConnection(connectString, user , password);
             stmt = con.createStatement();    

        }

        catch ( Exception e ){
            System.out.println(e.getMessage());
        }
}
    
}
