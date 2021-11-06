/*
https://leetcode.com/problems/subtree-of-another-tree/submissions/
https://www.youtube.com/watch?v=E36O5SWp-LE&ab_channel=NeetCode

O(n) solution uses 2 recusrive DFS functions. See is same tree problem (is used as a function here)

Really there are 2 problems here 1) see if there is a subtree and 2) is it the same tree? For 2) this was a previous LC problem and is used as a function.


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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //If the subRoot is null, return true. There is nothing so there is just the root. This is true.
        if(subRoot == null){
            return true;
        }
        //if the root is null, then it does not contain the sub tree.
        if(root == null){
            return false;
        }
        //if they are the same then return true
        if(isSameTree(root, subRoot)){
            return true;
        }
        //if not check the left and right nodes of the root. If either one is true (this is why OR is used), it will return true.
        return (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
        
    }  
     public boolean isSameTree(TreeNode p, TreeNode q) {
        //This is the isSameTree problem from before. See: https://leetcode.com/problems/same-tree/
        //Both nodes have to be the same everywhere in both trees. Check for any nulls and make sure the values are the same.
        //Then recursivley check again by making the nodes from each tree go left and right. AND is used as both trees must be the same.
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
        return (isSameTree(p.left, q.left)) && (isSameTree(p.right, q.right));
        
    }
}
