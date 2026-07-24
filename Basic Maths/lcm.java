/*
lcm of 2 numbers is least common mu;tiple 
eg] 4 and 6 - 12
eg] 4 and 12 - 12
*/
class lcm
{
    public static void main(String[] args) 
    {
        int n1=36;
        int n2=12;
        int ans=Math.max(n1,n2);/*assuming that the bigger 
        number is the lcm of both*/
        while(true)
        {
            if(ans%n1==0 && ans%n2==0)
            {
                System.out.println("LCM:"+ans);
                break;
            }
            ans++;/*else increment answer to go onto next number
        eventually it will reach to the lcm*/
        }
    }
}/*
int n1=42;
int n2=12;
LCM:84

int n1=36;
int n2=12;
LCM:36
*/