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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> returnList=new ArrayList<>();

        if(root!=null) q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> ls=new ArrayList<>();
            for(int i=0; i<size ;i++){
                TreeNode node=q.poll();
                ls.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            returnList.add(ls);
        }
        Collections.reverse(returnList);
        return returnList;
    }
}