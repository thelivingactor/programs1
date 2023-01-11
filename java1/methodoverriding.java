class user
{
    String name;
    int age;
    user(int x,String y)
    {
        this.age=x;
        this.name=y;
    }
    public void display()
    {        
        System.out.println(""+age);
        System.out.println(""+name);
    }
}
class mainprogramer extends user
{
    String companyname;
    mainprogramer(int x,String y,String c)
    {
    super(x,y);
    this.companyname = c;
    }
    public void display()
    {        
        System.out.println(""+age);
        System.out.println(""+name);
        System.out.println(""+companyname);
    }
}

class methodoverriding
{
    public static void main(String args[])
{
    mainprogramer o= new mainprogramer(24,"nandha","legends");
    o.display();
}
}