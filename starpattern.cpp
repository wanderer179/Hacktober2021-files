#include<iostream>
using namespace std;
int main()
{

    int r,c,n,s;
    cout<<"enter number of steps u want: ";
    cin>>n;
    
    for(r=1;r<=n;r++)
    {
        for(s=n-1;s>=r;s--)
        {
            cout<<" ";
        }
        
        for(c=1;c<=r;c++)
        {
            cout<< '*' <<" ";
        }
        cout<<endl;
    }
    return 0;
    
}
