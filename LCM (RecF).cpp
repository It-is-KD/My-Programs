#include <stdio.h>
int lcm(int a, int b);
int main()
{
    int n1,n2,l;
    printf("Enter any two numbers: ");
    scanf("%d%d", &n1, &n2);
    l=(n1>n2)?(lcm(n2,n1)):(lcm(n1,n2));  
    printf("LCM of %d and %d = %d", n1, n2, l);
    return 0;
}
int lcm(int a, int b)
{
    static int m=0;
    m += b;
    if((m % a == 0) && (m % b == 0))
    return m;
    else
    return lcm(a, b);
}