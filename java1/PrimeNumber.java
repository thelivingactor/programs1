import java.util.Scanner;
public class PrimeNumber {
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scanner.nextInt();
        int i=2,rem;
        while(i<n)
        {
            rem=n%i;
            if(rem==0)
            {
                System.out.println("the number is not a prime number");
                break;
            }
            else
            {
                System.out.println("the number is prime number");
                break;
            }
        }
    }
}
