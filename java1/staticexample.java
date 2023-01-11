class mathematic
{
    public static int power(int base,int power)
    {
        int result =1;
        for(int i=0;i<power;i++)
        {
            result*=base;
        }
        return result;

    }
}
    class staticexample
    {
public static void main(String args[])
{
    System.out.println(""+mathematic.power(3,3));
}
}