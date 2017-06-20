/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
    
    Node curr = head;
    Node follower = null;
    
	// iterate if the list is not null and does not only have one node
    while(curr != null && curr.next != null){
        if(curr.data == curr.next.data){
            follower = curr.next.next;
            curr.next = follower;
        }
        else{
             curr = curr.next;
        }
    }
    
    return head;
  

}
