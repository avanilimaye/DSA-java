//package Basic Maths;

public class digitcount 
{
    public static void main(String[] args) 
    {
        //count number of ndigits in n
        //convert to string and do stringlength
        int n=123456789;
        String num=Integer.toString(n);
        int count=num.length();
        System.out.println("String length:"+count);
    }  
}
/*
String length:9
 */
