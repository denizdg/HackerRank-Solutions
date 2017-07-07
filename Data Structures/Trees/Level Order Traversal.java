 /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
  /*
		Algorithm:
			1) Create an empty Node queue
			2) Create a temp node and assign root node to it
			3) Loop through the temp node will be null
				a. print temp data
				b. enqueue temp's children from left to right to the queue
				c. dequeue the beginning node (remember: queue is FIFO) and assign it to the temp node
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
