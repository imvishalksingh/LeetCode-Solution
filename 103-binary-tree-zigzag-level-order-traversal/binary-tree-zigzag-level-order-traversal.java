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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ls=new ArrayList<>();
        if(root!=null) q.add(root);
        boolean toggle=false;
        while(!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int n=q.size();
            for(int j=0;j<n;j++){
                TreeNode node=q.poll();
               // if(node!=null)
                list.add(node.val);
                if(node.left!=null)  q.add(node.left);
                if(node.right!=null) q.add(node.right);

            }
            if(toggle){
                Collections.reverse(list);
                ls.add(list);
            }else{
                ls.add(list);
            }
            toggle=!toggle;
           
        }

        return ls;
    }
}