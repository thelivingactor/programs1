class Sumdigits
{
	public int sumOfDigits(int n)
	{
		if(n>=0 && n<10)
		{
			return n;
		}
		else
		{
			return (n%10)+sumOfDigits(n/10);
		}
	}


	public static void main(String args[])
	{
		Sumdigits s = new Sumdigits();
		System.out.println(s.sumOfDigits(10));
	}
}