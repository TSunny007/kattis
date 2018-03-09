package islands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
// https://open.kattis.com/problems/islands
public class Islands {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sets = sc.nextInt();
	for (int i = sets; i > 0; i--) {
		int setNum = sc.nextInt();
		int[] sequence = new int[12];
		for (int j =0; j< 12; j++) {
			sequence[j] = sc.nextInt(); 
		}
		int islandCount = 0;
		for (int start = 1; start < 11; start++) {
			int leftStandard = sequence[start-1];
			if (leftStandard <sequence[start])
				for (int end = start+1; end < 11; end++ ) {
					int rightStandard = sequence[end+1];
					int islandMin = Collections.min(Arrays.stream(Arrays.copyOfRange(sequence, start, end+1)).boxed().collect(Collectors.toList()));
					if ( islandMin> Math.max(leftStandard, rightStandard)) {
						islandCount ++;
					}
				}
		}
		for (int q = 1; q < 11; q++ ) {
			if (sequence[q] >  sequence[q+1] && sequence[q] >  sequence[q-1])
				islandCount++;
		}
		System.out.println(setNum +" " + islandCount);
	}
	}
}
