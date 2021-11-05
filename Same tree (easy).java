/*
https://leetcode.com/problems/same-tree/submissions/
https://www.youtube.com/watch?v=vRbbcKXCxOw&ab_channel=NeetCode
This is O(n) with n being the size of both trees.
Basically on each tree, go the left and go to the right. Compare each node. They have to both exist and have the same value.
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        //base cases. Have to both exist and have the same value.
        if(p == null && q == null){
            return true;
        }
        if(p == null && q != null){
            return false;
        }
        if(p != null && q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        if(p == q){
            return true;
        }
        //return and check the left and right values of each tree. Each node has to be equal.
        return (isSameTree(p.left, q.left)) && (isSameTree(p.right, q.right));
        
    }
}
