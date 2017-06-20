/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
    Node current = head;
    Node follower = head;
    
	// question guarantees that n does not exceed the list
    for(int i = 0; i < n; i++){
        current = current.next;
    }
    
    while(current.next != null){
        current = current.next;
        follower = follower.next;
    }
    
    return follower.data;


}