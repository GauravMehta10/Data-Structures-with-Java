 public static void inOrder(Node root){
         Deque<Node> stack = new ArrayDeque<Node>();
    while(!stack.isEmpty() || root!=null){
        if(root!=null){
            stack.push(root);
            root = root.left;
        }else{
            root = stack.pop();
            System.out.print(root.data+" ");
            root = root.right;
        }
    }
    }