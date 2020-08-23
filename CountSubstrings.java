import java.util.*;
class Main
 {
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     int test = sc.nextInt();
	     while(test-- > 0)
	     {
	         String s = sc.next();
	         int c=0;
	         for(int i=0;i<s.length();i++)
	         {
	             if(s.charAt(i)=='1')
	             { c++; }
	         }
	         c = (c*(c-1))/2; // Formula....
	         System.out.println(c);
	     }
	 }
}