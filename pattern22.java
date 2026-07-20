public class pattern22 
{
    public static void main(String[] args) 
    {
        int n=5;
        int size=2*n-1;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;

                int layer=Math.min(Math.min(right, left) ,Math.min(bottom ,top));
                System.out.print(n - layer + " ");
            }
            System.out.println();
        }

        
    }
}
/*
5 5 5 5 5 5 5 5 5 
5 4 4 4 4 4 4 4 5 
5 4 3 3 3 3 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 2 1 2 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 3 3 3 3 4 5 
5 4 4 4 4 4 4 4 5 
5 5 5 5 5 5 5 5 5 

*/