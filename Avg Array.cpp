#include<stdio.h>
int main()
{
	int a[5];
	int i,sum=0,avg=1;
	printf("Enter 5 numbers:\n");
	for(i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
		sum+=a[i];
	}
	avg=sum/5;
	printf("Average is: %d",avg);
	return 0;
}