import java.util.Scanner;
public class pattern1 {
    public static void main(String args[])
    {
    Scanner a = new Scanner(System.in);
    System.out.println("enter the number");
    int n = a.nextInt();
    int i,j;
    for(i=1;i<=n;i++)
    {
        for(j=n;j>i;j--)
        {
            System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
        
            System.out.print(n);
            
            
        }
        System.out.println();
    }
    }
}
