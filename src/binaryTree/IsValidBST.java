package binaryTree;

//给定一个二叉树，判断其是否是一个有效的二叉搜索树
public class IsValidBST {
    public boolean isValidBST(TreeNode root){
        return validate(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }

    private boolean validate(TreeNode root, long maxValue, long minValue) {
        if(root == null){
            return true;
        }
        if(root.val <= maxValue && root.val >= minValue){
            return false;
        }

        return validate(root.left,root.val,minValue) && validate(root,maxValue, root.val);
    }
}
