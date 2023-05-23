#include<stdio.h>
int main()
{
	int n, *p;
	printf("Enter a number: ");
	scanf("%d",&n);
	p=&n;
	printf("Address of the Variable 'n' using '&': %d\n",&n);
	printf("Address using Pointer of Variable 'n': %d\n",p);
	printf("Accessing the value stored in 'n' using '*': %d",*p);
	return 0;
}