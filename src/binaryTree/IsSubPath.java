package binaryTree;

public class IsSubPath {
    public boolean isSubPath(TreeNode head, TreeNode root) {
        if(head == null){
            return root == null;
        }
        if(root == null){
            return head == null;
        }
        return dfs(head,root) || isSubPath(head,root.left) || isSubPath(head,root.right);
    }
    public boolean dfs(TreeNode head,TreeNode root){
        //列表中节点匹配完毕，成功
        if(head == null){
            return root == null;
        }
        //二叉树遍历到空节点，失败
        if(root == null){
            return head == null;
        }
        //树中节点和列表中节点数值不同
        if(root.val != head.val){
            return false;
        }
        return dfs(head.left,root.left) || dfs(head.right,root.right);
    }
}
