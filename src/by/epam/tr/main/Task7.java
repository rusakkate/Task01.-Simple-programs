package by.epam.tr.main;

public class Task7 {
	public static void main(String[] args) {
		System.out.println ("---------------------------------");
		System.out.printf ("|\t%4s\t|\t%4s\t|\n", "x", "y");	
		System.out.println ("---------------------------------");
		
		double a;
		double b;
		double h;
				
		a=2;
		b=5;
		h=0.5;
		
		double y;
		
		for (double x = a; x <= b; x = x + h) {
			y = Math.pow (Math.sin(x), 2)- Math.cos(2 * x);
			System.out.printf ("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println ("---------------------------------");
				
	}

}
