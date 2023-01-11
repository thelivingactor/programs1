class rect
{
    int length,width;
    void getdetails(int x,int y)
    {
        length=x;
        width=y;
    }

    int area()
    {
        int a = length*width;
        return a;
    }

}
public class rectangle
{
    public static void main(String args[])
    {
        rect o1=new rect();
        rect o2=new rect();
        o2.length =10;
        o2.width=15;
        o1.getdetails(2,2);
        System.out.println(""+o1.area());
        System.out.println(""+o2.area());

    }
}