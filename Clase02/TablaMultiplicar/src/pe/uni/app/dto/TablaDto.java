package pe.uni.app.dto;

public class TablaDto {

	private int num1;
	private int num2;
	private int prod;

	public TablaDto() {
	}

	public TablaDto(int num1, int num2, int prod) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.prod = prod;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getProd() {
		return prod;
	}

	public void setProd(int prod) {
		this.prod = prod;
	}

}
