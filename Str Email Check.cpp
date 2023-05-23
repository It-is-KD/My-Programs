#include<stdio.h>
int main()
{
	char s1[100],i,j,f=0;
	printf("Enter email address: ");
	gets(s1);
	for(i=0;s1[i]!='\0';i++)
	{
		if(s1[i]=='@')
		{
			for(j=i;s1[j]!='\0';j++)
			if(s1[j]=='.')
			{
				f=1;
				break;
			}
		}
	}
	if(f==1)
	printf("Valid Email Address");
	else
	printf("Invalid Email Address");
	return 0;
}