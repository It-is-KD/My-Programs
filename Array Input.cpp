#include<stdio.h>
int main()
{
	int i,a[10]={0};
	printf("Enter 10 numbers\n");
	for(i=0;i<10;i++)
	scanf("%d",&a[i]);
	printf("The array elements are:\n");
	for(i=0;i<10;i++)
	{
	printf("%d",a[i]);
	printf("\n");
	}
	return 0;
}