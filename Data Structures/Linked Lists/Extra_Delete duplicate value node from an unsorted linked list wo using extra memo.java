// I wrote an extra method which is not in the questions
// This method remove the duplicate nodes from unsorted linked list
// This method does not use extra memory

// Time: O(n ^ 2)
// Space: O(1)

public Node RemoveDupFromUnSortedLLWithNoExtraMemo(Node head) {

		Node tmp = head;

		while (tmp != null) {
			Node curr = tmp;
			while (curr.next != null) {
				if (curr.next.data == tmp.data) {
					curr.next = curr.next.next;
				} else {
					curr = curr.next;
				}
			}

			tmp = tmp.next;
		}

		return head;
	}