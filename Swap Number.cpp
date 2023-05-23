#include<stdio.h>
int main()
{
	int a,b;
	printf("Enter 2 numbers A & B:\n");
	scanf("%d %d",&a,&b);
	a=a+b;
	b=a-b;
	a=a-b;
	printf("A=%d\nB=%d",a,b);
	return 0;
}