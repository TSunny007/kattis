package tarifa;

import java.util.Scanner;

// PROBLEM SOLVED : https://open.kattis.com/problems/tarifa
public class Tarifa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bytesPerMonth = 0, months = 0, total = 0;
		if (sc.hasNextInt()) {
			bytesPerMonth = sc.nextInt();
		}
		if (sc.hasNextInt()) {
			months = sc.nextInt();
		} 
		total = (months+1)*bytesPerMonth;
		for (int i = 0 ; i < months; i ++) {
			total-= sc.nextInt();
		}
		System.out.println(total);
	}

}
