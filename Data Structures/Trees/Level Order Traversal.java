 /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) {
      
       Queue<Node> queue = new LinkedList<Node>();
       
       Node tmp = root;
       
       while(tmp != null){
           System.out.print(tmp.data + " ");
           
           if(tmp.left != null)
               queue.add(tmp.left);
           if(tmp.right != null)
               queue.add(tmp.right);
           
           tmp = queue.poll();
       }
      
    }
