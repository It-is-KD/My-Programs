#include<stdio.h>
int main()
{
	int n;
	printf("Enter the range:\n");
	scanf("%d",&n);
	int t1=0;
	int t2=1;
	int nt=t1+t2;
	printf("Fibonacci Seriies:\n%d\n%d\n",t1,t2);
	for(int i=3;i<=n;i++)
	{
		printf("%d\n",nt);
		t1=t2;
		t2=nt;
		nt=t1+t2;
	}
	return 0;
}