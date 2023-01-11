class upper
{
    public static void main(String args[])
    {
        StringBuffer a = new StringBuffer(" boy");
        for(int i =0;i<a.length();i++)
        {
            if(a.charAt(i)>=97 && a.charAt(i)<=122)
            {
                int b = (int)a.charAt(i)-32;
                a.setCharAt(i,(char)b);
            }
        }
        System.out.println("upper :"+a);
    }

}