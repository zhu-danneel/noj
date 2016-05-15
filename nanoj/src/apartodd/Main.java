package apartodd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++){
			
			int k = in.nextInt();
			
			for (int j = 1;j <= k; j++){
				if (j % 2 != 0){
					System.out.printf(j + "  ");
				}
			}
			System.out.println();
			for (int j = 1; j <= k; j++){
				if (j % 2 == 0){
					System.out.printf(j + "  ");
				}
			}
			System.out.println();
			System.out.println();
		}
		in.close();
	}
}
