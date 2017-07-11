
 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */
/*
	Algorithm:
		(Remember this is for binary search tree. That means the tree is in order.)
		
		If the root value is greater than all of the given value nodes
			that means the common ancestor is on the left side
		If the root value is smaller than all of the given value nodes
			that means the common ancestor is on the right side
		Otherwise, the given value nodes are located in the left and right side.
		The only posibble common ancestor is the root node.
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