import java.sql.*;
import java.util.Properties;

public class StatementPosgres {

	public static void main(String[] args) {
		
		
		//conexion
		//String url = "jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true";
		//Connection conn = DriverManager.getConnection(url);
		try {
			String url = "jdbc:postgresql://localhost:5437/postgres";
			Properties props = new Properties();
			props.setProperty("user", "postgres");
			props.setProperty("password", "my-secret-pw");
			props.setProperty("ssl", "false");
			
			Connection conexion = DriverManager.getConnection(url, props);
			//metadatos
			DatabaseMetaData metadatos = conexion.getMetaData();
			ResultSet metadatadb=metadatos.getCatalogs();
			System.out.println("metadatos de la basedatos");
			while(metadatadb.next()) {
				String bdata = metadatadb.getString("TABLE_CAT");
				System.out.println(bdata);
			}
			
			//control de transacciones
			conexion.setAutoCommit(false);
			
			//creamos statement obj
			
			Statement consulta =conexion.createStatement();
			
			
			
			//INsert
			
			String queryInsert="INSERT INTO categories(category_id,category_name,description)"+"VALUES(9,'juguetes', 'articulos de juguete')";
			int queryEffect= consulta.executeUpdate(queryInsert);
			if(queryEffect == 0) {
					conexion.rollback();
			}
						
			//Update
			String queryUpdate="UPDATE categories SET description='filetes ricos' WHERE category_id='6'";
			int queryAffect=consulta.executeUpdate(queryUpdate);
			
			if(queryAffect == 0) {
				conexion.rollback();
			}
			
			//Delete
			//String queryDelete="DELETE FROM categories WHERE category_id='6'";
			//consulta.executeUpdate(queryDelete);
			
            //resultados
			String query = "SELECT * FROM categories";
			ResultSet resultados = consulta.executeQuery(query);
			
			while(resultados.next()) {
				int id =resultados.getInt("category_id");
				String nombre =resultados.getString("category_name");
				String descripcion=resultados.getString("description");
				
				System.out.println("categoria: "+nombre+" id: "+id+" descripcion: "+descripcion);
			}
			//cierre conexion
			if(conexion !=null) {
				conexion.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
