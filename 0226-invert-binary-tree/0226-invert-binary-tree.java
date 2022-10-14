/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        if(root==null) return null;
        
        TreeNode leftChild=null, rightChild=null;
        if(root.left!=null){
            leftChild=root.left;
            
        }
        if(root.right!=null){
            rightChild=root.right;
            
        }
        
        root.left=rightChild;
        root.right=leftChild;
        
        invertTree(rightChild);
        invertTree(leftChild);
        
        return root;
                
    }
}