
#include <bits/stdc++.h>
using namespace std;

int hcf(int a, int b)
{
	if (a == 0)
		return b;
	return hcf(b % a, a);
}

// Function to find hcf of array of
// numbers
int findhcf(int arr[], int n)
{
	int result = arr[0];
	for (int i = 1; i < n; i++)
	{
		result = hcf(arr[i], result);

		if(result == 1)
		{
		return 1;
		}
	}
	return result;
}

// Driver code
int main()
{
	int arr[] = { 2, 4, 6, 8, 16 };
	int n = sizeof(arr) / sizeof(arr[0]);
	cout << findhcf(arr, n) << endl;
	return 0;
}

