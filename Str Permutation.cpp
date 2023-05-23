#include <stdio.h>
#include <string.h>
int changePosition(char *ch1, char *ch2)
{
    char tmp;
    tmp = *ch1;
    *ch1 = *ch2;
    *ch2 = tmp;
}
int charPermu(char *cht, int stno, int endno)
{
   int i;
   if (stno == endno)
     printf("%s  ", cht);
   else
   {
       for (i = stno; i <= endno; i++)
       {
          changePosition((cht+stno), (cht+i));
          charPermu(cht, stno+1, endno);
          changePosition((cht+stno), (cht+i)); 
       }
   }
}
int main()
{
	char str[] = "abcd";
   	printf("\nPointer : Generate permutations of a given string :\n\n"); 
  	int n = strlen(str);
	printf("The permutations of the string are :\n\n");
  	charPermu(str, 0, n-1);
    return 0;
}
