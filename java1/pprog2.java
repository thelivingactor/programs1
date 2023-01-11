import java.util.Scanner;

public class pprog2 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of elements in the array");
        int n = scanner.nextInt();
        int a[]=new int [n];
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
            sum1=sum1+a[i];
        }
        for(int i=1;i<a.length+1;i++)
        {
            sum2+=i;
        
        }
        System.out.println(""+(sum2-sum1));
    }
    
}
