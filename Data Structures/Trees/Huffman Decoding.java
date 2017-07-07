/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
{
    StringBuilder resultStr = new StringBuilder();
    
    Node curr = root;
    
    for(int i = 0; i < S.length(); i++){
        char ch = S.charAt(i);
        
        if(ch == '1')
            curr = curr.right;
        else
            curr = curr.left;
        
        if(curr.left == null && curr.right == null){
            resultStr.append(curr.data);
            curr = root;
        }
    }
    
    System.out.println(resultStr);      
}