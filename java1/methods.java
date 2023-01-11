class function
{
    public void add()
    {
        int a=5;
        int b=10;
        System.out.println(""+(a+b));
    }

public void sub(int x,int y)
{
    System.out.println(""+(x+y));
}
public int mul()
{
   int a=23;
    int b=24;
    return (a*b);
}
public float div(float x,float y)
{
return (x/y);
}
public int factoriol(int n)
{
    if(n==1)
    {
        return 1;
    }
    else 
    {
        return(n*factoriol(n-1));
    }
}
}

public class methods
{
    public static void main(String args[])
    {
        function o = new function();
        o.add();
        o.sub(5,6);
        System.out.println(""+o.mul());
        System.out.println(""+o.div(10,5));
        System.out.println("" +o.factoriol(5));
    }
}