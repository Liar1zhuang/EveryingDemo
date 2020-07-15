package linkedList;

public class LinkedMain {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        Reverse R = new Reverse();

//        Node node = R.reverseByLoop(node1);
        Node node = R.reverseByRecursion(node1);


        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }


    public static class Node{

        int data;
        Node next;
        Node(int data){
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }
}


