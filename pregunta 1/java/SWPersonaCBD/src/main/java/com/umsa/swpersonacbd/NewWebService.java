/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umsa.swpersonacbd;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Persona;


/**
 *
 * @author Oriana
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "PostgreSQL")
    public List<Persona> PostgreSQL() {
        List<Persona> list = new ArrayList<Persona>();
        try {
            String url = "jdbc:postgresql://localhost:5432/persona";
            String user = "postgres";
            String pass = "root";
            
            Connection conexion = DriverManager.getConnection(url, user, pass);
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM persona");
            stmt = conexion.createStatement();
            rs = stmt.executeQuery("select * from persona;");
            
            Persona p;
            while (rs.next()) {
                p = new Persona();
                int idPersona = rs.getInt("idPersona");
                String nombre = rs.getString("nombre");
                p.setIdPersona(idPersona);
                p.setNombre(nombre);
                list.add(p);
            }
            conexion.close();
            return list;
            
        } catch (SQLException ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        //return "hola daniel";
    }
    @WebMethod(operationName = "PersonaList")
    public List<Persona> Persona() {
        List<Persona> list = new ArrayList<Persona>();
        list = new ArrayList<Persona>();
        
        Persona p = new Persona();
        p.setIdPersona(1);
        p.setNombre("jose luis 1");
        list.add(p);
        
        p = new Persona();
        p.setIdPersona(2);
        p.setNombre("jose luis 2");
        list.add(p);
        
        p = new Persona();
        p.setIdPersona(3);
        p.setNombre("jose luis 3");
        list.add(p);
        
        
        return list;
    }
    
    @WebMethod(operationName = "PostgreSQLOK")
    public List<Persona> conexion(){
        List<Persona> list = new ArrayList<Persona>();
        Persona p = new Persona();
        try {
            String url = "jdbc:postgresql://localhost:5432/persona";
            String user = "postgres";
            String pass = "root";
            
            Connection conexion = DriverManager.getConnection(url, user, pass);
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM persona");
            while (rs.next()) {
                int id = rs.getInt("idPersona");
                String name = rs.getString("nombre");
                System.out.println(id + "   " + name);
                
                p = new Persona();
                p.setIdPersona(id);
                p.setNombre(name);
                list.add(p);
            }
            
            if(conexion != null)
                System.out.println("conecatado");
            return list;
        } catch (SQLException ex) {
            System.out.println("no conectado");
            System.out.println(ex.getMessage());
        }
        return list;
    }
    
    @WebMethod(operationName = "conexionPostgreSQL")
    public List<Persona> conexionPostgreSQL(){
        String resp = "";
        List<Persona> list = new ArrayList<Persona>();
        Persona p = new Persona();
        try {
            String url = "jdbc:postgresql://localhost:5432/persona";
            String user = "postgres";
            String pass = "root";
            
            Class.forName("org.postgresql.Driver");
            
            Connection conexion = DriverManager.getConnection(url, user, pass);
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM persona");
            while (rs.next()) {
                int id = rs.getInt("idPersona");
                String name = rs.getString("nombre");
                p = new Persona();
                p.setIdPersona(id);
                p.setNombre(name);
                list.add(p);
                System.out.println(id + "   " + name);
            }
            
            if(conexion != null){
                System.out.println("conectado");
                resp = "conectado "+ list.size();
            }
        } catch (SQLException ex) {
            System.out.println("no conectado");
            System.out.println(ex.getMessage());
            resp = "no conectado";
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
            resp = "Error al registrar el driver de PostgreSQL:";
        }
        if(list.size() == 0){
            p = new Persona();
            p.setIdPersona(1);
            p.setNombre("jose luis 1");
            list.add(p);
        }
        return list;
    }
}
