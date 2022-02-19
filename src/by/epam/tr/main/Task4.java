package by.epam.tr.main;

public class Task4 {

	public static void main(String[] args) {
		
		int x1, y1;
		int x2, y2;
		int x3, y3;
		int x4, y4;
		
		x1 = 2; y1 = 4;
		x2 = -2; y2 = 0;
		x3 = 4; y3 = 0;
		x4 = -4; y4 = -3;
		
		int x, y;
		 
		x = 1; y = -1;
		
		if ( x < x1 & x > x2 & y < y1 & y > y2) {
			System.out.println ("true");
		} else if (x < x3 & x > x4 & y < y3 & y > y4) {
			System.out.println ("true");
		} else {
			System.out.println ("false");
		}

	}

}
