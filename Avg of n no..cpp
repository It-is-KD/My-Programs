#include<stdio.h>
int main()
{
	float a[50];
	int n, i;
	printf("Enter number of elements: ");
	scanf("%d",&n);
	printf("Enter numbers:\n");
	for(i=0;i<n;i++)
	scanf("%f",&a[i]);
	for(i=1;i<n;i++)
	a[0]=(a[0]+a[i]);
	printf("Average is: %0.2f",(a[0]/n));
	return 0;
}