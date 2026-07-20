class Main
{
    public static void main(String[] args)
    {
        int n=6;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n-i-1;j++)
            {
                System.out.print(j+1);
            }
            System.out.println();
        }        
    }
}
/*
123456
12345
1234
123
12
1
*/