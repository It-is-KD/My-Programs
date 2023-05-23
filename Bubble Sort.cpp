#include<stdio.h>

int main()
{
	int n,t;
	int a[50];
	printf("Enter the range of the array\n");
	scanf("%d",&n);
	printf("Enter the array elements\n");
	for(int i=0;i<n;i++)
	scanf("%d",&a[i]);
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
	}
	printf("\n");
	for(int i=0;i<n;i++)
	printf("%d\n",a[i]);
	return 0;
}