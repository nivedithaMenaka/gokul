import java.util.*;
import java.io.*;
public class LeapYearOrNot
{
  
  public static void main(String args[])throws IOException
  {
    
 
    int a;
     // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     Scanner s=new Scanner(System.in);
          a=s.nextInt();
          if(a%4==0|| a%400==0)
              System.out.println(a+" is a leap year");
  else
      System.out.println(a+" is not a leap year"); 
   }
   }
