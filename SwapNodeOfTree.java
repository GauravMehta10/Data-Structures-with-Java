public static void swap_nodes(Node root, int K){
        if (root != null){
            if (root.depth%K == 0){
                Node tmp = root.left;
                root.left = root.right;
                root.right = tmp;
            }
            swap_nodes(root.left, K);
            swap_nodes(root.right, K);
        }
    }