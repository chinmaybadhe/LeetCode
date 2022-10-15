/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        HashSet<TreeNode> set=new HashSet<>();
        HashMap<TreeNode,TreeNode> map=new HashMap<>();
        
        map.put(root, null);
        if(root.left!=null)map.put(root.left, root);
        if(root.right!=null)map.put(root.right, root);
        
        Queue<TreeNode> queue=new LinkedList<>();
        if(root.left!=null)queue.add(root.left);
        if(root.right!=null)queue.add(root.right);
        
        int counter=0;
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            if(node==p || node==q){
                counter++;
                
            }
            if(counter==2) break;
            if(node.left!=null){
                map.put(node.left, node);
                queue.add(node.left);
            }
            if(node.right!=null){
                map.put(node.right, node);
                queue.add(node.right);
                
            }            
        }
        TreeNode temp1=p;
        
        while(map.containsKey(temp1)){
            set.add(temp1);
            temp1=map.get(temp1);
            
        }
        TreeNode temp2=q;
        
        while(!set.contains(temp2)){

            temp2=map.get(temp2);
            
        }
        return temp2;
        
        
    }
}