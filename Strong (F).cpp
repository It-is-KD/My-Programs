#include<stdio.h>
int strong(int n)
{
   int sum = 0,fact,rem,i;
   int temp = n;
   while(n)
   {
      i=1,fact=1;
      rem = n % 10;
      while(i <= rem)
	  {
         fact = fact * i;
         i++;
      }
      sum = sum + fact;
      n = n / 10;
   }
   if(sum == temp)
      printf("%d is a strong number\n",temp);
   else
      printf("%d is not a strong number\n",temp);
}
int main()
{
   int n;
   printf("\nEnter a number:\n");
   scanf("%d",&n);
   strong(n);
   return 0;
}