package binaryTree;

/*
* 寻找二叉树的最近公共祖先
*/
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        if(root == null || root == p || root == q){
            return root;
        }
        //递归遍历左子树
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        //同样的递归遍历右子树
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        //如果left和right都不为空，说明p、q在左右子树分别出现了，因此公共祖先就是root
        if(left != null && right != null){
            return root;
        }
        //如果只有left不为空，说明q、p都在左子树，公共祖先就是left
        if(left != null){
            return left;
        }
        //如果只有right不为空，说明q、p都在右子树，公共祖先就是right
        if(right != null){
            return right;
        }
        return null;
    }
}
