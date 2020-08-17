package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

//请实现两个函数，分别用来序列化和反序列化二叉树。


//序列化和反序列化只需要按照相同的遍历方式进行操作和还原即可
public class SerializeAndDeserialize {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        //把序列化后的null拿掉之后就是前序遍历的结果
        if(root == null){
            return "null,";
        }
        //前序遍历
        String res = root.val + ",";
        res += serialize(root.left);
        res += serialize(root.right);
        return res;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] array = data.split(",");
        Queue<String> queue = new LinkedList<String>();
        for(int i = 0;i < array.length;i++){
            queue.offer(array[i]);
        }
        return build(queue);
    }

    public TreeNode build(Queue<String> queue){
        String val = queue.poll();
        if(val.equals("null")){
            return null;
        }
        //只有先序遍历和后续遍历不能构建唯一的二叉树，但是null节点也给出的时候可以
        TreeNode root = new TreeNode(Integer.valueOf(val));
        root.left = build(queue);
        root.right = build(queue);
        return root;
    }
}
