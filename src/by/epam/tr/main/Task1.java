package by.epam.tr.main;
import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		Random rand = new Random ();
		int x;
		
		x = rand.nextInt(10000);
		System.out.println ("x = " + x);
		
		int a;
		int b;
		
		b = ( x / 10 - ( x / 100 ) * 10 ) + x % 10;
		a = x / 1000 + ( x / 100 - ( x / 1000 ) * 10 );
		
		System.out.println (a == b);
	}	
}
