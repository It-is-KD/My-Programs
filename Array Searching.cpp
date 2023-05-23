#include <stdio.h>
int main()
{
   	int arr[250], search, n, i; 
   	printf("Please enter the number of elements in the array\n");
   	scanf("%d",&n);
   	printf("Enter the numbers\n");
   	for(i=0;i<n;i++)
	scanf("%d",&arr[i]);
   	printf("Enter the number you want to search\n");
   	scanf("%d",&search);
   	for (i=0;i<n;i++)
   	{
    	if (arr[i]==search)  
      	{
        	printf("%d is present at position %d\n",search,i+1);
        	break;
      	}	
   	}
   	if (i==n)
    printf("%d is not available in the array.\n",search);
   	return 0;
}