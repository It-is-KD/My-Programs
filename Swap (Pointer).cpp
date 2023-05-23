#include<stdio.h>
int swap(int *n1,int *n2)
{
	printf("First Number: %d\nSecond Number: %d",*n1,*n2);
	int s=0;
	s=*n1;
	*n1=*n2;
	*n2=s;
	printf("\nAfter Swap\n");
	printf("First Number: %d\nSecond Number: %d",*n1,*n2);
}
int main()
{
	int f,s;
	printf("Enter 2 numbers: ");
	scanf("%d%d",&f,&s);
	swap(&f,&s);
	return 0;
}