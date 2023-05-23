#include <stdio.h>
int gdc(int,int);
int main() 
{
    int n1, n2;
    printf("Enter two positive integers: ");
    scanf("%d %d", &n1, &n2);
    printf("GCD of %d and %d is %d.",n1,n2,gdc(n1, n2));
    return 0;
}
int gdc(int n1, int n2) 
{
    if (n2 != 0)
    return gdc(n2, n1 % n2);
    else
    return n1;
}