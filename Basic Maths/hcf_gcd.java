
/*highest common factor
eg] 12 and 42 - 6 
eg] 12 and 36 - 12

*/
public class hcf_gcd 
{
    public static void main(String[] args) 
    {
        int n1=42;
        int n2=36;
        int min=Math.min(n1,n2);
        //int max=Math.max(n1,n2);
        if(n2%n1==0 || n1%n2==0)
        {
            System.out.println("HCF:"+min);
            return;
        }
        int comp=1;//current highest factor before evaluating
        for(int i=1;i<min;i++)
        {
            if (n1%i==0 && n2%i==0)
            {                
                if(i>comp)
                {                    
                    comp=i;//new highest factor
                }     
                
            }            
        }
        System.out.println("HCF:"+comp);
        
    }
}
/*
int n1=12;
int n2=42;
HCF:6

int n1=12;
int n2=36;
HCF:12

*/
