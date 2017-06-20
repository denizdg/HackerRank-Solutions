/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
        Node tmpA = headA;
		Node tmpB = headB;
		
		if(tmpA ==  null && tmpB == null)
			return 1;
		if(tmpA == null && tmpB != null || tmpA != null && tmpB == null)
			return 0;
		
		while(tmpA != null){
			if(tmpA.data != tmpB.data || tmpB == null){
		        return 0;
		    }
			tmpA = tmpA.next;
			tmpB = tmpB.next;
		}
		
		if(tmpB != null)
			return 0;
		
		return 1;
    
  
}