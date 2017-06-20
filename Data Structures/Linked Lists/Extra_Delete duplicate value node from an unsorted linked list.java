// I wrote an extra method which is not in the questions
// This method remove the duplicate nodes from unsorted linked list
// This method uses extra memory

// Time: O(n)
// Space: O(n)

// Assume that head is not null
public Node RemoveDupFromUnSortedLL(Node head) {

	Node tmp = head;
	Node prev = null;

	HashSet<Integer> nodeVal = new HashSet<Integer>();

	while (tmp != null) {
		if (nodeVal.contains(tmp.data)) {
			prev.next = tmp.next;
		} else {
			nodeVal.add(tmp.data);
			prev = tmp;
		}

		tmp = tmp.next;
	}

	return head;
}