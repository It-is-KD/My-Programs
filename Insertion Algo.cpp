#include<stdio.h>
int beg(int,int [],int);
int end(int,int [],int);
int af(int,int [],int,int);
int be(int,int [],int,int);
int main()
{
	int a[50];
	int n,ele=0,num=0,choice=0;
	printf("Enter the size of the array\n");
	scanf("%d",&n);
	printf("Enter the elements of the array\n");
	for(int i=0;i<n;i++)
	scanf("%d",&a[i]);
	printf("Enter the element to be inserted\n");
	scanf("%d",&num);
	printf("\n1.To insert in begining\n");
	printf("2.To insert in end\n");
	printf("3.To insert before\n");
	printf("4.To insert after\n");
	scanf("%d",&choice);
	switch(choice)
	{
		case 1: 
			beg(num,a,n);
			break;
		
		case 2:
			end(num,a,n);
			break;
		
		case 3:
			printf("\nEnter the element before which %d is to be inserted\n",num);
			scanf("%d",&ele);
			be(num,a,n,ele);
			break;
			
		case 4:
			printf("\nEnter the element after which %d is to be inserted\n",num);
			scanf("%d",&ele);
			af(num,a,n,ele);
			break;
	}
	printf("\nThe new array:\n");
	for(int i=0;i<=n;i++)
	printf("%d\n",a[i]);
}
int beg(int num,int ar[],int n)
{
	int i;
	for(i=n-1;i>=0;i--)
		ar[i+1]=ar[i];
	ar[0]=num;
	return 0;
}
int end(int num,int ar[],int n)
{
	int i;
	ar[n]=num;
	printf("%d",num);
	return 0;
}
int af(int num,int ar[],int n,int ele)
{
	int i,j;
	for(i=0;i<n;i++)
	{
		if(ar[i]==ele)
		{
			for(j=n-1;j>i;j--)
			{
				ar[j+1]=ar[j];
			}
			break;
		}
	}
	ar[i+1]=num;
	return 0;
}

int be(int num,int ar[],int n,int ele)
{
	int i,j;
		for(i=0;i<n;i++)
		{
			if(ar[i]==ele)
			{
				for(j=n-1;j>=i;j--)
				{
					ar[j+1]=ar[j];
				}
				break;
			}
		}
	ar[i]=num;
	return 0;
}