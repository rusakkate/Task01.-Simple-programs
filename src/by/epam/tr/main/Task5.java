package by.epam.tr.main;

public class Task5 {

	public static void main(String[] args) {
		double a, b, c;
		
		a = -1; b = 6; c = -3;
		
		if (a < 0) {
			System.out.print ("����� a - �������������, a=" + a);
			a = Math.pow (a, 4);
			System.out.println (", ��� ���� ������� � ��������� �������: a^4 = " + a);
		} else {
			System.out.print ("����� a - �������������, a=" + a);
			a = Math.pow (a, 2);
			System.out.println (", ��� ���� ������� � �������: a^2 = " + a);
		}
		
		if (b < 0) {
			System.out.print ("����� b - �������������, b=" + b);
			b = Math.pow (b, 4);
			System.out.println (", ��� ���� ������� � ��������� �������: b^4 = " + b);
		} else {
			System.out.print ("����� b - �������������, b=" + b);
			b = Math.pow (b, 2);
			System.out.println (", ��� ���� ������� � �������: b^2 = " + b);
		}

		if (c < 0) {
			System.out.print ("����� c - �������������, c=" + c);
			c = Math.pow(c, 4);
			System.out.println (", ��� ���� ������� � ��������� �������: c^4 = " + c);
		} else {
			System.out.print ("����� c - �������������, c=" + c);
			c=Math.pow (c, 2);
			System.out.println(", ��� ���� ������� � �������: c^2 = " + c);
		}

		
	}

}
