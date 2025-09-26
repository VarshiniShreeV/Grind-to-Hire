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
public class Leetcode_257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> s = new ArrayList<>();
        if (root==null) return s;
        traverse(root, "", s);
        return s;
    }
    public static void traverse(TreeNode root, String path, List<String> s){
        if(root==null) return;

        path+=root.val;

        if(root.left==null&&root.right==null) {
            s.add(path);
            return;
        }
        path+= "->";
        traverse(root.left, path, s);
        traverse(root.right, path, s);
        
    }

}