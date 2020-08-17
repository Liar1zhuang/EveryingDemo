package binaryTree;

public class IsSubPath {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(head == null){
            return true;
        }
        if(root == null){
            return false;
        }
        return dfs(head,root) || isSubPath(head,root.left) || isSubPath(head,root.right);
    }
    public boolean dfs(ListNode head,TreeNode root){
        //列表中节点匹配完毕，成功
        if(head == null){
            return true;
        }
        //二叉树遍历到空节点，失败
        if(root == null){
            return false;
        }
        //树中节点和列表中节点数值不同
        if(root.val != head.val){
            return false;
        }
        return dfs(head.next,root.left) || dfs(head.next,root.right);
    }
}
