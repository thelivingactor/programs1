import java.util.Scanner;

public class pprog3 {
    /*int values (){
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    scanner.close();
    return num;
    }*/
    static int value (int num)
{
    int rem,sum=0;
    while (num>0){
    rem=num%10;
    num=num/10;
    sum +=rem;
    }
    return sum;
}
    public static void main(String args[])
    {
       int x = value(1234);
       x=value(5555);
       System.out.println(x);
    }
    
}
