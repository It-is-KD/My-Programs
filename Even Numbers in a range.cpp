#include<stdio.h> 
int main()
{
        int f1,f2,rem,i;
        printf("Give the First number of the Range :   \n");
        scanf("%d",&f1);
        printf("Give the Final number of the Range :   \n");
        scanf("%d",&f2);
	    printf("The Even numbers between %d and %d are\n",f1,f2); 
        for(i=f1; i<=f2; ++i)
		{
               rem = i % 2;
               if(rem == 0)
               printf("\n%d",i);
	    }
	return 0; 
} 