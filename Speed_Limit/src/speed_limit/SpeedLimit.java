package speed_limit;

import java.util.Scanner;
//https://open.kattis.com/problems/speedlimit
public class SpeedLimit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int problem = sc.nextInt();
			if(problem == -1) System.exit(0);;
			int previousLog = 0, total = 0;
			for (int j = problem; j > 0; j--) {
				int speed = sc.nextInt();
				int hoursDriven = sc.nextInt();
				total += speed * (hoursDriven - previousLog);
				previousLog = hoursDriven;
			}
			System.out.println(total + " miles");
		}

}
}
