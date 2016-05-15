package toplusprime;

import java.util.Scanner;

public class Main {
	public boolean isprime(int a)
	{
		if (a < 2)
		{
			return false;
		}
		if (a == 2)
		{
			return true;
		}
		for (int i = 2; i *i <= a; i++)
		{
			if (a %i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		Main s = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	//	int[] a = new int[1000];
		
		boolean toop = false;
		if (n > 0)
		{
			toop = true;
		}
		while (toop)
		{
			int sum = 0;
			int m = in.nextInt();
			if (m > 0)
			{
				for (int i = 0; i < m; i++)
				{
					int temp = in.nextInt();
					if(s.isprime(temp))
		//			a[i] = in.nextInt();
		//			if (s.isprime(a[i]))
					{
		//				sum += a[i];
						sum+= temp;
					}
				}
			}
			System.out.println(sum);
			
			n--;
			if (n > 0)
			{
				toop = true;
			}
			else
			{
				toop = false;
			}
		}
	}

}
