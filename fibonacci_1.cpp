#include<iostream>
using namespace std;


int main()
{
	int f=0,s=1,t,n;
 
	cout<<"Enter Number of terms of Series : ";
	cin>>n;
 
	cout<<f<<" "<<s<<" ";
 
	for(int i=3;i<=n;i++)
	{
		t=f+s;
		cout<<t<<" ";
		f=s;
		s=t;
	}
 
	
	return 0;
}
