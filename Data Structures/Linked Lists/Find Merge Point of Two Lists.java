/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
   
   // Algorithm:
		// 1. Find the length of the lists
		// 2. Find the absolute difference of the lengths diff = |lengthA - lengthB|
		// 3. Move the pointer on the longer list to as many as the difference
		// 4. Then move step by step on each list till the pointers have the same data value
		
		
		Node tmpA = headA;
		Node tmpB = headB;
		
		Node pointerA = headA;
		Node pointerB = headB;
		
		int lengthA = 0;
		int lengthB = 0;
		int diff = 0;
		
		while(tmpA != null){
			lengthA++;
			tmpA = tmpA.next;
		}
		
		while(tmpB != null){
			lengthB++;
			tmpB = tmpB.next;
		}
		
		diff = Math.abs(lengthA - lengthB);
		
		if(lengthA >= lengthB)
			for (int i = 0; i < diff; i++)
				pointerA = pointerA.next;
		else
			for (int i = 0; i < diff; i++)
				pointerB = pointerB.next;
			
		while(pointerA.data != pointerB.data){
			pointerA = pointerA.next;
			pointerB = pointerB.next;
		}
		
		return pointerB.data;

}
