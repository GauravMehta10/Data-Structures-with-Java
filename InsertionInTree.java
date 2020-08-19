public static Node insert(Node root,int data) {

    	if(root==null)
  {
     Node node=new Node(data);
     
     node.left=null;
     node.right=null;
     root=node;
 }
 else if(root.data>data)
      root.left=insert(root.left,data);
  else if(root.data<data)
      root.right=insert(root.right,data);

  return root;
    }