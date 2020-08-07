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
    
  static  LinkedList reverse(LinkedList list)
  {
            
 Node preNode = null;
 Node currNode = list.head;
 Node nextNode = null;
     
    while (currNode != null)
    {
         nextNode = currNode.next;
          currNode.next = preNode;
          preNode = currNode;
        currNode = nextNode;
    }
    
    list.head = preNode;
    
    return list;
    
    
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
           list= list.reverse(list); 
           list.Print(list.head);
           System.out.println();
    }
    }
