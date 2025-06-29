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
    public int minDepth(TreeNode root) {

        if (root == null) return 0;

        // If the node has no left child, go right only
        if (root.left == null) return 1 + minDepth(root.right);

        // If the node has no right child, go left only
        if (root.right == null) return 1 + minDepth(root.left);

        // If both children exist, take the smaller depth
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
