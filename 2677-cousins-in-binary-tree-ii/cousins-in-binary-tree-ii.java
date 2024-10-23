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
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int curL_sum=root.val;

        while(!q.isEmpty()){
            int n=q.size();
            int nextL_sum=0;
            for(int i=0;i<n;i++){
                TreeNode node=q.poll();
                node.val=curL_sum-node.val;

                int sibling_sum= (node.left!=null ? node.left.val : 0) + (node.right!=null ? node.right.val : 0) ;
                
                if(node.left!=null){
                    node.left.val=sibling_sum;
                    q.add(node.left);
                }
                if(node.right!=null){
                    node.right.val=sibling_sum;
                    q.add(node.right);
                }
                nextL_sum+=sibling_sum;
                
            }
            curL_sum=nextL_sum;
        }

        return root;

    }
}