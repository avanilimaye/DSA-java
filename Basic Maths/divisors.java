import java.util.Arrays;
import java.util.ArrayList;
public class divisors 
{
    public static void main(String[] args) 
    {
        int n1=6;
        int n2=10;
        Methods m=new Methods();
        m.witharr(n1);
        m.usingarrlist(n2);
    }
}
class Methods
{
    void witharr(int n1)
    {//using arrays
        int arr1[]=new int[n1];
        int index=0;
        for(int i=1;i<=n1;i++)
        {
            if(n1%i==0)
            {
                arr1[index]=i;
                index++;
            }
        }
        /*since we have a foxed size array of size 6 , it will
        return 1,2,3,6,0,0 . we do not want those extra 0s 
        so we make a copy of the array of required size only*/
        int copyarr1[]=Arrays.copyOf(arr1,index);      
        System.out.println("Factors of "+n1+Arrays.toString(copyarr1));
            
    }
    void usingarrlist(int n2)
    {
        //using arraylist - variable size so no extra 0s in output
        ArrayList<Integer> divlist=new ArrayList<>();
        for(int i=1;i<=n2;i++)
        {
            if(n2%i==0)
            {
                divlist.add(i);
            }
        } 
        System.out.println("Factors of "+n2+divlist);
    }
}
/*
Factors of 6[1, 2, 3, 6]
Factors of 10[1, 2, 5, 10]
*/
