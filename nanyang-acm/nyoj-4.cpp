#include<iostream>
#include<cmath>

using namespace std;
#define INF 0.0000001
int main()
{
	int n, m;
	int i;
	double x[10010], y[10010];
	double sum, dots;

	cin>>m;
	while (m--)
	{
		dots = sum = 0;
		cin>>n;
		for(i = 0; i < n; i++)
		{
			cin>>x[i]>>y[i];
		}
		for(i = 1; i <= n; i++)
		{
			double temp = (y[i-1]*x[i%n] - y[i%n]*x[i-1]) / 2.0;
			sum += temp;
			dots += temp * (x[i%n] + x[i-1] + y[i%n] + y[i-1]) / 3.0;
		}
		cout.precision(3);
		if (sum < INF)
		{
			cout<<"0.000"<<"0.000"<<endl;
		}
		else
		{
			cout<<fixed<<fabs(sum)<<' ';
			cout<<dots/sum<<endl;
		}
	}
	return 0;
}