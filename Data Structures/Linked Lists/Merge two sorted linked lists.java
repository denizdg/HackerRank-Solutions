/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) {
    
		Node tmpA = headA;
		Node tmpB = headB;

		Node mergedList = null;
		
		Node newHead = null;

		if (tmpA == null)
			return headB;
		if (tmpB == null)
			return headA;
		
		if(tmpA.data <= tmpB.data){
			newHead = tmpA;
			tmpA = tmpA.next;
		}
		else{
			newHead = tmpB;
			tmpB = tmpB.next;
		}
		
		mergedList = newHead;
		
		while(tmpA != null && tmpB != null){
			if(tmpA.data <= tmpB.data){
				mergedList.next = tmpA;
				tmpA = tmpA.next;
			}
			else{
				mergedList.next = tmpB;
				tmpB = tmpB.next;
			}
            
            mergedList = mergedList.next;
		}
		
		if(tmpB == null)
			mergedList.next = tmpA;
		else
			mergedList.next = tmpB;

		return newHead;

}
