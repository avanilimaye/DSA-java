
public class secondhighest 
{
    public static void main(String[] args) 
    {
        int arr[]={9,9,9,9,9,8,8,8,8,7,7,7};
        int n=arr.length;
        int arrmax=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arrmax)
            {
                arrmax=arr[i];
            }
        }

        int hash[]=new int[arrmax+1];
        for(int i=0;i<n;i++)
        {
            int a =arr[i];
            hash[a]++;
        }
    
    int highestfreq=0;
    int highestelement=0;
    int secondhighest=0;
    int secondfreq=0;
    for(int j=0;j<hash.length;j++)
    {
        if(hash[j]>highestfreq)
        {
            secondfreq=highestfreq;
            secondhighest=highestelement;

            highestfreq=hash[j];
            highestelement=j;
        }
        else if(hash[j]>secondhighest && hash[j]<highestfreq)
        {
            secondfreq=hash[j];
            secondhighest=j;
        }
        if (secondhighest == 0)
        {
              //return -1;
              System.out.println("-1");
              /*in cases where array may be consisiting 
              of a single element*/
        }
    }
    System.out.println("second highest element:"+secondhighest);
    System.out.println("its frequency:"+secondfreq);
}
}
/*
int arr[]={9,9,9,9,9,8,8,8,8,7,7,7};
second highest element:8
its frequency:4
*/