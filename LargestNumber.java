import java.util.*;
import java.io.*;
public class LargestNumber
{
  
  public static void main(String args[])throws IOException
  {
    
 
    int a,b,c;
     // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     Scanner s=new Scanner(System.in);
          a=s.nextInt();
          b=s.nextInt();
          c=s.nextInt();
          if(a>b&&a>c)
    System.out.println(a+ " is the largest number");
else if(b>a&&b>c)
System.out.println(b+" is the largest number");
  else
      System.out.println(c+ " is the largest number"); 
   }
   }
