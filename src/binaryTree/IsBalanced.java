package binaryTree;

//实现一个函数，检查二叉树是否平衡。在这个问题中，平衡树的定义如下：任意一个节点，其两棵子树的高度差不超过 1。
public class IsBalanced {
    //第一种写法：

//    public boolean isBalanced(TreeNode root) {
//        if (root == null)
//            return true;
//        //拿到节点的左子树和右子树的深度
//        int deptLeft = getDept(root.left, 0);
//        int deptRight = getDept(root.right, 0);
//        //如果相差大于1，那么不是一颗平衡树
//        if (Math.abs(deptLeft - deptRight) > 1)
//            return false;
//        //递归检查这个节点的左子节点和右子节点
//        return isBalanced(root.left) && isBalanced(root.right);
//    }
//    //获取从某个节点开始的深度
//    private int getDept(TreeNode root, int dept) {
//        if (root == null)
//            return dept;
//        int deptLeft = getDept(root.left, dept + 1);
//        int deptRight = getDept(root.right, dept + 1);
//        return Math.max(deptLeft, deptRight);
//    }

    //同样是后续遍历，更加简洁容易理解
    private boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return flag;
    }
    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        if(Math.abs(left-right) > 1){
            flag = false;
        }
        return Math.max(left,right)+1;
    }
}
