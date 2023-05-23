#include<stdio.h>
int main()
{
	char s1[100],i;
	printf("Enter a string s1: ");
	gets(s1);
	for(i=0;s1[i]!='\0';i++);
	printf("Length of String is: %d",i);
}
	