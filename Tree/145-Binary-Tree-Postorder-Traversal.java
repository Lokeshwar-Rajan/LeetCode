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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<>();
        if(root!=null){
            tree.addAll(postorderTraversal(root.left));
            tree.addAll(postorderTraversal(root.right));
            tree.add(root.val);
        }
        return tree;
        
    }
}