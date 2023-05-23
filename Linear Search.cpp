#include<stdio.h>
int search(int r,int a[],int n)
{
	for(int i=0;i<r;i++)
	{
		if(a[i]==n)
		{
			return i+1;
//			break;
		}
	}
	return 0;
}
int main()
{
	int n,r,i;
	int a[50];
	printf("Enter the range of the array\n");
	scanf("%d",&r);
	printf("Enter the array elements\n");
	for(int i=0;i<r;i++)
	scanf("%d",&a[i]);
	printf("Enter the element to be searched\n");
	scanf("%d",&n);
	i=search(r,a,n);
	if(i)
	printf("The element is found on position: %d",i);
	else
	printf("The element is not found");
}