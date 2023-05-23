 #include <math.h>
#include <stdio.h>
int main()
{
   int num,org,rem,n=0;
   float result = 0.0;
   printf("Enter an integer: ");
   scanf("%d",&num);
   org=num;
   for (org=num;org!=0;++n)
       org/=10;
   for (org=num;org!=0;org/=10)
    {
	   	rem=org%10;
    	result+=pow(rem,n);
	}
	if(result==num)
	printf("%d is an Armstrong Number",num);
	else
	printf("%d is not an Armstrong Number",num);
    return 0;
}