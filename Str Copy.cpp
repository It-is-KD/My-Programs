#include<stdio.h>
int main()
{
	char s1[100], s2[100],i;
	printf("Enter a string s1: ");
	gets(s1);
	for(i=0;s1[i]!='\0';i++)
	s2[i]=s1[i];
	printf("String s2: %s",s2);
	return 0;	
}