package persistanceJPA;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries({
	@NamedQuery(name="Alumno.consultarTodo",query="SELECT a FROM Alumno a")
})
public class Alumno implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellido;
	@Id
	@GeneratedValue
	private int id;
	public Alumno () {
	}
	public Alumno(String nombre,String apellido,int id) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.id=id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getId() {
		return id;
	}
	/*public void setId(int id) {
		this.id = id;
	}
	*/

}
