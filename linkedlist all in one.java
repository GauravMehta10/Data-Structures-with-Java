import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class LinkedList {
    Node head;
   static class Node{
       int data;
       Node next;
       Node(int d) {
              data=d;
              next=null;
       }
   }
   public static LinkedList insert(LinkedList list,int data)
   {
       Node neW=new Node(data);
       if(list.head==null)
       {
           list.head=neW;
       }
       else{
           Node last=list.head;
           while(last.next!=null){
               last=last.next;
           }
           last.next=neW;
       }
       return list;
   }
   public void Print(Node head){
       Node cur=head;
       while(cur!=null)
       {
           System.out.println(cur.data);
           cur=cur.next;
       }
   }
   public void insertAt(int ind,int data){
       Node neW=new Node(data);
       Node cur=head;
       if(ind==0){
           neW.next=head;
           head=neW;
       }
       else{
           for(int i=0;i<ind-1;i++){
               cur=cur.next;
           }
           neW.next=cur.next;
           cur.next=neW;
       }
   }
    public void last(int data){
        Node neW=new Node(data);
        Node curr=head;
       while(curr.next!=null)
        {
      curr=curr.next;
        }
        curr.next=neW;
    }
    public void deleteAt(int ind){
       
        Node cur=head;
        Node prev=null;
        if(ind==0){
            head=head.next;
        }
        else{
            for(int i=0;i<ind;i++)
            {
                prev=cur;
                cur=cur.next;
            }
            prev.next=cur.next;

        }
    }
    public void deleteBy(int data){
        Node neW=new Node(data);
        Node cur=head,prev=null;
         if(cur!=null && cur.data==data){
             head=cur.next;
         }
        else{
         while(cur!=null && cur.data!=data){
             prev=cur;
             cur=cur.next;
         }
         if(cur!=null)
         {
            prev.next=cur.next;
         }
        }
         if(cur==null)
         {
             System.out.println();
             System.out.println(data+"-Key not Present");
         }
         
    }
}
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
        LinkedList list=new LinkedList();
        list=list.insert(list,11);
        list=list.insert(list,22);
        list=list.insert(list,33);
        list.Print(list.head);
        list.insertAt(1,12);
        System.out.println();
        list.Print(list.head);
        list.last(44);
         System.out.println();
        list.Print(list.head);
        list.deleteAt(4);
        System.out.println();
        list.Print(list.head);
        list.deleteBy(11);
        System.out.println();
        list.Print(list.head);


    }
    }