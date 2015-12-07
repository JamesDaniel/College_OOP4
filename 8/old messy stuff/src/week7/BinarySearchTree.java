package week7;
/**
   This class implements a binary search tree whose
   nodes hold objects that implement the Comparable
   interface.
*/

public class BinarySearchTree<E extends Comparable<E>> {
   private Node root;
   
   private class Node
   {
      public E data;
      public Node left;
      public Node right;
   }
   
   public BinarySearchTree(){
     root = null;
   }
   
   public void insert(E e) {
      Node newNode = new Node();
      newNode.data = e;
      newNode.left = null;
      newNode.right = null;
      if (root == null)
        root = newNode;
      else
        insertSub(root, newNode);
   }
       
   private void insertSub(Node node, Node newNode){
      if (newNode.data.compareTo(node.data) < 0)
      {  if (node.left == null)
            node.left = newNode;
         else
            insertSub(node.left,newNode);
      }
      else
      {  if (node.right == null) 
            node.right = newNode;
         else
            insertSub(node.right, newNode);
      }
   }
 
   public void print(){
       if (root != null)
         printSub(root);
   }
   
   private void printSub(Node node){
      if (node != null)
      {
         printSub(node.left);
         System.out.println(node.data);
         printSub(node.right);
      }
   }  
   
    public boolean contains(E element)
    {
        //iterative contains method for binary search tree
        Node current = root;
        while (current != null)
        {
            int result = current.data.compareTo(element);
            if (result == 0)
                return true;
            else if (result < 0)
            {
                current = current.right;
            }
            else
            {
                current = current.left;
            }
        }
        return false;
    }
    
   
}