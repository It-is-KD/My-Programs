#include <stdio.h>
int findFact(int,int*);
int main()
{
    int fact;
	int num1;
	printf("Pointer : Find the factorial of a given number :\n"); 
	printf("Input a number : ");
	scanf("%d",&num1);
    findFact(num1,&fact);
    printf("The Factorial of %d is : %d",num1,fact);
    return 0;
}
int findFact(int n,int *f)
{
	int i;
    *f =1;
    for(i=1;i<=n;i++)
	*f=*f*i;
	return 0;
}
