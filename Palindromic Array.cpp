#include<stdio.h>
int main()
{
	int n,f=0;
	printf("Enter the size of the integer array: ");
	scanf("%d",&n);
	int a[n];
	printf("Enter the Numbers in the Array\n");
	for (int i=0;i<n;i++)
	scanf("%d",&a[i]);
	for(int i=0;i<n;i++)
	{
		if(a[i]!=a[n-i-1])
		{
			f=1;
			break;
		}
	}
	if(f)
	printf("The array is not palindromic");
	else
	printf("The array is palindromic");
	return 0;
}