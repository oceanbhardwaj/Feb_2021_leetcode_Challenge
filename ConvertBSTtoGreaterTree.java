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
/*class Solution {
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
       if(root!=null)
       {
           convertBST(root.right);
           sum=sum+root.val;
           root.val=sum;
           convertBST(root.left);
           
       }
        return root;
    }
    
}*/
class Solution {
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
       if(root==null)
           return root;
        TreeNode root1=root;
        Stack<TreeNode> s=new Stack<>();
        while(!s.isEmpty() || root1!=null ){
        while( root1!=null )
        {
            s.push(root1);
            root1=root1.right;
        }
       root1=s.pop();
        sum=sum+root1.val;
        root1.val=sum;
        root1=root1.left;
        }
        return root;
    }
    
}