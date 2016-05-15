package minmaxnumber;

import java.math.BigInteger;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger min = in.nextBigInteger();
		BigInteger max = min;
		for (int i = 0; i < 4; i++){
			BigInteger c = in.nextBigInteger();
			if ( c.compareTo(min) == -1){
				min = c;
			}
			if(c.compareTo(max) == 1){
				max = c;
			}
		}
		System.out.printf(min + "  ");
		System.out.printf(max + "  ");
	}
}
