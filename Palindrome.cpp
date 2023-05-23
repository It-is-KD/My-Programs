#include<stdio.h>
int main()
{
	int n,t;
	printf("Enter a Number:\n");
	scanf("%d",&n);
	int m=n;
	int a=0;
	while(n!=0)
	{
		t=n%10;
		a=a*10+t;
		n/=10;
	}
	if(a==m)
	printf("%d is Palindromic",m);
	else
	printf("%d is not Palindromic",m);
	return 0;
}