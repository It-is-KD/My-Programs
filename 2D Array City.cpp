#include <stdio.h>
const int City=2;
const int Week=7;
int main()
{
  int temp[City][Week];
  int i,j;
  for (i=0;i<City;++i)
  {
    for (j=0;j<Week;++j)
    {
      printf("City %d, Day %d: ",i + 1,j + 1);
      scanf("%d",&temp[i][j]);
    }
  }
  printf("\nDisplaying values: \n\n");
  for (i=0;i<City;++i)
  {
    for (j=0;j<Week;++j)
    printf("City %d, Day %d = %d\n",i + 1,j + 1,temp[i][j]); 
  }
  return 0;
}