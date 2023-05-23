#include<stdio.h>
int main()
{
	char s1[20];
	int l,i,f=0;
	printf("Enter a string s1: ");
	gets(s1);
	for(l=0;s1[l]!='\0';l++);
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
}