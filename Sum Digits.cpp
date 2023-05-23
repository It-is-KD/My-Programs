#include<stdio.h>
int main()  
{  
   int n,t; 
   int sum=0; 
   printf("Enter a number\n");  
   scanf("%d",&n);  
   while(n!=0)  
   {  
   	   t=n%10;
       n/=10;  
       sum+=t;  
   }      
   printf("\nThe sum of digits in the number is : %d",sum);  
   return 0;  
}
