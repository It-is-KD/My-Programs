class pell_series
{
    public static void main()
    {
        int pp=1,p=2,cur=0,i=0;
        System.out.print(pp+" "+p);
        for(i=0;i<13;i++)
        {
        cur=pp+p*2;
        
        System.out.print(" "+cur);
        pp=p;
        p=cur;
    }
}
}
        