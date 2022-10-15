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
    public boolean isBalanced(TreeNode root) {
        
        int answer=checkBalancedTree(root);
        if(answer!=-1) return true;
        return false;
        
    }
    
    int checkBalancedTree(TreeNode root){
        if(root==null) return 0;
        
        int leftHeight=checkBalancedTree(root.left);
        int rightHeight=checkBalancedTree(root.right);
        
        if(leftHeight==-1 || rightHeight==-1) return -1;
        
        if(Math.abs(leftHeight-rightHeight)<2){
            return Math.max(leftHeight, rightHeight)+1;
            
        }
        else return -1;
        
    }
}