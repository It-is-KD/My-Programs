
class TwoDimentionalArray 
{
    public static void main(String[] args)
    {   //start of main method
        int[][] a = { {15, 25, 35}, {45, 55, 65} };//initialising the array
        int[][] b = {{12, 22, 32}, {55, 25, 85} };
        int[][] Sum = new int[2][3];
        int rows, columns;//loop variables
        for(rows = 0; rows < a.length; rows++) 
        {
            for(columns = 0; columns < a[0].length; columns++)
            {
                Sum[rows][columns] = a[rows][columns] + b[rows][columns];  
            }			
        }
        System.out.println("Sum Of those Two Arrays are: ");
        for(rows = 0; rows < a.length; rows++) 
        {
            for(columns = 0; columns < a[0].length; columns++)
            {
                System.out.format("%d \t", Sum[rows][columns]);
            }
            System.out.println(" ");
        }
    }//end of main method
}//end of class
