import java.util.ArrayList;
import java.util.List;

public class PT3 
{
    //PRINT PASCALS TRIANGLE
    public static void main(String[] args) 
    {
        //Given an integer n, return the first n (1-Indexed) rows of Pascal's triangle.
        List<List<Integer>> ans = new ArrayList<>();
        int n=5;
        for(int r=0;r<n;r++)
        {
            long value=1;
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int c=1;c<=r;c++)
            {
                value=value*(r-c+1);
                value=value/c;
                row.add((int)value);
            }
            ans.add(row);
        }
        for (int i = 0; i < ans.size(); i++)
        {
            for (int j = 0; j < ans.get(i).size(); j++)
            {
                System.out.print(ans.get(i).get(j) + " ");
            }

            System.out.println();
        }
        
    }   
}
/*
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
*/
