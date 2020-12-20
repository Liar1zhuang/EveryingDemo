package binaryTree;

import java.util.*;

public class Traverse {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
//        preOrderRecursion(root);
//        preOrderNonRecursion(root);
//        inOrderRecursion(root);
        inOrderNonRecursion(root);
//        postOrderRecursion(root);
//        postOrderNonRecursion(root);
        levelOrderNonRecursion(root);
        levelOrderRecursion(root);
    }


    //递归的前序遍历
    private static void preOrderRecursion(TreeNode root){
        if(root != null){
            System.out.println(root.val);
            preOrderRecursion(root.left);
            preOrderRecursion(root.right);
        }
    }

    //非递归的前序遍历
    private static void preOrderNonRecursion(TreeNode root){
        //用栈暂存节点
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode node = root;
        // 当遍历到最后一个节点的时候，无论如何它的左右子树都为空，并且栈也为空
        // 所以，只要不同时满足这两点，都需要进入循环
        while(node != null || !stack.isEmpty()){
            while(node != null){
                System.out.println(node.val);
                // 为了之后能找到该节点的右子树，暂存该节点
                stack.push(node);
                node = node.left;
            }
            // 一直到左子树为空，则开始考虑右子树
            // 如果栈已空，就不需要再考虑
            // 弹出栈顶元素，将游标等于该节点的右子树
            if(!stack.isEmpty()){
                node = stack.pop();
                node = node.right;
            }
        }
    }

    //递归的中序遍历
    private static void inOrderRecursion(TreeNode root){
        if(root != null){
            inOrderRecursion(root.left);
            System.out.println(root.val);
            inOrderRecursion(root.right);
        }
    }

    //非递归的中序遍历
    private static void inOrderNonRecursion(TreeNode root){
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode node = root;
        while(node != null || !stack.isEmpty()){
            //与前序遍历的唯一区别就是考察当前节点时，不输出该节点
            while(node != null){
                stack.push(node);
                node = node.left;
            }
            //从栈中弹出时才进行输出（永远先考虑左子树，直到左子树为空后再访问根结点）
            if(!stack.isEmpty()){
                node = stack.pop();
                System.out.println(node.val);
                node = node.right;
            }
        }
    }

    //递归的后续遍历
    private static void postOrderRecursion(TreeNode root){
        if(root != null){
            postOrderRecursion(root.left);
            postOrderRecursion(root.right);
            System.out.println(root.val);
        }
    }

    //非递归的后续遍历
    private static void postOrderNonRecursion(TreeNode root){
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode node = root;
        TreeNode lastVisited = root;
        while(node != null || !stack.isEmpty()){
            while(node != null){
                stack.push(node);
                node = node.left;
            }
            //查看当前栈顶元素
            node = stack.peek();
            //如果其右子树也为空，或者右子树已经访问
            //则可以直接输出当前节点的值
            if(node.right == null || node.right == lastVisited){
                System.out.println(node.val);
                stack.pop();
                lastVisited = node;
                node = null;
            }else{
                //否则，继续遍历右子树
                node = node.right;
            }
        }
    }

    //队列层序遍历
    private static void levelOrderNonRecursion(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i < size;i++){
                TreeNode node = queue.poll();
                System.out.println(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
        }
    }


    //递归的层次遍历
    private static List<List<Integer>> levelOrderRecursion(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res,root,0);
        return res;
    }

    //把层次加入递归函数
    private static void helper(List<List<Integer>> res,TreeNode root, int i) {
        if(root != null){
            if(res.size() == i){
                res.add(new ArrayList<>());
            }
            res.get(i).add(root.val);
            helper(res,root.left,i+1);
            helper(res,root.right,i+1);
        }
    }
}
