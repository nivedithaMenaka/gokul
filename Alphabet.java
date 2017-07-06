import java.util.*;
import java.io.*;
public class Alphabet
{
  
  public static void main(String args[])throws IOException
  {
    
    char a1;
    int i=0,c=0;
     // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     Scanner s=new Scanner(System.in);
          a1=s.next().charAt(0);
          if(a1>='a'&&a1<='z')
          {
            
    
    //System.out.println(j);
    c++;
    } 
    if(c!=0)
    System.out.println(a1+ " is a Alphabet");
else 
System.out.println(a1+" is not a alphabet");
       
   }
   }
