import java.util.*;
class CountryMap
{
    Map<String,String> M1=new HashMap<String,String>();
     Map<String,String> M2=new HashMap<String,String>();


    public Map<String,String> storeCountryCapital(String countryName, String capital)
      {
           M1.put(countryName,capital);
        return M1;
      }


      public String  retrieveCapital(String CountryName)
      {
         Set s=M1.entrySet();
         Iterator itr=s.iterator();
         while(itr.hasNext())
         {
            Map.Entry m=(Map.Entry)itr.next();
            if(m.getKey().equals(CountryName))
              return (String)m.getValue();
         }
       return null;
      }


     public String  retrieveCountry(String captial)
      {
         Set s=M1.entrySet();
         Iterator itr=s.iterator();
         while(itr.hasNext())
         {
            Map.Entry m=(Map.Entry)itr.next();
            if(m.getValue().equals(captial))
              return (String)m.getKey();
         }
       return null;
      }


     public Map<String,String>  swapCountryCaptial()
      {
         Set s=M1.entrySet();
         Iterator itr=s.iterator();
         while(itr.hasNext())
         {
            Map.Entry m=(Map.Entry)itr.next();
           M2.put((String)m.getValue(),(String)m.getKey());
         }
       return M2;
      }
}


public class CountryMapDemo
{
     public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Choose below options");
    CountryMap cm=new CountryMap();

//Reading country and captialValues
     while(true)
     {
          System.out.println("1. add countryName and captial to the list\n2.exit to the list");
          int n=sc.nextInt(); sc.nextLine();
          if(n==1)
            cm.storeCountryCapital(sc.nextLine(),sc.nextLine());
         else break;
     }

      System.out.println();
      System.out.println(cm.M1);
      
      System.out.println("Swaping countries and capitals\n");
      System.out.println(cm.swapCountryCaptial());


     System.out.println("Enter country name to get captial");
     String name = sc.nextLine();
     System.out.println(cm.retrieveCapital(name));
       
      System.out.println("Enter captial name to get CountryName");
      String name1= sc.nextLine();
      System.out.println(cm.retrieveCountry(name1));
   }
}