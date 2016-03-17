package TreeTraversalandRecursion;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
	private static Node root;
	public static void main(String [] args)
	{
        Tree tree = new Tree();
 
        root = tree.insert(root, 10);
        root = tree.insert(root, 9);
        root = tree.insert(root, 11);
        root = tree.insert(root, 10);
        root = tree.insert(root, 8);
        root = tree.insert(root, 9);
        root = tree.insert(root, 12);
        //BFS should be 10-9-11-8-9-10-12
        //DFS should be 10-9-8-9-11-10-12
        
        System.out.print("Pre-order : ");
        tree.preOrder(root);
        System.out.println();
        
        System.out.print("Post-order : ");
        tree.postOrder(root);
        System.out.println();
        
        System.out.print("In-order : ");
        tree.inOrder(root);
        System.out.println();

        System.out.print("BFS: ");
        BreadthFirstSearch(root);
        System.out.println();
        
        System.out.print("DFS: ");
        DepthFirstSearch(root);
	}
	public static void BreadthFirstSearch(Node root)
	{
		//use queue to ensure each node's children are searched for in order
		//add root to queue
		//while the queue isn't empty, continue
			//remove from front of the queue
			//for each child of this node
				//if unvisited, add to queue, mark as visited
		if(root==null)
			return;
		
		Queue <Node> queue = new LinkedList <Node> ();
		queue.add(root);
		
		while(queue.peek()!=null)
		{
			//if(queue.peek()==null)
				//return;
			Node tempNode = (Node)queue.remove();
			
			//to show traversal
			System.out.print(tempNode.value+" ");
			
			//a tree, not a graph, so nodes cannot be visited from non-parents
			//if it was a graph, 
				//a node array/list would need to be 
					//made and checked for visitation
			if(tempNode.getLeft()!=null)
				queue.add(tempNode.getLeft());
			if(tempNode.getRight()!=null)
				queue.add(tempNode.getRight());
		}
	}
	
	public static void DepthFirstSearch(Node root)
	{
		//no need for queue.
		//search using recursion to ensure process continues down path
		//if root is null, return (at end of tree)
		//otherwise, mark root as visited, then
			//for each child, if the child is unvisited, 
			//then call this method for that child
		if(root==null)
			return;

		//to show traversal
		System.out.print(root.value+" ");
		//a tree, not a graph, so nodes cannot be visited from non-parents
		//if it was a graph, 
			//a node field would need to be checked and toggled for visitation
		DepthFirstSearch(root.getLeft());
		DepthFirstSearch(root.getRight());
	}
}
