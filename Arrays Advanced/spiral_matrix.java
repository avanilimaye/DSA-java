import java.util.ArrayList;

public class spiral_matrix 
{
    //goal is to traverse matrix in spiral manner
    public static void main(String[] args) 
    {
        int[][]matrix={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //int[][]matrix={{1, 2, 3, 4}, {5, 6, 7, 8}};
        //maintain 4 pointers
        int top=0;
        int bottom =matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        ArrayList<Integer> ans=new ArrayList<>();

        while(top<=bottom && left<=right)
        {
            //top left to top right
            for(int i=left;i<=right;i++)
            {
                ans.add(matrix[top][i]);
                //same row,diff column 
            }
            //top has been taversed
            top++;
            //right top to right bottom
            for(int i=top;i<=bottom;i++)
            {
                ans.add(matrix[i][right]);
                //same column diff rowns
            }
            //right has been traversed,move it inwards
            right--;

            //right bottom to left bottom
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    ans.add(matrix[bottom][i]);
                    //row same column diff,backwards'
                }
                //bottom has been travsersed,move it inwardsa
                bottom --;
            }
            //left bottom to left top
            if(left<=right)
            {
                for(int i=bottom ;i>=top;i--)
                {
                    ans.add(matrix[i][left]);
                    //column same,row diff backwards
                }
                //move left inwards
                left++;
            }
        }
        System.out.println("Matrix:");
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nSpiral:"+ans);

    }
}
/*
Matrix:
1       2       3
4       5       6
7       8       9

Spiral:[1, 2, 3, 6, 9, 8, 7, 4, 5]
----------------------------
Matrix:
1       2       3       4
5       6       7       8

Spiral:[1, 2, 3, 4, 8, 7, 6, 5]
*/