#include<stdio.h>

int main()
{
    int n,i,HCF;
    printf("Enter how many no.s u want to find HCF : ");
    scanf("%d",&n);
    int arr[n];
    printf("\nEnter your numbers below :- \n ");
    for(i=0;i<n;i++)
    {
        printf("\nEnter your %d number = ",i+1);
        scanf("%d",&arr[i]);
    }
    HCF = arr[0];
    int j=1;
    while(j<n)
    {
       if(arr[j] % HCF==0)
       {
           j++;
       }
       else
       {
           HCF = arr[j] % HCF;
           i++;
       }
    }
    printf("\nHCF of no.s = %d ",HCF);
    return 0;
}
