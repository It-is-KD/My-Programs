#include<stdio.h>
int add(int *n1,int *n2)
{
	int sum;
	sum= *n1+*n2;
	return (sum);
}
int main()
{
	int f,s,sum;
	printf("Enter 2 numbers: ");
	scanf("%d%d",&f,&s);
	sum= add(&f,&s);
	printf("The sum of %d and %d is: %d",f,s,sum);
	return 0;
}