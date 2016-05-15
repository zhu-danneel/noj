package fibonacc;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while ((n--) > 0){
			int f = in.nextInt();
			int n1 = 1;
			int n2 = 1;
			if (f == 1 || f== 2){
				System.out.println(1);
				continue;
			}
			f = f - 2;
			while((f--) > 0){
				int temp = n2;
				n2 = n1 + n2;
				n1 = temp;
			}
			System.out.println(n2);
		}
	}
}
