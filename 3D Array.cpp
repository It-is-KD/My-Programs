#include <stdio.h>
int main()
{
  int a[2][3][2],i,j,k;
  printf("Enter 12 values:-\n");
  for(i=0;i<2;i++)
  {
    for(j=0;j<3;j++)
    {
      for (k=0;k<2;k++)
      scanf("%d", &a[i][j][k]);
    }
  }
  printf("The 3D Array is:\n");
  for(i=0;i<2;i++)
  {
    for(j=0;j<3;j++)
    {
      for(k=0;k<2;k++)
      printf("a[%d][%d][%d]= %d\n",i,j,k,a[i][j][k]);
    }
    printf("\n");
  }
  return 0;
}