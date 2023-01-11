import java.util.Scanner;
class sum_avg
{
    public static void main(String args[])
    {
        int n,i,c=05,a;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            a=in.nextInt();
            c=c+a;
        }
       
        System.out.println("sum of n nmunbers is"+c);
        System.out.println("the average of n numbers is"+(c/n));
    }
}