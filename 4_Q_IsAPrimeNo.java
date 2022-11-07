import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       int t = scn.nextInt() ;
       
       for (int i=1 ; i<=t ; i++)
       {
           int n = scn.nextInt() ;
           int count = 0 ;
           for (int a=1 ; a<=n ; a++)
           {
               if (n%a == 0)
               {
                   count+=1 ;
               }
           }
           if (count > 2)
           {
               System.out.println("not prime") ;
           }
           else
           {
               System.out.println("prime") ;
           }
       }
   }
  }
