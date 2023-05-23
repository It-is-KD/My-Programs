#include<stdio.h>
int main()
{
	int f,s,g=0;
	int *n1,*n2;
	n1=&f;
	n2=&s;
	printf("Enter 2 numbers: ");
	scanf("%d%d",&f,&s);
	g=(*n1>*n2)?*n1:*n2;
	printf("The greater number between %d and %d is= %d",*n1,*n2,g);
	return 0;
}