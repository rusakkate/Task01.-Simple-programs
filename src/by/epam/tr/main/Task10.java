package by.epam.tr.main;
import java.util.Random;

public class Task10 {

	public static void main(String[] args) {
		Random rand = new Random ();
		int n;
		
		do {
			n = rand.nextInt(10) + 1;
		} while (n % 2 != 0);
		
		int mas[][] = new int [n][n];
		
		for (int i = 0; i < mas.length; i = i + 2) {
			for (int j = 0; j < mas[i].length; j++) {
				mas [i][j] = j + 1;
				mas [i+1][j] =  mas[i].length - j;
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf ( "[%4d] ", mas [i] [j] );
			}
			System.out.println();
		}
	}
}
