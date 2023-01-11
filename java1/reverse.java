class reverse{
    public static void main(String args[])
    {
        StringBuilder a = new StringBuilder("my name is tng");
        StringBuilder b = new StringBuilder();
        a.reverse();
        System.out.println(a);

        for(int i=a.length()-1;i>=0;i--)
        {
            b.append(a.charAt(i));
        }
        System.out.println(b);

    }
}