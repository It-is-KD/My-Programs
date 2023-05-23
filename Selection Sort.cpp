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
		for(int j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;	
			}
		}
	}
	printf("\n");
	for(int i=0;i<n;i++)
	printf("%d\n",a[i]);
	return 0;
}