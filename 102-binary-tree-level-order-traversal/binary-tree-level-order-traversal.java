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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> li1= new ArrayList<>(); //outer list
        if(root==null)
        return li1; 
        Queue <TreeNode> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            List<Integer> li2=new ArrayList<>();
            int size=qu.size();
            for(int i=0;i<size;i++){
                TreeNode current=qu.poll();
                li2.add(current.val);
                if(current.left!=null) qu.add(current.left);
                if(current.right!=null) qu.add(current.right);

            }
            li1.add(li2);
        }
        return li1;

    }
}