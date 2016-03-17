package TreeTraversalandRecursion;

public class Tree 
{
	public Tree()
	{}
 
    //returns the root node, sets new nodes
    public Node insert(Node node, int value) 
    {
        if (node == null) 
        {
            return (new Node(value));
        }
 
        if (value < node.getValue()) 
        {
        	node.setLeft(insert(node.getLeft(), value));
        } 
        else 
        {
        	node.setRight(insert(node.getRight(), value));
        }
 
        return node;
    }
 
    //1+2
    public void inOrder(Node node) {
        if (node != null) {
        	inOrder(node.getLeft());
        	System.out.print(node.getValue() + " ");
            inOrder(node.getRight());
        }
    }
    
    //+12
    public void preOrder(Node node) {
        if (node != null) {
        	System.out.print(node.getValue() + " ");
        	preOrder(node.getLeft());
        	preOrder(node.getRight());
        }
    }
    
    //12+
    public void postOrder(Node node) {
        if (node != null) {
        	postOrder(node.getLeft());
        	postOrder(node.getRight());
        	System.out.print(node.getValue() + " ");
        }
    }
}