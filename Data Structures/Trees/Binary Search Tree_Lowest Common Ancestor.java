
 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */
/*
	Algorithm:
		(Remember this is for binary search tree. That means the tree is in order.)
		
		Examine the current node
		If the current node's value greater than both value1 and value2
			Examine the left child
		If the current node's value less than both value1 and value2
			Examine the right child
		Otherwise
			The current node is the lowest common ancestor
*/
static Node lca(Node root,int v1,int v2)
{
    if(root.data > Math.max(v1, v2))
        return lca(root.left, v1, v2);
    if(root.data < Math.min(v1, v2))
        return lca(root.right, v1, v2);
    else
        return root;
}
