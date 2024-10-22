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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();

        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            long sum=0;
            for(int i=0;i<n;i++){
                TreeNode node=q.poll();
                sum+=node.val;

                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            ans.add(sum);

        }

        if(k > ans.size()) return -1;
        ans.sort(Collections.reverseOrder());
        
        return ans.get(k-1);

    }
}