package gongyuegongbei;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n  = in.nextInt();
		while (n!= 0){
		int a = in.nextInt();
		int b = in.nextInt();
		if(a > b){
			a = a + b;
			b = a - b;
			a = a - b;
		}
		int p = a * b;
		while (a != 0){
			int r=b%a; 
			b=a; 
			a=r;
		}
		System.out.printf(b + "  ");
		System.out.println(p/b);
		n--;
		}
	}
}
