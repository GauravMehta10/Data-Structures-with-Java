import java.util.*;
class Main
 {
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     int test = sc.nextInt();
	     while(test-- >0)
	     {
	         int c=0;
	         int m = sc.nextInt();
	         int n = sc.nextInt();
	         HashSet<Integer> hs = new HashSet<>();
	         int a[] = new int[m];
	         int b[] = new int[n];
	         
	         for(int i=0;i<m;i++)
	         {
	             a[i] = sc.nextInt();
	         }
	         
	         for(int i=0;i<n;i++)
	         {
	             b[i] = sc.nextInt();
	         }
	         
	         for(int i=0;i<m;i++)
	         {
	             hs.add(a[i]);
	         }
	         
	         for(int j=0;j<n;j++)
	         {
	             if(hs.contains(b[j]))
	             {
	                 c++;
	                 hs.remove(b[j]);
	             }
	         }
	         System.out.println(c);
	     }
	 }
}