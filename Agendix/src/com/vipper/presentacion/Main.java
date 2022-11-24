package com.vipper.presentacion;

import java.sql.SQLException;

import com.vipper.modelo.Contacto;
import com.vipper.persistencia.AccessoBBDD;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessoBBDD ab1 = new AccessoBBDD();
		Contacto c1 = new Contacto(3, "Manuel", "vacio@vacio.com", "544785569");
		try {
			ab1.altaContacto(c1);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.toString();
		}

		try {
			ab1.bajaContacto(2);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Contacto c2=new Contacto(3,"lleno@lleno.com");
		try {
			ab1.modificarContacto(c2);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(ab1.obtenerTodos());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
