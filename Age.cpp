#include<stdio.h>
int main()
{
	int age;
	printf("Enter your age:\n");
	scanf("%d",&age);
	if(age<=0)
	printf("Invalid Input");
	else if(age>0 && age<18)
	printf("Minor");
	else if(age>=18 && age<=60)
	printf("Adult");
	else
	printf("Senior");
	return 0;
}