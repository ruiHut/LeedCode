import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *  102 level order
 * 1. queue BFS 
 * 2. DFS remind level and fill in the result list
 *
 */
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return res;

        TreeNode node = root;
        Queue<TreeNode>  q = new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> levelNodes = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = q.poll();
                levelNodes.add(curNode.val);
                if (curNode.left != null) q.offer(curNode.left);
                if (curNode.right != null) q.offer(curNode.right);
            }
            res.add(levelNodes);
        }
        return res;
    }
}

// 2 iterativeLeveOrder DFS fixme 

