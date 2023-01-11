class MethodArgs
{
    public static void GetNames(String...names)
    {
        for(String name:names)
        {
            System.out.println(name);
        }
    }
    public static void main(String args[])
    {
        GetNames("ram","sita","nandha");
    }
}