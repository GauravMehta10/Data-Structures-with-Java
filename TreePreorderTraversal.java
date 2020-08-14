public static void preOrder(Node root) {
Node pre;
    if(root == null)
        return;
    Node curr = root;
    while(curr != null){
        if(curr.left == null){
            System.out.print(curr.data+" ");
            curr = curr.right;
        }else{
             pre = curr.left;
             while(pre.right !=null && pre.right != curr)
                 pre = pre.right;
             if(pre.right == null){
                 pre.right = curr;
                 System.out.print(curr.data+" ");
                 curr = curr.left;
             }else{
                 pre.right=null;
                 curr=curr.right;
             }
        }
    }
    }