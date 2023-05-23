#include<stdio.h>
int main()
{
	int a,b;
	printf("Enter the number:\n");
	scanf("%d",&a);
	printf("Enter it's exponent:\n");
	scanf("%d",&b);
	int power=1;
	for(int i=1;i<=b;i++)
	power=power*a;
	printf("%d^%d= %d",a,b,power);
	return 0;
}