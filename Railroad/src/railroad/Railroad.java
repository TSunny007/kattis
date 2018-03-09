package railroad;

import java.util.Scanner;

//https://open.kattis.com/problems/railroad2
public class Railroad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int garbage = sc.nextInt();
		int answer = sc.nextInt();
		if ( answer % 2 == 0 ) System.out.println("possible");
		else System.out.println("impossible\n");
	}

}
