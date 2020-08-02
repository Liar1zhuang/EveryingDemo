package recursion;

//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。
//如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。

//时刻牢记树的定义本身就是递归的！
public class VerifyPostOrder {
    public boolean verifyPostorder(int[] postorder) {
        return verifyPostorder(postorder,0,postorder.length-1);
    }
    public boolean verifyPostorder(int[] postorder,int i,int j){
        if(i >= j){
            return true;
        }
        int left = i;
        while(postorder[left] < postorder[j]){
            left++;
        }
        int right = left;
        while(postorder[left] > postorder[j]){
            left++;
        }
        return left == j && verifyPostorder(postorder,i,right-1) && verifyPostorder(postorder,right,j-1);
    }
}
