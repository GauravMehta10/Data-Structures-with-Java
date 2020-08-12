 static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {

DoublyLinkedListNode n = new DoublyLinkedListNode(data);
    
    if (head == null) {
        return n;
    }
    else if (data <= head.data) {
        n.next = head;
        head.prev = n;
        return n;
    }
    else {
        DoublyLinkedListNode rest = sortedInsert(head.next, data);
        head.next = rest;
        rest.prev = head;
        return head;
    }
    }
