package by.epam.tr.main;

public class Task5 {

	public static void main(String[] args) {
		double a, b, c;
		
		a = -1; b = 6; c = -3;
		
		if (a < 0) {
			System.out.print ("Число a - отрицательное, a=" + a);
			a = Math.pow (a, 4);
			System.out.println (", его надо возвети в четвертую степень: a^4 = " + a);
		} else {
			System.out.print ("Число a - положительное, a=" + a);
			a = Math.pow (a, 2);
			System.out.println (", его надо возвети в квадрат: a^2 = " + a);
		}
		
		if (b < 0) {
			System.out.print ("Число b - отрицательное, b=" + b);
			b = Math.pow (b, 4);
			System.out.println (", его надо возвети в четвертую степень: b^4 = " + b);
		} else {
			System.out.print ("Число b - положительное, b=" + b);
			b = Math.pow (b, 2);
			System.out.println (", его надо возвети в квадрат: b^2 = " + b);
		}

		if (c < 0) {
			System.out.print ("Число c - отрицательное, c=" + c);
			c = Math.pow(c, 4);
			System.out.println (", его надо возвети в четвертую степень: c^4 = " + c);
		} else {
			System.out.print ("Число c - положительное, c=" + c);
			c=Math.pow (c, 2);
			System.out.println(", его надо возвети в квадрат: c^2 = " + c);
		}

		
	}

}
