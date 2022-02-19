package by.epam.tr.main;

public class Task2 {

	public static void main(String[] args) {
		double a, b, c;
		double result;
		
		a = 1; b = 2; c = 3;
		
		result=( ( b + Math.sqrt ( (Math.pow(b, 2) + 4 * a * c ) ) ) / ( 2 * a ) ) - Math.pow(a, 3) * c + Math.pow(b,-2);
		
		System.out.println (result);
	}
}