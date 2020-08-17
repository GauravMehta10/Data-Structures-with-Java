public static void topView(Node root) {
      
      TreeMap<Integer,Node> tm= new TreeMap<Integer,Node>();
        Map<Node,Integer> hm= new LinkedHashMap<Node,Integer>();
        
        if(root!=null)
            hm.put(root,0);
        while(!hm.isEmpty())
        {
            Node nd=(Node)hm.keySet().toArray()[0];
            int hd=hm.get(nd);
            
            hm.remove(nd);
            
            if(!tm.containsKey(hd)) 
                tm.put(hd,nd);
            
            if (nd.left != null)
                hm.put(nd.left,hd-1);
            if (nd.right != null)
                hm.put(nd.right,hd+1);
        }
        
        for(Node n:tm.values())
        {
            System.out.print(n.data+" ");
        }
 
    }