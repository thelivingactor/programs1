class Pownum
{
	public int power(int base,int exp)
	{
		if(exp ==0)
		{
			return 1;
		}
		else
		{
			return base* power(base,exp-1);
		}
	}


	public static void main(String args[])
	{
		Pownum p = new Pownum();
		System.out.println(p.power(5,0));
	}
}