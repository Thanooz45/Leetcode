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
    private int matchingNodes = 0;

    public int averageOfSubtree(TreeNode root) {
        matchingNodes = 0;
        dfs(root);
        return matchingNodes;
    }

    // Returns an array of size 2: [sum of subtree, count of nodes]
    private int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        int subtreeSum = left[0] + right[0] + node.val;
        int subtreeCount = left[1] + right[1] + 1;

        if (subtreeSum / subtreeCount == node.val) {
            matchingNodes++;
        }

        return new int[]{subtreeSum, subtreeCount};
    }
}