import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Mergesort{
    void merge(int ar[],int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++)
        L[i]=ar[l+i];
        for(int j=0;j<n2;j++)
        R[j]=ar[m+1+j];
     int i=0;int j=0;
     int k=l;
        while(i<n1 && j<n2){
              if(L[i]<=R[j])
              {
                  ar[k]=L[i];
                  i++;
              }
              else{
                  ar[k]=R[j];
                  j++;
              }
              k++;
        }
        while(i<n1){
            ar[k]=L[i];
            i++;
            k++;

        }
        while(j<n2){
            ar[k]=R[j];
            j++;
            k++;
        }

    }
    void sort(int ar[],int l,int r){
        if(l<r){
        int m=(l+r)/2;
     sort(ar,l,m);
     sort(ar,m+1,r);
       merge(ar,l,m,r);
    }
    }
    void printARR(int ar[])
    {
       int n = ar.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(ar[i] + " "); 
        System.out.println(); 
    }
}
class Main
{
    public static void main(String[] args)
    {
       int ar[]={3,4,6,1,2,10,8};
       Mergesort ob=new Mergesort();
       System.out.println("Given Array"); 
       ob.printARR(ar); 
       ob.sort(ar,0,ar.length-1);
       System.out.println("\nSorted array"); 
       ob.printARR(ar); 


    }
    }