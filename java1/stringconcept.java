class stringconcept
{
    public static void main(String args[])
    {
    String a = "tutor joes";
    String b = "tutor joes";
    System.out.println(""+a);
    System.out.println(""+b);
    System.out.println(""+a.hashCode());
    System.out.println(""+b.hashCode());
    System.out.println(""+b.length());
    System.out.println(""+b.equals(a));
    System.out.println(""+b.equalsIgnoreCase(a));
    System.out.println(""+b.charAt(0));
    System.out.println(""+b.toUpperCase());
    System.out.println(""+b.toLowerCase());
    System.out.println(""+b.substring(5));
    System.out.println(""+b.startsWith("tutor"));
    System.out.println(""+b.endsWith("joes"));
    System.out.println(""+b.isEmpty());
    System.out.println(""+b.contains("tutor"));
    System.out.println(""+b.trim());
    System.out.println(""+a.replace("tutor","mayiru"));
    char[] c = a.toCharArray();
    for(char d:c)
   {
    System.out.println(""+d);
   } 




    



    

    
    
    
    
    
    
    
    
    }

}