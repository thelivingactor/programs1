public class pprog5 {
    static boolean twodignum(int num)
    {
        if(num>9&&num<100)
        return true;
        else 
        return false;
    }
    public static void main(String args[])
    {
        boolean s = twodignum(22);
        System.out.println(s);
    }
    
}
