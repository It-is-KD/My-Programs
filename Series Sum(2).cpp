#include<math.h>
#include<stdio.h>
float series(int n)
{
	float f=1.0,p=1.0;
	float sum=0.0;
	for(int i=1;i<=n;i++)
	{
		f*=i;
		p=pow(i,i);
		sum+=(p/f);
	}
	printf("Sum of the series= %.2f",sum);
	return 0;
}
int main()
{
	int n;
	printf("Enter the limit of the series: ");
	scanf("%d",&n);
	series(n);
}