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
import java.util.HashMap;
import java.util.Map;

class Solution {
    // DFS to calculate the height of each node
    int dfs(TreeNode root, Map<TreeNode, Integer> heights) {
        if (root == null) return 0;  // Height of a null node is 0
        // Store the height of the current node
        heights.put(root, 1 + Math.max(dfs(root.left, heights), dfs(root.right, heights)));
        return heights.get(root);
    }

    // DFS to calculate the new height of the tree after removing a subtree
    void dfs(TreeNode root, int depth, int ans, int[] res, Map<TreeNode, Integer> heights) {
        if (root == null) return;

        // Set the height of the current node
        res[root.val] = ans;

        // If left subtree is removed, the new height will depend on the right subtree
        dfs(root.left, depth + 1, Math.max(ans, heights.getOrDefault(root.right, 0) + depth), res, heights);

        // If right subtree is removed, the new height will depend on the left subtree
        dfs(root.right, depth + 1, Math.max(ans, heights.getOrDefault(root.left, 0) + depth), res, heights);
    }

    public int[] treeQueries(TreeNode root, int[] queries) {
        // Map for storing height of each node
        Map<TreeNode, Integer> heights = new HashMap<>();
        
        // Calculate the height of each node using DFS
        dfs(root, heights);

        // Handle corner case: height of a null node is 0
        heights.put(null, 0);

        // Array to store results for each node
        int res[] = new int[heights.size() + 1];
        
        // DFS to calculate the answer for each node (removing the left or right subtree)
        dfs(root, 0, -1, res, heights);

        // Prepare the final answer array based on the queries
        int[] ans = new int[queries.length];
        int i = 0;
        for (int query : queries) {
            ans[i++] = res[query];
        }
        return ans;
    }
}
