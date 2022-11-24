package model;
import java.sql.*;
import java.util.ArrayList;
public class Conexion {

	Connection con;
	Statement state;
	public Conexion()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/prueba2","root","");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public int insertar(Persona p) {
		String sql="Insert into alumno(Nombre,Apellidos) values ('"+p.getNombre()+"','"+p.getApellido()+"');";
		int a=0;
		try {
			this.state=this.con.createStatement();
			a=this.state.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return a;
	}
	
	public int borrar(Persona p) {
		int a=0;
		String sql = "Delete FROM alumno WHERE ID='"+p.getId()+"';";
		try {
			this.state=this.con.createStatement();
			a=this.state.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return a;
	}
	public int actualizar(Persona p) {
		int a=0;
		String sql = "UPDATE alumno SET  Nombre='"+p.getNombre()+"', Apellidos='"+p.getApellido()+"' WHERE ID='"+p.getId()+"';";
		try {
			this.state=this.con.createStatement();
			a =this.state.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;

}
	public Persona comprobar(int id) {
		String sql="Select * from alumno where ID="+id+";";
		Persona p = new Persona();
		try {
			this.state=this.con.createStatement();
			ResultSet rs=this.state.executeQuery(sql);
			rs.next();
			p.setId(rs.getInt(1));
			p.setNombre(rs.getString(2));
			p.setApellido(rs.getString(3));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	
	
	public ArrayList<Persona> seleccionar() {
		ArrayList<Persona> resultado = new ArrayList<Persona>();
		String sql="Select * from alumno;";
		try {
			this.state=this.con.createStatement();
			ResultSet rs=this.state.executeQuery(sql);
			
			
			while (rs.next()) {
				Persona per = new Persona();			
				per.setId(rs.getInt(1));
				per.setNombre(rs.getString(2));
				per.setApellido(rs.getString(3));
				resultado.add(per);		
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return resultado;
	}
}
