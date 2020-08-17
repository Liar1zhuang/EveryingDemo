package binaryTree;

//二叉树 abc，a 是根结点（递归中的 root），bc 是左右子结点（代表其递归后的最优解）。
//最大的路径，可能的路径情况：
//b + a + c。
//b + a + a 的父结点。
//a + c + a 的父结点。
//其中情况 1，表示如果不联络父结点的情况，或本身是根结点的情况。
//这种情况是没法递归的，但是结果有可能是全局最大路径和。
//情况 2 和 3，递归时计算 a+b 和 a+c，选择一个更优的方案返回，也就是上面说的递归后的最优解啦。
//
//另外结点有可能是负值，最大和肯定就要想办法舍弃负值（max(0, x)）（max(0,x)）。
//但是上面 3 种情况，无论哪种，a 作为联络点，都不能够舍弃。
//
//代码中使用 val 来记录全局最大路径和。
//ret 是情况 2 和 3。
//lmr 是情况 1。
//
//所要做的就是递归，递归时记录好全局最大和，返回联络最大和。

public class MaxPathSum {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root);
        return max;
    }

    /**
     * 返回经过root的单边分支最大和， 即Math.max(root, root+left, root+right)
     */
    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //计算左边分支最大值，左边分支如果为负数还不如不选择
        int leftMax = Math.max(0, dfs(root.left));
        //计算右边分支最大值，右边分支如果为负数还不如不选择
        int rightMax = Math.max(0, dfs(root.right));
        //left->root->right 作为路径与历史最大值做比较
        max = Math.max(max, root.val + leftMax + rightMax);
        // 返回经过root的单边最大分支给上游
        return root.val + Math.max(leftMax, rightMax);
    }
}
