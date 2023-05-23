#include<stdio.h>
int main()
{
	int choice;
	int n;
	printf("Enter your number:\n");
	scanf("%d",&n);
	printf("Enter your Choice:\n");
	printf("1. Check for positive or negetive:\n");
	printf("2. Check for odd even:\n");
	scanf("%d",&choice);
	switch(choice)
	{
		case 1:
			if(n>0)
			printf("Positive");
			else
			printf("Negetive");
			break;
		case 2:
			if(n%2==0)
			printf("Even");
			else
			printf("Odd");
			break;
		default:
			printf("Wrong Choice!!");
			break;
	}
	return 0;
}