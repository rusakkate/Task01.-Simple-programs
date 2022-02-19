package by.epam.tr.main;

public class Task6 {

	public static void main(String[] args) {
		int a;
		int b;
		int	c;
			
		a = 10;
		b = 5;
		c = 1;
		
		int max;
		int min;
		
		if (a > b & a > c) {
			max = a;
		} else if (b > a & b > c){
			max = b;
		} else
			max = c;
		System.out.println ("Максимальное число "  + max);
	
		if (a < b & a < c) {
			min = a;
		} else if (b< a & b< c){
			min = b;
		} else
			min = c;
		System.out.println ("Минимальное число " + min);
		
	}

}
