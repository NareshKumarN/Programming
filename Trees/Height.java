/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author PerFectionisT
 */
class Node {

        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
public class Height {
    
    Node root;
    
    int height(Node root){
        if(root == null){
            return 0;
        }
        else {
            int lh = height(root.left);
            int rh = height(root.right);
            if(lh>rh){
                return lh+1;
            }
            else {
                return rh+1;
            }
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Height tree = new Height();
  
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
  
        System.out.println("Height of tree is : " + tree.height(tree.root));
}
}
