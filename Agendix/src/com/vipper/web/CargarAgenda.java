package com.vipper.web;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.vipper.modelo.Contacto;
import com.vipper.persistencia.AccessoBBDD;

/**
 * Application Lifecycle Listener implementation class CargarAgenda
 *
 */
@WebListener
public class CargarAgenda implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public CargarAgenda() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	AccessoBBDD ab1= new AccessoBBDD();
    	List<Contacto> c1=null;
    	try {
			c1=ab1.obtenerTodos();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	HttpSession sesion = se.getSession();
    	sesion.setAttribute("agenda", c1);
    	System.out.println("La agenda es-->"+c1);
    			
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }
	
}
