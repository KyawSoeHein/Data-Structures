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
        System.out.println("Pushing Back");
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

    public void pushFront(int value){
        System.out.println("Pushing Front");
        if (head == null){
            Node node = new Node(value);
            head = node;
            tail = node;
        } else {
            Node node = head;
            Node newNode = new Node(value);
            newNode.next = node;
            node.prev = newNode;
            head = newNode;
        }
        printList();
    }

    public void getTheLastNode(){
        System.out.println("Getting the last node");
        System.out.println(tail.value);
    }

    public void topFront(){
        System.out.println("Getting the First node");
        System.out.println(head.value);
    }

    public void popFront(){
        System.out.println("Popping Front");
        if (head != null){
            Node nextNode = head.next;
            nextNode.prev = null;
            head = nextNode;
        }
        printList();
    }

    public void popBack(){
        System.out.println("Popping Back");
        if (tail != null){
            Node prevNode = tail.prev;
            prevNode.next = null;
            tail = prevNode;
        }
        printList();
    }

    public void findNode(int value){
        System.out.println("Finding Node");
        Node node = head;

        while (node.next != null){
            if (node.value == value){
                System.out.println("Found the value");
                return;
            } else {
                node = node.next;
            }
        }

        if (node.value == value){
            System.out.println("Found the value");
        } else {
            System.out.println("Didn't find the value");
        }
    }

    public void reverse(){
        System.out.println("Reversing");
        Node node = head;

        while (node.next != null){
            Node temp = node.next;
            node.next = node.prev;
            node.prev = temp;
            node = temp;
        }

        tail = head;
        head = node;
        head.next = node.prev;
        head.prev = null;

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

    public void printReverseList(){
        Node node = tail;
        System.out.print("Reverse List is : ");

        while (node.prev != null){
            System.out.print(node.value + ", ");
            node = node.prev;
        }
        System.out.println(node.value);
    }
}
