static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode cur=head;

 if (head == null) {
        return null;
    }
    
    if (head.next == null) {
        return head;
    }
            
   DoublyLinkedListNode preNode = null;
    DoublyLinkedListNode currNode = head;
    DoublyLinkedListNode nextNode = null;
     
    while (currNode != null) {
        nextNode = currNode.next;
        currNode.next = preNode;
        preNode = currNode;
        currNode = nextNode;
    }
    
    head = preNode;
    
    return head;

    }