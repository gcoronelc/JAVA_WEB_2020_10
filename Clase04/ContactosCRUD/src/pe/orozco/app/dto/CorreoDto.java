package pe.orozco.app.dto;

public class CorreoDto {
	
	
	private String remitente;
	private String receptor;
	private String contraseña;
	
	public CorreoDto() {

	}

	public CorreoDto(String remitente, String receptor, String contraseña) {
		super();
		this.remitente = remitente;
		this.receptor = receptor;
		this.setContraseña(contraseña);
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getReceptor() {
		return receptor;
	}

	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
}
