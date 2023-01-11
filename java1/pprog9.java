class pprog9
{
    public static void main(String bargs[])
    {
    int sequence[] ={40,50,60,10,20,30};
    int count1 =0,count2=0;
    for(int i=0;i<sequence.length;i++)
    {
        
        for(int j=i+1;j<sequence.length;j++)
        {
            System.out.println(sequence[i]+" "+sequence[j]);
            if(sequence[i]>sequence[j])
            {
                count2++;
            }
            System.out.println(count2);
            else if(sequence[i]==sequence[j])
            {
                count1++;
                
            }
        }
       
    }
    System.out.println(count1);
    System.out.println(count2);
    }
}       