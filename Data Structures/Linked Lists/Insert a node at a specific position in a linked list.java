/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
    
   Node newNode =  new Node();
	    newNode.data = data;
	    newNode.next = head;
	    
	    if(head == null)
	        return newNode;
	    
        if(position == 0){
	    	return newNode;
	    }
	    
	    int count = 0;
	    Node tmp = head;
	    Node prev = null;
	    
	    while(tmp != null){
	        prev = tmp;
	        tmp = tmp.next;
	        count++;
	        if(count == position){
	            newNode.next = tmp;
	            prev.next = newNode;  
                break;
	        }
	        
	    }
	    
	    return head;
  
}
