#include<stdio.h>
int main()
{
	int f,s,sum=0;
	int *n1,*n2;
	n1=&f;
	n2=&s;
	printf("Enter 2 numbers: ");
	scanf("%d%d",&f,&s);
	sum= *n1+*n2;
	printf("The sum of %d and %d is: %d",*n1,*n2,sum);
	return 0;
}