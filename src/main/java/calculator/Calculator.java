package calculator;

public class Calculator {
	
	public double multiply(double a, double b) {
		  return a * b;
	}

	public double add(double num1, double num2){
		return num1+num2;
	
	}

	public double sqrt(double num1) {

		double result = Math.sqrt(num1);

		return result;

	}
	public double subtract(double num1, double num2) {
		return num1-num2;
	}
	
	
	public double divide(double x,double y) {
		
		if (y == 0.0) {
			return 0;
		}else {
			return x/y;
		}
	}
}
