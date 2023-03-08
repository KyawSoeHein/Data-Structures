public class SinglyLinkedList {
    private Node head = null;

    private class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    private Node getTheLastNode(){
        Node node = head;

        if (node != null){
            while (node.next != null){
                node = node.next;
            }
        }

        return node;
    }

    public void pushFront(int value){
        System.out.println("Pushed front");
        Node newNode = new Node(value);

        if (head == null){
            head = newNode;
            newNode.next = null;
        } else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }

    public void topFront(){
        System.out.println("Top Front is " + head.value);
    }

    public void popFront(){
        System.out.println("Popped front");
        head = head.next;
        printList();
    }

    public void popBack(){
        System.out.println("Popped Back");
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

    public void findNode(int value){
        System.out.println("Finding Node");
        Node node = head;
        boolean found = false;

        if (node != null){
            while (node.next != null){
                if (node.value == value){
                    System.out.println("Found the value");
                    found = true;
                    break;
                }
                node = node.next;
            }

            if (!found){
                if (node.value == value){
                    System.out.println("Found the value");
                } else {
                    System.out.println("Didn't find the value");
                }
            }
        }
    }

    public void pushBack(int value){
        System.out.println("Pushed back");
        Node newNode = new Node(value);
        newNode.next = null;

        getTheLastNode().next = newNode;
        printList();
    }

    public void topBack(){
        System.out.println("Top Back is " + getTheLastNode().value);
    }

    public void reverse(){
        System.out.println("Reversing");
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current.next != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        current.next = prev;
        head = current;
        printList();
    }

    public void printList(){
        Node node = head;

        System.out.print("List is ");
        if (node != null){
            while (node.next != null){
                System.out.print(node.value + ", ");
                node = node.next;
            }
            System.out.println(node.value);
        }
    }
}
