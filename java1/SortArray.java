class SortArray
{
	public static void main (String args[])
	{
		int arr[]={1,2,4,3,4,5,6,7};
		for(int i=0;i<arr.length-1;i++)
		{
			if((i>=2)&&(i<arr.length))
			{
				arr[i]=arr[i+1];

			}

		}
		arr[7]=0;
	}
}