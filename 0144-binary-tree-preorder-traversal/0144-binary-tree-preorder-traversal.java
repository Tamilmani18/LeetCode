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
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();

        traverse(root, result);

        return result;
    }

    public void traverse(TreeNode node, List<Integer> arr) {
        
        if (node == null) return;

        arr.add(node.val);

        traverse(node.left, arr);

        traverse(node.right, arr);
    }
}