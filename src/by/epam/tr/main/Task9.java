package by.epam.tr.main;
import java.util.Random;

public class Task9 {

	public static void main(String[] args) {
		Random rand = new Random ();
		int n;
		int m;
		
		do {
			n = rand.nextInt(10) + 2;
			m = rand.nextInt(10) + 2;
		} while (n == m);
		
		int mas1[] = new int [n];
		int mas2[] = new int [m];
		
		System.out.print("Исходный массив1: \t");
		for (int i = 0; i < mas1.length; i++) {
			mas1 [i] = rand.nextInt (1000);
			System.out.printf ("[%3d] ", mas1 [i]);
		}
		System.out.println();
		
		System.out.print("Исходный массив2: \t");
		for (int i = 0; i < mas2.length; i++) {
			mas2 [i] = rand.nextInt (1000);
			System.out.printf ("[%3d] ", mas2 [i]);
		}
		System.out.println();
		
		int k;
		
		do {
			k = rand.nextInt(10) + 1;
		} while (k > mas1.length-1);
		
		System.out.println();
		System.out.println("k = " + k);
			
		System.out.println();
		System.out.print("Объединенный массив: \t");
		
		for (int i = 0; i < k; i++) {
			System.out.printf ("[%3d] ", mas1 [i]);
		}
		
		System.out.print ("\t{ ");
		for (int i = 0; i < mas2.length; i++) {
			System.out.printf ("[%3d] ", mas2 [i]);
		}
		System.out.print (" }\t");
		
		for (int i = k; i < mas1.length; i++) {
			System.out.printf ("[%3d] ", mas1 [i]);
		}

	}
}
