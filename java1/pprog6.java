class pprog6{
 int i;
boolean solution(String inputString) {
    if(inputString.length()==1)
    {
        return true;
    }
    for(i=0;i<(inputString.length())/2;i++)
    {
    if(inputString.charAt(0+i)!=(inputString.charAt(inputString.length()-i-1)))
    {
    return false;
    }
    }
    return true;
    }
public static void main(String args[]){
pprog6 s = new pprog6();

System.out.println(s.solution("aaa"));
}

}