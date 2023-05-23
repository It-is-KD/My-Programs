#include<stdio.h>
int main()
{
	int a[50], n,t=0;
	printf("Enter the no. of elements in the array: ");
	scanf("%d",&n);
	printf("Enter the elements:\n");
	for(int i=0;i<n;i++)
	scanf("%d",&a[i]);
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<(n-i-1);j++)
		{
			if (a[j]>a[j+1])
			{
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
			else
			continue;
		}
	}
	printf("Sorted Elements in Ascending Order:\n");
	for(int i=0;i<n;i++)
	printf("%d\n",a[i]);
	return 0;
}