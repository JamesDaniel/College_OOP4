package week7;

import java.util.ArrayList;
import java.util.Stack;

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
   // http://introcs.cs.princeton.edu/java/44st/IterativeBST.java.html
   public void insertIter(E e) {
       Node z = new Node();
       z.data = e;
       z.left = null; z.right = null;
       if (root == null){
           root = z;
           return;
       }
       Node parent = null, x = root;
       while (x!=null)
       {
           parent = x;
           int res = e.compareTo(x.data);
           if (res < 0) x = x.left;
           else if (res > 0) x = x.right;
           else{
               // no need to overwrite data
           }
       }
       int res = e.compareTo(parent.data);
       if (res < 0) parent.left = z;
       else parent.right = z;
   }
  // in order
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
   
  // pre order
   public void printPre(){
       if (root != null)
         printSub(root);
   }
   
   private void printSubPre(Node node){
      if (node != null)
      {
         System.out.println(node.data);
         printSub(node.left);
         printSub(node.right);
      }
   }  
   
  // post order
   public void printPost(){
       if (root != null)
         printSub(root);
   }
   
   private void printSubPost(Node node){
      if (node != null)
      {
         printSub(node.left);
         printSub(node.right);
         System.out.println(node.data);
      }
   }  
   public boolean containsRecur(E element)
   {
       if (root != null)
           return containsSub(element, root);
       return false;
   }
   private boolean containsSub(E element, Node node)
   {
       if (element != null)
       {
           if (element.compareTo(node.data) == 0)
               return true;
           else if (containsSub(element, node.left)) 
               return true;
           else
               return containsSub(element, node.right);
       }
       else
           return false;
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
    // http://www.programcreek.com/2012/12/leetcode-solution-for-binary-tree-preorder-traversal-in-java/
    public void preorderTraversalIter(Node node){
        ArrayList<E> arraylist = new ArrayList<E>();
        
        if (root == null)
            return;
        
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        
        while (!stack.empty()){
            Node n = stack.pop();
            System.out.println(n.data);
            
            if (n.right != null)
                stack.push(n.right);
            if (n.left != null)
                stack.push(n.left);
        }
    }
   
}