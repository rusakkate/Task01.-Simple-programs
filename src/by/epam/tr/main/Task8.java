package by.epam.tr.main;
import java.util.Random;

public class Task8 {

	public static void main(String[] args) {
		Random rand = new Random ();
		int n = rand.nextInt(10) + 2;
		int mas[] = new int [n];
		
		System.out.print("Массив: \t");
		for (int i = 0; i < mas.length; i++) {
			mas [i] = rand.nextInt (1000);
			System.out.printf ("[%3d] ", mas [i]);
		}
		System.out.println();
				
		int k = rand.nextInt(10) + 1;
		int sum;
		sum = 0;
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % k == 0) {
			sum = sum + mas[i];
			}
		}
		
		System.out.print ("Сумма элементов массива, кратных " + k + ", составляет " + sum);
		
	}
}
