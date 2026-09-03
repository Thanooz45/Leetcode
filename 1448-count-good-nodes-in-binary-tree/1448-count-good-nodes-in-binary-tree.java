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
    public static int find(TreeNode root,int maxsofar){
        if(root==null) return 0;
        int count=0;
        if(root.val>=maxsofar){
            count=1;
            maxsofar=root.val;
        }
        count+=find(root.left,maxsofar);
        count+=find(root.right,maxsofar);
        return count;

    }
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
         return find(root,root.val);
    }
}