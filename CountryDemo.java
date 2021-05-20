import java.util.*;
class Country
{
    Set<String> H1=new HashSet<String>();
    public Set<String> storeCountryNames(String countryName)
    {
         H1.add(countryName);
         return H1;
    }
    public String  retrieveCountry(String CountryName)
    {
      for(String s:H1)
       {
         if(s.equals(CountryName))
             return s;
       }
     return null;
    }
}
class CountryDemo
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
    System.out.println("Choose below options");
    Country c=new Country();
     while(true)
     {
          System.out.println("1. add countryName to the list    2.exit to the list");
          int n=sc.nextInt(); sc.nextLine();
          if(n==1)
          {
            
            c.storeCountryNames(sc.nextLine());
          }
         else break;
     }
      System.out.println(c.H1);
      System.out.println("Enter country name which you want search in list");
     String name = sc.nextLine();

    if(c.retrieveCountry(name)!=null)
      System.out.println("present in List "+ name);
     else
         System.out.println("NOT Present in List "+ null);
   }
}