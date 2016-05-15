#include <stdio.h>
#include <stdlib.h>
/**
 * 寻找n以内的孪生素数(相隔一个或者两个数)*/
int isprime(int m)
{
    int i;
    if(m < 2)
    {
        return 0;
    }
    for(i = 2; i * i <= m; ++i)
    {
        if(m  % i == 0)
        {
            return 0;
        }
    }
    return 1;
}


void mian()
{
	int n = 0;
	int m = 0;
	int i = 0;
	int count = 0;

	scanf("%d", &n);
	while (n--)
	{
		scanf("%d", &m);
		for(i = 2; i < m - 2; ++i)
        {
            if ((isprime(i) && isprime(i + 2)) || (isprime(i) && isprime(i + 1)))
            { 
                count++;
            }
        }
	}
	printf("%d\n", count);
}
