package pe.eureka.dto;

public class Mensaje {

	private int code;
	private String message;
	private String error;
	private String data;
	
	public Mensaje() {
	}

	public Mensaje(int code, String message, String error, String data) {
		super();
		this.code = code;
		this.message = message;
		this.error = error;
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
}
