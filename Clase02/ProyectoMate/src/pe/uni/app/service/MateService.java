package pe.uni.app.service;

public class MateService {
	
	public long factorial( int n ){
		long fact = 1;
		for(int i = 2; i <= n; i++){
			fact *= i;
		}
		return fact;
	}
	public int promedio(int n1, int n2, int n3, int n4){
		int pr = (n1 + n2 + n3 + n4) / 4;
		return pr;
	}

}
