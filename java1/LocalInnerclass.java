class outercls
{
    void display()
    {
        class LocalInnerclass
        {
            void innerdisplay()
            {
                System.out.println("inner display");
            }
        }
        LocalInnerclass o = new LocalInnerclass();
        o.innerdisplay();
    }
}
class LocalInnerclass
{
    public static void main(String args[])
    {
        outercls o2 = new outercls();
        o2.display();
    }
}