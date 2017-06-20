/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  
    if(head.next == null){
        head = null;
        return null;
    }
    
    if(position == 0){
        head = head.next;
    }
    
    int count = 0;
    Node tmp = head;
    Node prev = null;
    
    while(tmp != null){
        prev = tmp;
        tmp = tmp.next;
        count++;
        
        if(count == position){
            prev.next = tmp.next;
        }
        
    }
    
    return head;

}
