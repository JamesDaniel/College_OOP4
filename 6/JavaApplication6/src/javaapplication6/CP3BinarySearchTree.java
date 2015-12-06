/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author SoftwareDev
 * @param <E>
 */
public class CP3BinarySearchTree<E extends Comparable> {

    private Node root;

    private class Node {

        private Node left;
        private Node right;
        private E data;

        public Node() {
        }
    }

    public CP3BinarySearchTree() {

    }

    public void insert(E element) {
        Node newNode = new Node();
        newNode.data = element;
        newNode.left = null;
        newNode.right = null;

        if (root == null) {
            root = newNode;
        } else {
            insertSub(root, newNode);
        }
    }

    private void insertSub(Node node, Node newNode) {
        // compare node.data and newNode.data

        if (node.data.compareTo(newNode.data) > 0) {
            if (node.left == null) {
                node.left = newNode;
            } else {
                insertSub(node.left, newNode);
            }
        } else if (node.right == null) {
            node.right = newNode;
        } else {
            insertSub(node.left, newNode);
        }
    }

    public void print() {
        if (root != null) {
            printSub(root);
        }
    }

    private void printSub(Node node) {
        if (node != null) {
            printSub(node.left);
            System.out.println(node.data);
            printSub(node.right);
        }
    }

    public static void main(String[] args) {
        CP3BinarySearchTree<String> st = new CP3BinarySearchTree<String>();
        st.insert("a");
        st.insert("b");
        st.insert("c");
        st.insert("d");
        st.print();
        
    }
}
