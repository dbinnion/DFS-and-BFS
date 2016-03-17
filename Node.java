package TreeTraversalandRecursion;

public class Node {
 
    int value;
    private Node left;
    private Node right;
 
    public Node()
    {
    	
    }
    
    public Node(int d) {
        value = d;
    }
    
    public int getValue()
    {
    	return value;
    }

    public Node getLeft()
    {
    	return left;
    }
    
    public Node getRight()
    {
    	return right;
    }

    public void setLeft(Node input)
    {
    	left = input;
    }
    
    public void setRight(Node input)
    {
    	right = input;
    }
}