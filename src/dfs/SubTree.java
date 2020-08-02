package dfs;

import util.TreeNode;

//输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
//B是A的子结构,即A中有出现和B相同的结构和节点值。

public class SubTree {
    //递归函数的意义：用A的根节点与B的根节点做匹配，如果不匹配则用A的左右节点继续与B的根节点做比较
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B == null || A == null){
            return false;
        }
        return dfs(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }

    //先序遍历，递归函数的意义：检查A、B当前节点是否相同并递归左右子节点
    //结束条件：B走完了说明匹配到了，A走完了说明最后没有找到
    public boolean dfs(TreeNode A,TreeNode B){
        if(B == null){
            return true;
        }
        if(A == null){
            return false;
        }
        return A.val == B.val && dfs(A.left,B.left) && dfs(A.right,B.right);
    }
}
