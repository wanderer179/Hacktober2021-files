#include<iostream>
#include <bits/stdc++.h>
using namespace std;
 
int main()
{
  // Declaring variables
    double p,r,t,comp,amt;
 
  // Accepting Inputs
    cout << "Enter the Principle, Rate & Time: ";
    cin >> p >> r >> t;
  
  // Finding Compound Interest
    amt = p * (pow ((1 + r / 100), t));
    comp = amt - p;
 
    cout << "Compound Interest is: " << comp;
    return 0;
}
