public class Stack {
    Node head = null;
    private class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    public void push(int value){
        System.out.println("Pushing");
        if (head == null){
            head = new Node(value);
        } else {
            Node node = head;

            while (node.next != null){
                node = node.next;
            }
            node.next = new Node(value);
        }
        printList();
    }

    public void top(){
        System.out.println("Getting Top");
        Node node = head;

        while (node.next != null){
            node = node.next;
        }

        System.out.println(node.value);
    }

    public void pop(){
        System.out.println("Popping");
        Node node = head;
        Node prevNode = head;

        if (node != null){
            while (node.next != null){
                prevNode = node;
                node = node.next;
            }
            prevNode.next = null;
        }

        printList();
    }

    public void empty(){
        System.out.print("Is Empty : ");
        System.out.println(head == null);
    }

    public void printList(){
        System.out.print("List is ");
        Node node = head;

        while (node != null){
            System.out.print(node.value + ", ");
            node = node.next;
        }

        System.out.println();
    }
}
