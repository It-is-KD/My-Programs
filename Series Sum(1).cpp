#include <stdio.h>
#include<math.h>
float val(int x)
{
    int i;
    float nume,deno=1,ans; 
    nume=pow(x,x); 
    for (i=1;i<=x;i++)
    {
        deno*=i;
    }
    ans=nume/deno;
    return (ans);
}
int main()
{ 
    int n;
    float sum=0;
    printf("Enter limit of the series: ");
    scanf("%d",&n);
    for (int i=1;i<=n;i+=2)
    {
        sum+=val(i);
    }
    printf("\nThe Sum of the series is : %0.2f",sum);
    return 0;
}