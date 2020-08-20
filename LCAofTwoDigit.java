public static Node lca(Node n, int v1, int v2) {
      	// Write your code here.
           while (n != null) {
        if (n.data > v1 && n.data > v2) {
            n = n.left;
        } else if (n.data < v1 && n.data < v2) {
            n = n.right;
        } else {
            break;
        } 
    }
    return n;