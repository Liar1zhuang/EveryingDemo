package binaryTree;

//给定一个二叉树，它的每个结点都存放着一个整数值。
//找出路径和等于给定数值的路径总数。
//路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。

//双重递归 思路：首先先序递归遍历每个节点，再以每个节点作为起始点递归寻找满足条件的路径。
public class PathSum {
    int count = 0;
    public int pathSum(TreeNode root, int sum) {
        if(root == null){
            return 0;
        }
        Sum(root,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return count;
    }

    public void Sum(TreeNode root,int sum){
        if(root == null){
            return;
        }
        sum -= root.val;
        if(sum == 0){
            count++;
        }
        Sum(root.left,sum);
        Sum(root.right,sum);
    }
}
