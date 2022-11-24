package com.vipper.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
	   protected Connection miConexion;

	    public void abrirConexion() throws ClassNotFoundException, SQLException {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        String StringConexion = "jdbc:mysql://localhost:3306/agenda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false";
	        miConexion = DriverManager.getConnection(StringConexion, "root", "root");
	    }

	    public void cerrarConexion() throws SQLException {
	        miConexion.close();
	    }
}
