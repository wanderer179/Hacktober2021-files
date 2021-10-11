#include<iostream>
using namespace std;
int main()
{
      int a=0, b=1, i, n, c;
      cout<<"Enter the number of terms: "; 
      cin>>n;
      //accepting the terms
      cout<<"Fibonacci Series: ";
  
      cout<<a<<" "<<b;
      for(i=1;i<=n-2;i++)
      {
          c=a+b;
          cout<<" "<<c;
          a=b;
          b=c;
      }
    
   return 0;
}
