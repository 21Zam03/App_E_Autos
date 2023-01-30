/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zam.logica;

import com.zam.conexion.ConexionDB;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AutoDB {
    
    public void save_car(Auto auto) {       
        try {          
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_insert_car(?,?,?,?,?,?)}");
            cl.setString(1, auto.getBrand());
            cl.setString(2, auto.getModel());
            cl.setString(3, auto.getEngine());
            cl.setString(4, auto.getColor());
            cl.setString(5, auto.getLicense_plate());
            cl.setString(6, auto.getCar_door());
            ResultSet rs = cl.executeQuery();
            if (rs != null) {
                JOptionPane.showMessageDialog(null, "Registro se realizo con exito!!");
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un error al intentar registrar!!");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        
    }
   
    public ArrayList<Auto> list_cars() {
        ArrayList<Auto> lista_auto = new ArrayList<>();
        Auto auto = null;
        try {
            
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_listar_autos()}");
            ResultSet rs = cl.executeQuery();
            while(rs.next()) {
                auto = new Auto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7));
                lista_auto.add(auto);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return lista_auto;
    }
    
    public boolean eliminar_auto(int id) {
        boolean error = false;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_eliminar_auto(?)}");
            cl.setInt(1, id);
            ResultSet rs = cl.executeQuery();
            if (rs != null) {
                error = false;
            } else {
                error = true;
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return error;
    }
    
    public Auto traer_auto(int id) {
        Auto auto = null;
        try {          
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_traer_auto(?)}"); 
            cl.setInt(1, id);
            ResultSet rs = cl.executeQuery();
            while(rs.next()) {
                auto = new Auto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), 
                        rs.getString(6), rs.getString(7));
            }   
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return auto;
    }
    
    public void editar_auto(int cod, String modelo, String marca, String motor, String color, String placa, String puertas) {
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_actualizar_auto(?,?,?,?,?,?,?)}");
            cl.setInt(1, cod);
            cl.setString(2, modelo);
            cl.setString(3, marca);
            cl.setString(4, motor);
            cl.setString(5, color);
            cl.setString(6, placa);
            cl.setString(7, puertas);
            ResultSet rs = cl.executeQuery();
            if (rs != null) {
                JOptionPane.showMessageDialog(null, "Se actualizaron los datos con exito!!");
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un error al momento de actualizar!!");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
