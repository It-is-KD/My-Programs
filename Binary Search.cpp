#include<stdio.h>
int search(int r,int a[],int n)
{
	int mid,lb=0,ub=r;
	while(lb<=ub)
	{
		mid=(lb+ub)/2;
		if(n==a[mid])
		{
			return mid+1;
			break;
		}
		else if(n>a[mid])
		lb=mid+1;
		else if(n<a[mid])
		ub=mid-1;
	}
	return 0;
}
int main()
{
	int n,r,mid;
	int a[50];
	printf("Enter the range of the array\n");
	scanf("%d",&r);
	printf("Enter the array elements\n");
	for(int i=0;i<r;i++)
	scanf("%d",&a[i]);
	printf("Enter the element to be searched\n");
	scanf("%d",&n);
	mid=search(r,a,n);
	if(mid)
	printf("The element is found on position: %d",mid);
	else
	printf("The element is not found");
}