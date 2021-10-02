// CPP program to find compound interest for
// given values.
#include <bits/stdc++.h>
using namespace std;

int main()
{
	double principle = 10000, rate = 5, time = 2;

	/* Calculate compound interest */
	double A = principle * (pow((1 + rate / 100), time));
	double CI = A- principle;

	cout << "Compound interest is " << CI;

	return 0;
}
//This Code is Contributed by Sahil Rai.
