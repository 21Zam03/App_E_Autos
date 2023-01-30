/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zam.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {
    
    public static Connection getConexion() {
        
        Connection cn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/app_e_autos_db", "root", "josesamuel");
        } catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
        } 
        return cn;
    }
    
    public static void main(String[] args) {
        ConexionDB.getConexion();
    }
}
