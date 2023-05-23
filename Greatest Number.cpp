#include<stdio.h>
int main()
{
	int a,b,c;
	int greatest=0;
	printf("Enter 3 numbers\n");
	scanf("%d %d %d",&a,&b,&c);
	greatest=(a>b && a>c)?a:((b>c && b>a)?b:c);
	printf("The Greatest number is:%d",greatest);
	return 0;
}