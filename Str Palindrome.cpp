#include<stdio.h>
#include<string.h>
int main()
{
	char s1[20];
	int l,i,f=0;
	printf("Enter a string s1: ");
	gets(s1);
	l=strlen(s1);
	for(i=0;i<l;i++)
	{
		if(s1[i]!=s1[l-i-1])
		{
			f=1;
			break;
		}
	}
	if(f)
	printf("%s is not Palindromic String",s1);
	else
	printf("%s is Palindromic String",s1);
	return 0;
}