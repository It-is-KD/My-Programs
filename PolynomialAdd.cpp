#include<stdio.h>
int main()
{
	int a[50][2],b[50][2],c[50][5];
	int n1,n2,count=0;
	printf("Enter the number of expressions in 1st polynomial: ");
	scanf("%d",&n1);
	printf("Enter the number of expressions in 2nd polynomial: ");
	scanf("%d",&n2);
//1st
	printf("Enter coefficient & exponent: ");
	for(int j=0;j<n1;j++)
    	scanf("%d%d",&a[j][0],&a[j][1]);
//2nd
	printf("Enter coefficient & exponent: ");
	for(int j=0;j<n2;j++)
		scanf("%d%d",&b[j][0],&b[j][1]);
//add
	for(int i=0;i<2;i++)
		for(int j=0;j<n1+n2;j++)
		{
			if(a[i][1]==b[j][1])
			{
				c[count][1]=a[j][1];
				c[count][0]=a[i][0]+b[j][0];
				count++;
			}
			else if(a[i][1]!=b[j][1])
			{
				c[count][1]=a[j][1];
				c[count][0]=a[i][0];
				count++;			
				if(b[i][1]!=a[j][1])
				{
					c[count][1]=b[j][1];
					c[count][0]=b[i][0];
					count++;
				}
			}
		}
		for(int j=0;j<n1+n2;j++)
		{
			printf("coefficient: %d\n",);
			/*printf("coefficient: %d\n",c[0][j]));
			printf("exponent: %d\n",c[1][j]);*/
		}
	return 0;
}