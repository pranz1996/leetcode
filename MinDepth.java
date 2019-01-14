package leetcode;


public class MinDepth {
	static Node root;
	public static void main(String args[])  
    { 
        MinDepth tree = new MinDepth(); 
        tree.root = new Node(3); 
        tree.root.left = new Node(9); 
       
        
        System.out.println(minDepth(root));
    }
    public static int minDepth(Node root) {
        int lh , rh;
        
        if(root == null)
            return 0;
        
        if(root.left == null && root.right == null)
        	return 1;
        
        if(root.left == null)
        	return minDepth(root.right) + 1;
        
        if(root.right == null)
        	return minDepth(root.left) + 1;
        
        return Math.min(minDepth(root.left), minDepth(root.right))+1;
        
    }
    
    

}
