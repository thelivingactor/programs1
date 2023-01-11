class stringbuffer
{
    public static void main(String args[])
    {
      StringBuffer a = new StringBuffer("nandha");
      System.out.println(a);
      a.append(" gopal");
      a.insert(12," llegend");
      System.out.println(a);
      a.replace(12,14,"   ");
      System.out.println(a);
      a.insert(12,"   ");
      System.out.println(a);
      a.delete(12,17);
      System.out.println(a);
      a.reverse();
      System.out.println(a);
      a.setCharAt(0,'p');
    
      System.out.println(a);
    }
}