/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head,int data) {
        Node newNode = new Node();
		newNode.data = data;

		if (head == null)
			return newNode;

		else if (head.data >= data) {
			newNode.next = head;
			head.prev = newNode;
			return newNode;
		} else {

			Node curr = head;
			Node prev = null;

			while (curr != null && curr.data < data) {
				prev = curr;
				curr = curr.next;
			}

			if (curr == null) { // insert to the last node
				prev.next = newNode;
				newNode.prev = prev;
				newNode.next = null;
			} else {

				newNode.next = curr;
				curr.prev = newNode;
				prev.next = newNode;
				newNode.prev = prev;
			}
			return head;
		}
}
