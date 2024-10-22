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
        List<List<Integer>> ls=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();

        if(root==null){
            return -1;
        }
        q.offer(root);
        
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> lst=new LinkedList<>();
            for(int i=0;i<size ;i++){
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                lst.add(q.poll().val);
            }
            ls.add(lst);

        }
        List<Long> res=new ArrayList<>();
        long i=0;
        for(List<Integer> inner : ls){
            long sum=0;
                for(int ele:inner){
                    sum+=ele;
                }
                res.add(sum);
        }
        res.sort(Collections.reverseOrder());
       if (k > res.size()) return -1;
        return res.get(k-1);
    }
}