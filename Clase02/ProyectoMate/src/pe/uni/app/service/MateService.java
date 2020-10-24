package pe.uni.app.service;

public class MateService {
	
	public long factorial( int n ){
		long fact = 1;
		for(int i = 2; i <= n; i++){
			fact *= i;
		}
		return fact;
	}
	

}
