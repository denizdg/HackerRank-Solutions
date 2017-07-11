
 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */
	
	// Comments are from --> http://www.geeksforgeeks.org/lowest-common-ancestor-binary-tree-set-1/
	
	// This function returns pointer to LCA of two given
	// values v1 and v2. This function assumes that v1 and
	// v2 are present in Binary Tree
	public static Node lca_binaryTree(Node root, int v1, int v2) {

		if (root == null)
			return null;

		// If either v1 or v2 matches with root's key, report
		// the presence by returning root (Note that if a key is
		// ancestor of other, then the ancestor key becomes LCA)
		if (root.data == v1 || root.data == v2)
			return root;

		// Look for keys in left and right subtrees
		Node left = lca_binaryTree(root.left, v1, v2);
		Node right = lca_binaryTree(root.right, v1, v2);

		// If both of the above calls return Non-NULL, then one key
		// is present in once subtree and other is present in other,
		// So this node is the LCA
		if (left != null && right != null)
			return root;

		if (left == null && right == null)
			return null;

		// Otherwise check if left subtree or right subtree is LCA
		return left != null ? left : right;
	}