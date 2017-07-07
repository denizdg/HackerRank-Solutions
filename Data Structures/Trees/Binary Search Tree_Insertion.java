 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value) {

    Node newNode = new Node();
    newNode.data = value;
    
    if(root == null)
        return newNode;   
    else{
        if(value <= root.data){
            if(root.left == null)
                root.left = newNode;
            else
                Insert(root.left, value);
        }else{
            if(root.right == null)
                root.right = newNode;
            else
                Insert(root.right, value);
        }
    
    }

    return root;
}