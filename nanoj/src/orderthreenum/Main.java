package orderthreenum;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		if (b < a){
			a = a + b;
			b = a - b;
			a = a - b;
		}
		int c = in.nextInt();
		if (c > b){
			System.out.printf(a + "  ");
			System.out.printf(b + "  ");
			System.out.printf(c + "  ");
		}
		else if (c < a){
			System.out.printf(c + "  ");
			System.out.printf(a + "  ");
			System.out.printf(b + "  ");
		}
		else{
			System.out.printf(a + "  ");
			System.out.printf(c + "  ");
			System.out.printf(b + "  ");
		}
	}

}
