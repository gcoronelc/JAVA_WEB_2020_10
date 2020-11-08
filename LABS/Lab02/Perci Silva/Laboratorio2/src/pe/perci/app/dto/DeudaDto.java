package pe.perci.app.dto;

public class DeudaDto {
private String apeP;
private String apeM;
private String nombre;
private String dni;
private String cal;




public DeudaDto() {
	super();
}
public DeudaDto(String apeP, String apeM, String nombre, String dni, String cal) {
	super();
	this.apeP = apeP;
	this.apeM = apeM;
	this.nombre = nombre;
	this.dni = dni;
	this.cal = cal;
}
public String getApeP() {
	return apeP;
}
public void setApeP(String apeP) {
	this.apeP = apeP;
}
public String getApeM() {
	return apeM;
}
public void setApeM(String apeM) {
	this.apeM = apeM;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getCal() {
	return cal;
}
public void setCal(String cal) {
	this.cal = cal;
}

}
