class pprog8
{
    public static void main(String []args) {
        int statues[]={2,3,6,8};
        int sum =0,small=0,big=0,count =0;
        for(int i=0;i<statues.length;i++)
        {
            sum +=statues[i];
        }
        outer:
        for(int i=0;i<=sum;i++)
        {
            for(int j=0;j<statues.length;j++)
            {
                if(i==statues[j])
                {
                   small=i;
                   System.out.println(small);
                   break outer; 
                }
            }
        }
        out:
        for(int i=sum;i>0;i--)
        {
            for(int j=0;j<statues.length;j++)
            {
                if(i==statues[j])
                {
                   big=i;
                   System.out.println(big);
                   break out; 
                }
            }
        }
        for(int i=small;i<=big;i++)
        {
            count++;
        }
        System.out.println(count);
        System.out.println(count-statues.length);
        //return (statues.length)-count;
    
    }
    
}