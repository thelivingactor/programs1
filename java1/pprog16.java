class pprog16
{
	public static int fact(int n)
	{
		if(n==1 || n==0)
		{
			return 1;
		}
		else
		{
			return n * fact(n-1);
		}
	}
	public static void main(String args[])
	{
		pprog16 a = new pprog16();
		//var rec = pprog16.fact(4);	
		System.out.println(pprog16.fact(4));
	}
}