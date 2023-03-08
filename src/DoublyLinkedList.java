public class DoublyLinkedList {
    Node head, tail = null;
    private class Node {
        int value;
        Node next, prev = null;

        Node(int value){
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    public void pushBack(int value){
        System.out.println("Pushing Front");
        if (head == null){
            Node node = new Node(value);
            head = node;
            tail = node;
        } else {
            Node node = head;
            while (node.next != null){
                node = node.next;
            }
            Node newNode = new Node(value);
            node.next = newNode;
            newNode.prev = node;
            tail = newNode;
        }
        printList();
    }

    public void printList(){
        Node node = head;
        System.out.print("List is : ");

        while (node.next != null){
            System.out.print(node.value + ", ");
            node = node.next;
        }
        System.out.println(node.value);
    }
}
