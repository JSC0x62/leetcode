/*
https://leetcode.com/problems/invert-binary-tree/
https://www.youtube.com/watch?v=OnSn2XEQ4MY&ab_channel=NeetCode

Simple O(n) solution. Basically at each node, just swap the left and right nodes. Uses a DFS to traverse the tree.
*/

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
       
       //Base case. If the root (or current node) is null, return null because we can't go any further in this direction.
       if(root == null){
           return null;
       } 
       //swap the left and right nodes
       TreeNode tmp = root.left;
       root.left = root.right;
       root.right = tmp;
       //recursivley invert each node.
       //start at the root and for each node, go to its left and flip its child nodes if it has any. Do the same for the right.
       invertTree(root.left);
       invertTree(root.right); 
       //at the end we are done. Return the root.
       return root;
        
    }
}
