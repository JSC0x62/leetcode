/*
https://leetcode.com/problems/maximum-depth-of-binary-tree/
https://www.youtube.com/watch?v=aVr6EKQtrBg&ab_channel=FANGCRACK
https://www.youtube.com/watch?v=hTM3phVI6YQ&ab_channel=NeetCode

Simple O(n) solution using DFS recursion.
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
import java.lang.Math;
class Solution {
    public int maxDepth(TreeNode root) {
        //Base case: if node is null return back 0
        //Operate until we have searched the entire tree
        if(root == null){
            return 0;
        }
        //For each node go all the way to left, return that amount. Do the same for the right. The largest will be returned back.
        /*
        
        */
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        
    }
}
