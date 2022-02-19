package by.epam.tr.main;

public class Task3 {

	public static void main(String[] args) {
		double a, b;
		double P, S;
		
		a = 3;
		b = 4;
		
		P = a + b + Math.hypot(a, b);
		S = ( a * b ) / 2;
		
		System.out.println ("Периметр треугольника равен " + P);
		System.out.println ("Площадь треугольника равна " + S);
		
	}
}
