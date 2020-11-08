package pe.orozco.app.dto;

public class CorreoDto {
	
	
	private String remitente;
	private String receptor;
	private String contrase�a;
	
	public CorreoDto() {

	}

	public CorreoDto(String remitente, String receptor, String contrase�a) {
		super();
		this.remitente = remitente;
		this.receptor = receptor;
		this.setContrase�a(contrase�a);
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	
}
