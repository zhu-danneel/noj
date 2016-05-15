#include<iostream>
#include<vector>
#include<string>
using namespace std;
/**
n 为测试的次数，输入括号类判断是否匹配*/
int main(int args, char *argv[])
{
	int n;
	cin>>n;
	while (n--)
	{
		vector<char> vec;
		string ch;
		vec.push_back(' ');
		cin>>ch;
		for (int i = 0; i < ch.length(); i++)
		{
			vec.push_back(ch[i]);
			if (vec.back() -1 == *(vec.end() -2) || vec.back() -2 == *(vec.end() -2))
			{
				vec.pop_back();
				vec.pop_back();
			}
		}
		if (vec.size() == 1)
		{
			cout<<"Yes"<<endl;
		}
		else
		{
			cout<<"No"<<endl;
		}
	}
	return;
}