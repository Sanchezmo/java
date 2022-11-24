package com.vipper.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vipper.modelo.Contacto;

public class AccessoBBDD extends conexion {

	public int altaContacto (Contacto c) throws ClassNotFoundException, SQLException {
        //1.Abrir conexion
        abrirConexion();
        //2.Declaramos las variables
        int numRegistros;
        Statement comando;
        String sql = "Insert into contactos"
                + "(id, nombre,email,telefono) values ( "
                + "'" + c.getId() + "', "
                + "'" + c.getNombre()+ "', "
                + "'" + c.getEmail() + "', "
                + "'" + c.getTelefono()+ "'"
                + ");";
  
        //Obtener el comando
        comando = miConexion.createStatement();
        numRegistros = comando.executeUpdate(sql);
        //cerrar la conexion
        cerrarConexion();
        return numRegistros;

    }
	
	 public int bajaContacto (int id) throws ClassNotFoundException, SQLException {
//	     Abrir la conexion
	        abrirConexion();
//	    Declarar las variables
	        String sql = "DELETE from contactos "
	                + " WHERE id = " + id;
	        Statement comando;
	        int numRegistros;
//	     Obtener el comando
	        comando = miConexion.createStatement();
//	     Ejecutar el comando
	        numRegistros = comando.executeUpdate(sql);
//	     Cerrar la conexion
	        cerrarConexion();
	        return numRegistros;

	    }
	 
	    public int modificarContacto (Contacto c) throws ClassNotFoundException, SQLException {
//	      Abrir la conexion
	         abrirConexion();
//	     Declarar las variables
	         String sql = "Update contactos "
	                 + "set email = "
	                 + "'" + c.getEmail() + "'"
	                 + " where id = " + c.getId();
	         Statement comando;
	         int numRegistros;

//	      Obtener el comando
	         comando = miConexion.createStatement();
//	      Ejecutar el comando
	         numRegistros = comando.executeUpdate(sql);
//	      Cerrar la conexion
	         cerrarConexion();
	         return numRegistros;

	     }
	    public List<Contacto> obtenerTodos() throws ClassNotFoundException, SQLException {

	        //1.Abrir conexion
	        abrirConexion();
	        //2.Definir las variables que se necesitan
	        String sql = "Select id,nombre,email,telefono from contactos;";

	        List<Contacto> c1 = new ArrayList();
	        Statement comando;
	        ResultSet rejilla;
	        //3.Obtener un comando
	        comando = miConexion.createStatement();//como hacer click en nueva consulta en sql se prepara para recibir sentencias de sql
	        //4.Ejecutal la consulta
	        rejilla = comando.executeQuery(sql);//escribes el String 
	        //5.Obtener los datos del ResultSet
	        while (rejilla.next()) {
	            Contacto c = new Contacto(rejilla.getInt("id"), rejilla.getString("nombre"), rejilla.getString("email"),rejilla.getString("telefono"));
	            c1.add(c);
	        }
	        //6.Cerrar la conexion
	        cerrarConexion();
	        //7.Devolver el List
	        return c1;

	    }
	
}
