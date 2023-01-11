class pprog7
{
    int solution(int[] inputArray) {
        int great = Integer.MIN_VALUE;
       for(int i=0;i<inputArray.length-1;i++)
       {
          int mul =inputArray[i]*inputArray[i+1];
           
           if(great<mul)
           {
               great =mul;
               
           }
       }
       return great;
   
   }
   public static void main(String args[])
   {
    pprog7 o = new pprog7();
    int arr[]={1,-2,-3,-4,5};
    System.out.println(o.solution(arr));
   }
}