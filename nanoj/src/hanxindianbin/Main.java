package hanxindianbin;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		for (int i = 1; i <= 14; i++){
			int k = i * 7;
			if ( (k + c ) % 3 == a && (k + c) % 5 == b){
				System.out.println(k + c);
				return;
			}
		}
	}
}
