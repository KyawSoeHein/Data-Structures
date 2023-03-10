public class Queue {
    Node head, tail = null;

    private class Node {
        int value;
        Node next, prev;

        Node(int value){
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    public void enqueue(int value){
        Node newNode = new Node(value);

        if (head == null){
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        printList();
    }

    public void dequeue(){
        Node node = tail;

        tail = tail.prev;
        tail.next = null;
        printList();
    }

    public void empty(){

    }

    public void printList(){
        System.out.print("List is : ");
        Node node = head;

        while (node != null){
            System.out.print(node.value + ", ");
            node = node.next;
        }
        System.out.println();
    }
}
