import java.util.*;
class Main 
{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0)
		{
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
		 while (i < n-1 && arr[i] == arr[i+1])
		 {
          i++;
		 }
		 sum=sum+arr[i];
		}

		System.out.println(sum);
	}
	System.out.println();
}
}