public class Solution {
    public static void main(String[] args) {
        Scanner nd=new Scanner(System.in);

        int n = nd.nextInt();

        int d = nd.nextInt();

        int[] a = new int[n];
    
  for(int i=0; i<n;i++) {
            a[(i+n-d)%n] = nd.nextInt();
      }
        for(int i=0; i<n;i++) {
            System.out.print(a[i] + " ");
        }   
        
    }
}
