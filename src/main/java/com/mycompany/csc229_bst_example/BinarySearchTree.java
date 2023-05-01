package com.mycompany.csc229_bst_example;
/**
 *
 * @author MoaathAlrajab
 */
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private BstNode root;

    public boolean isEmpty() {
        return (this.root == null);
    }

    public void insert(Integer data) {

        System.out.print("[input: " + data + "]");
        if (root == null) {
            this.root = new BstNode(data);
            System.out.println(" -> inserted: " + data);
            return;
        }
        insertNode(this.root, data);
        System.out.print(" -> inserted: " + data);
        System.out.println();
    }

    private BstNode insertNode(BstNode root, Integer data) {

        BstNode tmpNode = null;
        System.out.print(" ->" + root.getData());
        if (root.getData() >= data) {
            System.out.print(" [L]");
            if (root.getLeft() == null) {
                root.setLeft(new BstNode(data));
                return root.getLeft();
            } else {
                tmpNode = root.getLeft();
            }
        } else {
            System.out.print(" [R]");
            if (root.getRight() == null) {
                root.setRight(new BstNode(data));
                return root.getRight();
            } else {
                tmpNode = root.getRight();
            }
        }
        return insertNode(tmpNode, data);
    }

    public void inOrderTraversal() {
        doInOrder(this.root);
    }

    private void doInOrder(BstNode root) {

        // ToDo 1: complete InOrder Traversal
        if(root == null) return;
        doInOrder(root.getLeft());
        doInOrder(root.getRight());
        
        
    }
        public void preOrderTraversal() {
        doPreOrder(this.root);
        // ToDo 2: complete the pre-order travesal . 
    }
        
        private void doPreOrder(BstNode root){
            if(root == null) return;
            root.getData();
            doPreOrder(root.getLeft());
            doPreOrder(root.getRight());
            
            
        }
        
        

    public Integer findHeight(BstNode root) {
        // ToDo 3: Find the height of a tree
       if(root == null) {  
            return 0;  
        }
       
       else{
            int leftHeight = 0, rightHeight = 0;
            
            if(root.getLeft() != null)  
                leftHeight = findHeight(root.getLeft());
            
            if(root.getRight() != null)  
                rightHeight = findHeight(root.getRight());  
             
            int max = (leftHeight > rightHeight) ? leftHeight : rightHeight;  
            
            return (max + 1);  

  
       
       
       
       }
        
        
    
    
    }


    public int getDepth(BstNode node, int x) {
         if (root == null)
        return -1;
  
    
    int dist = -1;
  
    
    if ((root.getData() == x)|| 
      
        (dist = getDepth(root.getLeft(), x)) >= 0 || 
          
        (dist = getDepth(root.getLeft(), x)) >= 0)
  
        
        return dist + 1;
          
    return dist;
        
    }
    
    public BstNode getRoot(){
        return this.root;
    }
    
   public void print() {
       System.out.println("\n==== BST Print ===== \n");
         if(root == null) return;
            System.out.println(root.getData());
            doPreOrder(root.getLeft());
            doPreOrder(root.getRight());
    }


}
