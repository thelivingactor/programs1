import java.util.Scanner;
class switch_demo
{
    public static void main(String args[])
    {
        int a,b,c,ch;
        Scanner in =new Scanner(System.in);
        ch=in.nextInt();
        a=in.nextInt();
        b=in.nextInt();
        switch(ch)
        {
        case 1:
        c=a+b;
        System.out.println("the sum is"+c);
        break;
        case 2:
        c=a-b;
        System.out.println("the diff is"+c);
        break;
        case 3:
        c=a*b;
        System.out.println("the mul is"+c);
        break;
        case 4:
        c=a/b;
        System.out.println("the div is"+c);
        break;
        default:
        System.out.println("invalid selection");
        break;
        }

    }
}