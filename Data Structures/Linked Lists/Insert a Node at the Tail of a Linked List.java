/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {

    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;
    
    if(head == null){
        return newNode;
    }
    
    Node tmp = head;
    while(tmp.next != null){
        tmp = tmp.next;
    }   
    tmp.next = newNode;
        
    return head;
        
  
}