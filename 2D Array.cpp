#include<stdio.h>
int main()
{
	int a[3][4],i,j;
	printf("Enter the numbers\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
		scanf("%d",&a[i][j]);
	}
	printf("The 2D Array is:\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
        printf("a[%d][%d]= %d\n",i,j,a[i][j]);
		printf("\n");
	}
	return 0;
}