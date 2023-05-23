#include<stdio.h>
int main()
{
	int n;
	int f=1;
	printf("Enter a number:\n");
	scanf("%d",&n);
	if(n>1)
	{
		for(int i=1;i<=n;i++)
		f=f*i;
		printf("Factorial of %d is: %d\n",n,f);
	}
	else if(n==0||n==1)
	printf("The Factorial of %d is: %d\n",n,f);
	return 0;
}