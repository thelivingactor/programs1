class outer
{
    final static int a=25;
    class inner
    {
        int b =35;
        void innerdisplay()
        {
            System.out.println(""+b);
            System.out.println(""+a);
        }
    } 
    public static void outerdisplay()
    {
        //inner o1 = new inner();
        //o1.innerdisplay();
        System.out.println(""+a);
        //System.out.println(""+o1.b);
    }
}
class NestedClass
{
    public static void main(String args[])
    {
        outer.inner o= new outer().new inner();
        o.innerdisplay();
        //outer o2 = new outer();
        //o2.outerdisplay();
        outer.outerdisplay();
    }
}