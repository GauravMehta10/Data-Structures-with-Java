import java.util.Scanner;
class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
         Node(int d){
            data=d;
            next=null;
        }
    }
    public static LinkedList insert(LinkedList list,int data){
        Node New=new Node(data);
        if(list.head==null)
        {
            list.head=New;
        }
        else{
            Node last=list.head;
            while(last.next!=null)
            {
                last=last.next;

            }
            last.next=New;
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
    
  static  int getnode (LinkedList list,int n)
  {
            
 Node preNode = null;
 Node cur = list.head;
 Node nex= list.head;
     for(int i=0;i<n;i++)
     {
         cur=cur.next;
     }
     while(cur.next!=null)
     {
         cur=cur.next;
         nex=nex.next;
     }
     return nex.data;
    
}
}
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
        LinkedList list=new LinkedList();
        list=list.insert(list,1);
         list=list.insert(list,2);
          list=list.insert(list,3);
           list=list.insert(list,4);
           list.Print(list.head);
           System.out.println();
         int result  =list.getnode(list,1); 
           System.out.println(result);
           System.out.println();
    }
    }
