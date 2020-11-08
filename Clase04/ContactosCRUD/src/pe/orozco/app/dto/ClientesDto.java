package pe.orozco.app.dto;

public class ClientesDto {
	private int id;
	private String nombre;
	private String correo;

	public ClientesDto() {

	}

	public ClientesDto(int id, String nombre, String correo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
