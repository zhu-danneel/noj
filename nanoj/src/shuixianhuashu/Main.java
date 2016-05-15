package shuixianhuashu;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(1 == 1){
			int a = in.nextInt();
			if(a==0) break;
			System.out.println((a==153||a==370||a==371||a==407)?"Yes":"No");
		}
	}
}
