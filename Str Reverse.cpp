#include<stdio.h>
int main()
{
	char s1[100],s2[100],i,l;
	printf("Enter a string s1: ");
	gets(s1);
	for(l=0;s1[l]!='\0';l++);
	for(i=0;s1[i]!='\0';i++)
	s2[i]=s1[l-i-1];
	printf("String s2: %s",s2);
	return 0;
}