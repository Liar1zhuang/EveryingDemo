package binaryTree;

//求二叉树的最大深度
public class MaxDepth {
    public int maxDepth(TreeNode root){
        //中止条件：当树为空结束递归，并返回当前深度0
        if(root == null){
            return 0;
        }
        //获取root左右子树的最大深度
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        //返回左右子树的最大深度+1
        return Math.max(leftDepth,rightDepth) + 1;

        //一行版
//        return root == null ? 0 : Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
