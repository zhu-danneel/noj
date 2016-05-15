package chickenrabbit;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		while (count > 0){
			int n = in.nextInt();
			int m = in.nextInt();
			int t = m / 2;
			int rab = t - n;
			if (rab < 0 || n - rab < 0){
				System.out.println("No answer");
				count--;
				continue;
			}
			System.out.printf(n - rab + "  " + rab);
			count--;
		}
	}
}
